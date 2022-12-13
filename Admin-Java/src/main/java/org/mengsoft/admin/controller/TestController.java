package org.mengsoft.admin.controller;


import org.mengsoft.admin.entity.SysUser;
import org.mengsoft.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value="/getAllUser", method= RequestMethod.GET, produces="application/json")
    public List<SysUser> getUserList(){
        return sysUserService.list();
    }

}
