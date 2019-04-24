package com.qf.service.impl;


import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
@Autowired
    UserInfoMapper userInfoMapper;


    public List<UserInfo> selectUserInfo() {
        List<UserInfo> userInfos = userInfoMapper.selectUserInfo();
        return userInfos;
    }

    public void deleteUserInfo(int id) {
        this.userInfoMapper.deleteUserInfo(id);
    }

    public UserInfo selectOneUserInfo(UserInfo userInfo) {
        return userInfoMapper.selectOneUserInfo(userInfo);
    }

    public List<UserInfo> selectLikeUserInfo(String message) {
        return userInfoMapper.selectLikeUserInfo(message);
    }

    public void updateUserInfo(UserInfo userInfo) {
        this.userInfoMapper.updateUserInfo(userInfo);
    }

    public void insertUserInfo(UserInfo userInfo) {
        userInfoMapper.insertUserInfo(userInfo);
    }

    public boolean checkUserLogin(UserInfo userInfo) {
        List<UserInfo> userInfos = userInfoMapper.selectUserInfoBy(userInfo);
        if(userInfos!=null && userInfos.size()>0){
            return true;
        }
        return false;
    }

    public UserInfoVo regUserInfo(UserInfoVo userInfoVo) {
         userInfoMapper.regUserInfoVo(userInfoVo);
        return userInfoVo;
    }
}
