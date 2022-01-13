package com.addtech.madrasti.repositories;

import com.addtech.madrasti.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher,Long> {

    Teacher findTeacherByFirstNameAndAndLastName(String firstName,String lastName);
}
