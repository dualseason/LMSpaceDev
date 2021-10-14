package edu.lingnan.controller;

import edu.lingnan.entity.Student;
import edu.lingnan.service.StudentService;
import edu.lingnan.vo.Result;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@CrossOrigin
@RestController
@RequestMapping("/student")
@Api
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查找一个学生
     * @param id
     * @return
     */
    @GetMapping("/findOne/{id}")
    public Result findOne(@PathVariable("id") String id){
        System.out.println("id=>"+id);
        Student one = studentService.findOne(id);
        if (one!=null){
            return new Result("200",one,"操作成功");
        }
        return new Result("0",null,"操作失败");
    }
    @GetMapping("/findAll")
    public Result findAll(){
        List<Student> all = studentService.findAll();
        if (all!=null&&all.size()>0){
            return new Result("200",all,"操作成功");
        }
        return new Result("0",null,"操作失败");
    }
}
