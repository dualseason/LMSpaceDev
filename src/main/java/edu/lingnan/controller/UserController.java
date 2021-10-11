package edu.lingnan.controller;

import edu.lingnan.entity.User;
import edu.lingnan.service.UserService;
import edu.lingnan.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**查找一个用户*/
    @GetMapping("/findOne/{id}")
    public Result findOne(@PathVariable Integer id) {
        User user = userService.findOne(id);
        return new Result("200", user, "操作成功");
    }

    /**查找所有用户*/
    @GetMapping("/findAll")
    public Result findAll() {
        List<User> users = userService.findAll();
        return new Result("200", users, "操作成功");
    }

    /**添加一个用户*/
    @PostMapping("/save")
    public Result save(@RequestBody User user) {
        Integer rows = userService.save(user);
        if (rows > 0) {
            return new Result("200", rows, "操作成功");
        } else {
            return new Result("200", rows, "操作失败");
        }
    }

    /**删除一个用户*/
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        Integer rows = userService.delete(id);
        if (rows > 0) {
            return new Result("200", rows, "操作成功");
        } else {
            return new Result("0", rows, "操作失败");
        }
    }

    /**修改一个用户*/
    @PostMapping("/update")
    public Result update(@RequestBody User user) {
        Integer rows = userService.update(user);
        if (rows > 0) {
            return new Result("200", rows, "操作成功");
        } else {
            return new Result("0", rows, "操作失败");
        }
    }
}
