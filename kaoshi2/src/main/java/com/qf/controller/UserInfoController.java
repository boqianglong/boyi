package com.qf.controller;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("getAllUserInfo")
    public Object getAllUserInfo(){
        return userInfoService.selectUserInfo();
    }
    //删除
    @RequestMapping("delUserInfo")
    public void deleteUserInfo(@RequestParam int id){
        this.userInfoService.deleteUserInfo(id);
    }
    //登录
//    @RequestMapping("checkLogin")
//    @ResponseBody
//    public boolean checkUserInfo(@RequestParam String username, @RequestParam String password) {
//        System.out.println("username=" + username + ",password=" + password);
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername(username);
//        userInfo.setPassword(password);
//        this.userInfoService.checkUserLogin(userInfo);
//        return true;
//    }
    //新增
    @RequestMapping(value="insertUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Boolean insertUserInfo(@RequestBody UserInfo userInfo){
        this.userInfoService.insertUserInfo(userInfo);
        System.out.println(userInfo);
        return true;
    }
    //先查
    @RequestMapping("selOneUserInfo")
    @ResponseBody
    public Object selOneUserInfo(@RequestParam int id){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        UserInfo user= userInfoService.selectOneUserInfo(userInfo);
        return user;
    }
    //后改
    @RequestMapping(value = "updateUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public boolean updateUserInfo(@RequestBody UserInfo userInfo){
        userInfoService.updateUserInfo(userInfo);
        System.out.println(userInfo);
        return true;
    }

    //注册
    @ResponseBody
    @RequestMapping(value ="register", method = RequestMethod.POST)
    public boolean doRegister(@Valid @RequestBody UserInfo userInfo, BindingResult result, ModelMap map){

        if(result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError error:
                    fieldErrors) {
                System.out.println(error.getField()+":"+error.getDefaultMessage());
                map.put("ERR"+error.getField(),error.getDefaultMessage());
            }
            return false;
        }

        userInfoService.insertUserInfo(userInfo);
        System.out.println(userInfo);
        return true;
    }
    @RequestMapping(value = ("regUserInfo"),method = RequestMethod.POST)
    @ResponseBody
    public boolean regUserInfo(@RequestBody UserInfoVo userInfoVo){




         userInfoService.regUserInfo(userInfoVo);

        return true;
    }
    //模糊查询
    @RequestMapping(value = "likeUserInfo")
    @ResponseBody
    public Object likeUserInfo(@RequestParam String message){

        System.out.println(message);
        return userInfoService.selectLikeUserInfo(message);

    }
}
