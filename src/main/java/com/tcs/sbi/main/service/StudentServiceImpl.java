package com.tcs.sbi.main.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.tcs.sbi.main.entity.Student;
import com.tcs.sbi.main.exception.ResourceNotFoundException;
import com.tcs.sbi.main.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;

	public StudentServiceImpl() {
	}
	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public void findById(Integer id) {
		Student student = repository.findById(id).orElseThrow(null);
		if (student != null) {
			downloadReport(student);
		} else {
			throw new ResourceNotFoundException("Student not found" + id);
		}
	}

	@Override
	public String addStudent(Student student) {

		repository.save(student);
		return "Record added successfully";
	}
	public static void downloadReport(Student student)
	{
		String filePath="C:\\Users\\Kiran Lohare\\Downloads\\StudentReport.pdf";
		Document document=new Document();
		
		try 
		{
		 	PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			
			PdfPTable table=new  PdfPTable(4);
			
			PdfPCell c1=new PdfPCell(new Phrase("Subjects"));
			table.addCell(c1);
			
			PdfPCell c2=new PdfPCell(new Phrase("Total Marks"));
			table.addCell(c2);
			PdfPCell c3=new PdfPCell(new Phrase("Obtained Marks"));
			table.addCell(c3);
				
			PdfPCell c4=new PdfPCell(new Phrase("Status"));
			table.addCell(c4);
			
			table.setHeaderRows(1);
			table.addCell(String.valueOf(student.getMarathi()));
			table.addCell(String.valueOf(student.getHindi()));
			table.addCell(String.valueOf(student.getEnglish()));
			table.addCell(String.valueOf(student.getSocialScience()));
			table.addCell(String.valueOf(student.getBiology()));
			table.addCell(String.valueOf(student.getMaths()));
			table.addCell(String.valueOf(student.getPhysics()));
			table.addCell(String.valueOf(student.getChemistry()));
			
			
			document.add(table);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (DocumentException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Done");
			document.close();
		}
	}
}
