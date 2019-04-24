package com.qf.test;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class main {

    public static void main(String[] args) {
       ApplicationContext context =new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
       UserInfoService userService = context.getBean(UserInfoService.class);
  //     userService.deleteUserInfo(4);
//      List<UserInfo> userInfos = userService.selectLikeUserInfo("a");
//       System.out.println(userInfos);
//        UserInfoVo userInfoVo = new UserInfoVo();
//        userInfoVo.setUsername("adff");
//        userInfoVo.setPassword("123456");
//        userInfoVo.setState("sss");
//        userInfoVo.setIdCard("7777777777777");
//        userService.regUserInfo(userInfoVo);
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername("aaa");
//        userInfo.setPassword("1111");
//        userInfo.setState("www");
//        userInfo.setIdCard("66666666666666666");
//        userService.insertUserInfo(userInfo);
        UserInfo userInfo = new UserInfo();
        userInfo.setGoodsTitle("caonima");
       userInfo.setGoodsName("000000");
       userInfo.setBasePrice(255);
        userInfo.setPrice(2555);
        userInfo.setCostPrice(5888);
        userInfo.setGoodsHot(0);
        userInfo.setGoodsDesc("sdggg");
        userInfo.setStockNum(45);
        userInfo.setStatus("sgg");

        userService.insertUserInfo(userInfo);

//        UserInfo userInfo = new UserInfo();
//        userInfo.setId(2);
//        UserInfo userInfo1 = userService.selectOneUserInfo(userInfo);
//        System.out.println(userInfo1);
//        userInfo.setState("赵云");
//        userInfo.setPassword("888888");
//        userService.updateUserInfo(userInfo);
//            UserInfo userInfo = new UserInfo();
//            userInfo.setUsername("admin");
//            userInfo.setPassword("123456");
//
//        System.out.println(userInfo);

    }
}
