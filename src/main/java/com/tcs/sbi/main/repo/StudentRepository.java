package com.tcs.sbi.main.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.sbi.main.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	Optional<Student> findById(Integer id);
}
