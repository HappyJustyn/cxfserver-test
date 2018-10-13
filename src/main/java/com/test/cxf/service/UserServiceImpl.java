package com.test.cxf.service;

import com.test.cxf.entity.User;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

/**
 * 接口实现类
 *
 * @author Justyn
 * @date 2018/10/13 10:33
 */
@WebService(serviceName = "UserService", // 对外发布的服务名
            targetNamespace = "http://service.cxf.test.com/", // 制定想要的命名空间
            endpointInterface = "com.test.cxf.service.UserService") // 服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@Component
public class UserServiceImpl implements UserService {

    private Map<Integer, User> userMap = new HashMap<>();
    public UserServiceImpl() {
        System.out.println("向实体类插入数据");
        User user = new User();
        user.setUserId(1);
        user.setUserName("test1");
        user.setEmail("maplefix@163.xom");
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId(2);
        user.setUserName("test2");
        user.setEmail("maplefix@163.xom");
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId(3);
        user.setUserName("test3");
        user.setEmail("maplefix@163.xom");
        userMap.put(user.getUserId(), user);
    }

    @Override
    public User getUser(Integer userId) {
        return userMap.get(userId);
    }

    @Override
    public String getUserName(Integer userId) {
        return userMap.get(userId).getUserName();
    }

}
