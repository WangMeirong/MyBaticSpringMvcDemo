package my.demo.service.impl;

import javax.annotation.Resource;

import my.demo.dao.IUserDao;
import my.demo.model.User;
import my.demo.service.IUserService;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
