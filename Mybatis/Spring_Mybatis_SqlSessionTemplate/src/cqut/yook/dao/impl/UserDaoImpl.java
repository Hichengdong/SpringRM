package cqut.yook.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cqut.yook.dao.UserDao;
import cqut.yook.entity.User;

public class UserDaoImpl implements UserDao {
	private SqlSessionTemplate sqlSession;

	@Override
	public List<User> selectUser() {
		return sqlSession.selectList("cqut.yook.mapper.UserMapper.selectUser");
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
}
