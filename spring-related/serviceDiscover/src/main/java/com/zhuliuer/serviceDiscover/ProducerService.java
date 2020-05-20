package com.zhuliuer.serviceDiscover;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "ServiceProducer")
public interface ProducerService {

    @GetMapping("/hello")
     String hello();
}
