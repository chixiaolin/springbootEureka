package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springbootEureka
 * @description:
 * @author: Chixiaolin
 * @create: 2021-12-08 09:51
 **/
@SpringBootApplication
@EnableEurekaServer
public class ConsumerClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerClientApplication.class, args);
    }

}
