package com.flt.dao;

import com.flt.model.User;

/**
 * @author fenglingtong
 * @date 2018/7/23
 */
public interface IUserDao {
    User selectUser(long id);
}
