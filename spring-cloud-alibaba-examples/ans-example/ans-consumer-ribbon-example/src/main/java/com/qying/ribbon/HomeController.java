package com.qying.ribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述：
 *
 * @author qying
 * @date 2019/10/25 11:01
 */
@RestController
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String home(){
        LOGGER.info("-----------------consumer调用开始-----------------");
        String param = "Nice to meet you.11";
        LOGGER.info("消费者传递参数：" + param);
        String result = restTemplate.getForObject("http://ans-provider/echo/" + param, String.class);
        LOGGER.info("收到提供者响应：" + result);
        return result;
    }

}
