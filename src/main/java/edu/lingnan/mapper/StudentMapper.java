package edu.lingnan.mapper;

import edu.lingnan.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    /**
     * 查找一个学生
     * @param id
     * @return
     */
    Student findOne(@Param("id") String id);

    /**
     * 查找所有学生
     * @return
     */
    List<Student> findAll();
}
