package com.sch.smp_school.service.impl;

import com.sch.smp_school.entity.Users;
import com.sch.smp_school.mapper.UsersMapper;
import com.sch.smp_school.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hao
 * @since 2023-11-24
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
