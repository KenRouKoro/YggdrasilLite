package cn.korostudio.yggdrasillite.yggdras_api.sessionserver;

import cn.hutool.json.JSONObject;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/sessionserver")
@Slf4j
public class SessionController {
    @PostMapping(value = "/session/minecraft/join", produces = "application/json;charset=UTF-8")
    public String join(@RequestBody JSONObject params, HttpServletRequest request){
        return params.toString();
    }
    @GetMapping("/session/minecraft/test")
    public String test(){
        return "test";
    }
}
