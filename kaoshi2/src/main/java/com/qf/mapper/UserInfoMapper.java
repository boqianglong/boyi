package com.qf.mapper;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;

import java.util.List;

public interface UserInfoMapper {

public List<UserInfo> selectUserInfo();

public void deleteUserInfo(int id);

public UserInfo selectOneUserInfo(UserInfo userInfo);

public void updateUserInfo(UserInfo userInfo);

public List<UserInfo> selectLikeUserInfo(String message);

public void insertUserInfo(UserInfo userInfo);

//登录
public List<UserInfo> selectUserInfoBy(UserInfo userInfo);
//注册
public void regUserInfoVo(UserInfoVo userInfoVo);
}
