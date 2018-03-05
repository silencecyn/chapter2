package com.silence.service;

import com.silence.dao.UserDao;
import com.silence.domain.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<TUser> showAllUser(){
        return userDao.showAllUser();
    }
}
