package com.test.cxf.service;

import com.test.cxf.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Justyn
 * @date 2018/10/13 10:22
 */
@WebService
public interface UserService {

    /**
     * webservice方法
     *
     * @param
     * @return
     * @author Justyn
     * @date 2018/10/13 10:24
     */
    @WebMethod
    User getUser(@WebParam(name = "userId") Integer userId);

    @WebMethod
    @WebResult(name = "String")
    String getUserName(@WebParam(name = "userId") Integer userId);
}
