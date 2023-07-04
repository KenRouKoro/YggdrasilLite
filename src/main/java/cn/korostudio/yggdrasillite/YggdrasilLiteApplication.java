package cn.korostudio.yggdrasillite;

import cn.korostudio.yggdrasillite.test.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("cn.korostudio.yggdrasillite")
public class YggdrasilLiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(YggdrasilLiteApplication.class, args);
    }
}
