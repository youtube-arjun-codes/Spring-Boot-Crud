/**
 * @author Arjun Gautam
 * Project :springboot-crud
 * Date : 2021-06-11
 */
package com.arjuncodes.springbootcrud.repository;

import com.arjuncodes.springbootcrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
