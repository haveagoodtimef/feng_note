package com.feng.note.dao;

import com.feng.note.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String cnUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String cnUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}