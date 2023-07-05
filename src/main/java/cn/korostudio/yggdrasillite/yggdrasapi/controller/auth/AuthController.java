package cn.korostudio.yggdrasillite.yggdrasapi.controller.auth;

import cn.hutool.json.JSONObject;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/authserver")
@Slf4j
public class AuthController {

    /*

     */
    @PostMapping(value = "/authenticate", produces = "application/json;charset=UTF-8")
    public String authenticate(@RequestBody JSONObject params, HttpServletRequest request){
        return params.toString();
    }
    @PostMapping(value = "/refresh", produces = "application/json;charset=UTF-8")
    public String refresh(@RequestBody JSONObject params, HttpServletRequest request){
        return params.toString();
    }
    @PostMapping(value = "/validate", produces = "application/json;charset=UTF-8")
    public String validate(@RequestBody JSONObject params, HttpServletRequest request){
        return params.toString();
    }
    @PostMapping(value = "/invalidate", produces = "application/json;charset=UTF-8")
    public String invalidate(@RequestBody JSONObject params, HttpServletRequest request){
        return params.toString();
    }
    @PostMapping(value = "/signout", produces = "application/json;charset=UTF-8")
    public String signout(@RequestBody JSONObject params, HttpServletRequest request){
        return params.toString();
    }
}
