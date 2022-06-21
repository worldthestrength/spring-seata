package com.example.springseata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="baidu", url = "https://www.baidu.com")
public interface BaiDuFeign {


    @GetMapping("/s")
    String search(@RequestParam String wd);

}
