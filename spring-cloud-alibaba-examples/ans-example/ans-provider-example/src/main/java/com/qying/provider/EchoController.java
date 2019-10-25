package com.qying.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author qying
 * @date 2019/10/25 11:05
 */
@RestController
public class EchoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoController.class);

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET, produces = "application/json")
    public String echo(@PathVariable String str) {
        LOGGER.info("-----------收到消费者请求-----------");
        LOGGER.info("收到消费者传递的参数：" + str);
        String result = "Nice21 to meet you, too.";
        LOGGER.info("提供者返回结果：" + result);
        return result;
    }

}
