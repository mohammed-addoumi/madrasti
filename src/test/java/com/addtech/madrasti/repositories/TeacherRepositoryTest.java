package com.addtech.madrasti.repositories;

import com.addtech.madrasti.domain.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    private Teacher teacher;

    @BeforeEach
    void init(){
        teacher = new Teacher();
        teacher.setId(1L);
        teacher.setFirstName("mohammed");
        teacher.setLastName("addoumi");
    }


    @Test
    void should_return_teacher_with_name_mohammed_when_giving_id_1(){
        Teacher teacherReturned = teacherRepository.findById(1L).orElse(null);
        assertEquals(teacherReturned,teacher);

    }

}