package org.mengsoft.admin.service;

import org.mengsoft.admin.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author menglingjun
* @description 针对表【sys_user】的数据库操作Service
* @createDate 2022-12-13 15:19:08
*/
public interface SysUserService extends IService<SysUser> {
    public List<SysUser> getAllUser();
}
