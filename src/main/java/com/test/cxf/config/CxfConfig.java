package com.test.cxf.config;

import com.test.cxf.service.UserService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

/**
 * webservice配置类
 *
 * @author Justyn
 * @date 2018/10/13 10:45
 */
@Configuration
public class CxfConfig {

    /**
     * bus是cxf的支架，它主要担当扩展及拦截器提供者的角色。
     */
    @Resource
    private Bus bus;

    @Resource
    private UserService userService;

    /**
     * 发布服务
     *
     * @return
     * @author Justyn
     * @date 2018/10/13 11:09
     */
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, userService);
        // userService的路径
        endpoint.publish("/user");
        return endpoint;
    }
}
