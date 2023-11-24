package com.sch.smp_school.controller;


import com.sch.smp_school.cr.Result;
import com.sch.smp_school.entity.Users;
import com.sch.smp_school.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hao
 * @since 2023-11-24
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService usersService;
//    获取所有用户
    @GetMapping("/list")
    public Result<List<Users>> getAllUsers(){
        return Result.success(usersService.list());
    }
}
