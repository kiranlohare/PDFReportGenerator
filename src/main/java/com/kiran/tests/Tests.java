package com.kiran.tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Tests 
{
	Document document;
	public static void main(String[] args) 
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
			table.addCell("Marathi");
			table.addCell("10");
			table.addCell("20");
			table.addCell("30");
			
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
