package cc.sirrus.yggdrasillite.yggdrasapi.controller.auth;

import cc.sirrus.yggdrasillite.databaseio.pojoservice.UserRepository;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/authserver")
@Slf4j
public class AuthController {

    private UserRepository userRepository;

    /*

     */
    @PostMapping(value = "/authenticate", produces = "application/json;charset=UTF-8")
    public String authenticate(@RequestBody JSONObject params, HttpServletRequest request) {
        return params.toString();
    }

    @PostMapping(value = "/refresh", produces = "application/json;charset=UTF-8")
    public String refresh(@RequestBody JSONObject params, HttpServletRequest request) {
        return params.toString();
    }

    @PostMapping(value = "/validate", produces = "application/json;charset=UTF-8")
    public String validate(@RequestBody JSONObject params, HttpServletRequest request) {
        return params.toString();
    }

    @PostMapping(value = "/invalidate", produces = "application/json;charset=UTF-8")
    public String invalidate(@RequestBody JSONObject params, HttpServletRequest request) {
        return params.toString();
    }

    @PostMapping(value = "/signout" )
    public String signout(@RequestBody JSONObject params, HttpServletRequest request) {
        return params.toString();
    }
    @GetMapping("/getUsers")
    public String getUsers(){
        return JSONUtil.parseArray(userRepository.findAll()).toString();
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
