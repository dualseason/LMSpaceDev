package edu.lingnan.mapper;

import edu.lingnan.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    /**
     * 验证登录（用户登录）
     * @param teacher
     * @return
     */
    Teacher verifyLogin(Teacher teacher);

    /**
     * 查找所有教师
     * @return
     */
    List<Teacher> findAll();
}
