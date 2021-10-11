package edu.lingnan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.lingnan.entity.Teacher;
import edu.lingnan.service.TeacherService;
import edu.lingnan.vo.Request;
import edu.lingnan.vo.Result;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@CrossOrigin
@RestController
@RequestMapping("/teacher")
@Api
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/verifyLogin")
    public Result verifyLogin(@RequestBody Request request){
        Object data1 = request.getData();
        ObjectMapper mapper = new ObjectMapper();
        Teacher data = mapper.convertValue(data1, Teacher.class);
        Teacher teacher = teacherService.verifyLogin(data);
        if (teacher==null){
            return new Result("0", "", "操作失败");
        }
        return new Result("200",teacher,"操作成功");
    }
    @GetMapping("/findAll")
    public Result findAll(){
        List<Teacher> all = teacherService.findAll();
        if (all.size()>0){
            return new Result("200",all,"操作成功");
        }
        return new Result("0","","操作失败");
    }
}
