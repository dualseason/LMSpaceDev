package edu.lingnan.service;

import edu.lingnan.entity.Teacher;

import java.util.List;

public interface TeacherService {
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
