package cqut.yook.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cqut.yook.dao.UserDao;
import cqut.yook.entity.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public List<User> selectUser() {
		return getSqlSession().selectList("cqut.yook.mapper.UserMapper.selectUser");
	}
}
