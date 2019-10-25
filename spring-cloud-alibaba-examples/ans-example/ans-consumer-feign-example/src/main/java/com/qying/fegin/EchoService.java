package com.qying.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类描述：
 *
 * @author qying
 * @date 2019/10/25 10:50
 */
@FeignClient(value = "ans-provider")
public interface EchoService {

    @RequestMapping(path = "echo/{str}")
    String echo(@RequestParam("str")String str);
}
