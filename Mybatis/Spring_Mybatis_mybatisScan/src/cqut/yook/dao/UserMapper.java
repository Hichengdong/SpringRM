package cqut.yook.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cqut.yook.entity.User;

public interface UserMapper {
	@Select("select * from user")
	public List<User> selectUser();
}
