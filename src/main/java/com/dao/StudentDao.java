package com.dao;

import com.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    Student FindById(@Param("myid") int id ,@Param("myage") int age);
    List<Student> FindStudentByTeacher(int tid);
    Student selectByIf(@Param("ByIfID") int id,@Param("ByIfNAME") String name);
}
