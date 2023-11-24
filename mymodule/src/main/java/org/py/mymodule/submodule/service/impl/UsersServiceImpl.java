package org.py.mymodule.submodule.service.impl;

import org.py.mymodule.submodule.entity.Users;
import org.py.mymodule.submodule.mapper.UsersMapper;
import org.py.mymodule.submodule.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2023-11-24
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
