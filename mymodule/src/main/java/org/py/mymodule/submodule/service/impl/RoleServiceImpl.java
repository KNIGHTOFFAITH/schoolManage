package org.py.mymodule.submodule.service.impl;

import org.py.mymodule.submodule.entity.Role;
import org.py.mymodule.submodule.mapper.RoleMapper;
import org.py.mymodule.submodule.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
