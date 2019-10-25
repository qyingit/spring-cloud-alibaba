package com.qying.local;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author qying
 * @date 2019/10/25 10:32
 */
@RestController
public class EchoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoController.class);

    @Value("user.id")
    private String userId;

    @RequestMapping("/test")
    public String echo(){
        LOGGER.info("User id is " + userId);
        return userId;
    }
}
