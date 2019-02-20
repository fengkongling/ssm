package com.flt.service;

import com.flt.model.User;

/**
 * @author fenglingtong
 * @date 2018/7/23
 */
public interface IUserService {

    User selectUser(long userId);
}
