package org.py.mymodule.submodule.service.impl;

import org.py.mymodule.submodule.entity.Ur;
import org.py.mymodule.submodule.mapper.UrMapper;
import org.py.mymodule.submodule.service.IUrService;
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
public class UrServiceImpl extends ServiceImpl<UrMapper, Ur> implements IUrService {

}
