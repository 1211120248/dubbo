package com.github.customer;

import com.github.api.IUserService;
import com.github.api.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserConsumerLoadBalance {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-consumer.xml"});
        context.start();
        while (true){
            //获取服务代理
            IUserService userService = (IUserService) context.getBean("userService");
            User user = userService.findById("1");
            System.out.println(user);
            Thread.sleep(2000);
        }

    }
}
