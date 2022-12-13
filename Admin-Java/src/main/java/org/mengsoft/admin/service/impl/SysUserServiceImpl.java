package org.mengsoft.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.admin.entity.SysUser;
import org.mengsoft.admin.service.SysUserService;
import org.mengsoft.admin.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author menglingjun
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2022-12-13 15:19:08
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

//    @Autowired
//    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getAllUser() {
        return null;
    }
}




