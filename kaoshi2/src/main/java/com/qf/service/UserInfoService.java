package com.qf.service;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;

import java.util.List;

public interface UserInfoService {

    public List<UserInfo> selectUserInfo();

    public void deleteUserInfo(int id);

    public UserInfo selectOneUserInfo(UserInfo userInfo);

    public List<UserInfo> selectLikeUserInfo(String message);

    public void updateUserInfo(UserInfo userInfo);

    public void insertUserInfo(UserInfo userInfo);

    public boolean checkUserLogin(UserInfo userInfo);

    public UserInfoVo regUserInfo(UserInfoVo userInfoVo);
}
