package cn.opm.mybatis.service.impl;

import cn.opm.mybatis.entity.User;
import cn.opm.mybatis.mapper.UserMapper;
import cn.opm.mybatis.service.IBaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IBaseService {
}
