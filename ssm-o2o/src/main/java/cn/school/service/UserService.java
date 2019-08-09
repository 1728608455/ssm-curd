package cn.school.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.school.dao.UserDao;
import cn.school.model.User;

@Service
public class UserService implements UserDao{
	@Resource
	UserDao userDao;

	@Override
	public User selectById(int userid) {
		// TODO Auto-generated method stub
		return userDao.selectById(userid);
	}

}
