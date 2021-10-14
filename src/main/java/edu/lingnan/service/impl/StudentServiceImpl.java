package edu.lingnan.service.impl;

import edu.lingnan.entity.Student;
import edu.lingnan.mapper.StudentMapper;
import edu.lingnan.service.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired(required = false)
    private StudentMapper studentMapper;

    @Override
    public Student findOne(String id) {
        return studentMapper.findOne(id);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
