package edu.lingnan.service.impl;

import edu.lingnan.entity.Teacher;
import edu.lingnan.mapper.TeacherMapper;
import edu.lingnan.service.TeacherService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired(required = false)
    private TeacherMapper teacherMapper;

    @Override
    public Teacher verifyLogin(Teacher teacher) {
        return teacherMapper.verifyLogin(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> all = teacherMapper.findAll();
        return all;
    }
}
