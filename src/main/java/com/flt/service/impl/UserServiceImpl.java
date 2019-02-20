package com.flt.service.impl;

import com.flt.model.User;
import com.flt.service.IUserService;
import org.springframework.stereotype.Service;


/**
 * @author fenglingtong
 * @date 2018/7/23
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Override
    public User selectUser(long userId) {
        return null;
    }
}
