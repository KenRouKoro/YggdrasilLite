package cn.korostudio.yggdrasillite.test;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/data")
@Slf4j
public class TestController {
    @GetMapping("/test/{id}")
    public String hello(@RequestParam("param") String param, @PathVariable("id") String id, HttpServletRequest request){
        log.info("param={},id={},request={}",param,id,request);
        return "Hello";
    }
}
