package com.cg.Spring_Boot_Rest_API_crud_Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Spring_Boot_Rest_API_crud_Project.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
