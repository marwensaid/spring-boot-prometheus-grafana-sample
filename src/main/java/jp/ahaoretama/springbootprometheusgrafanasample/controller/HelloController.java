package jp.ahaoretama.springbootprometheusgrafanasample.controller;

import io.prometheus.client.spring.web.PrometheusTimeMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sekineyasufumi on 2018/02/21.
 */
@RestController
public class HelloController {

    // TODO expose an endpoint like /hello
    // TODO expose a prometheus metric here (metric for timeout)
    public String sayHello() {
        return "hello";
    }
}
