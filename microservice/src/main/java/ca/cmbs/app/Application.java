package ca.cmbs.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@PropertySource(value = {"file:${HOME}/conf/properties/pgdb.properties"})
@ComponentScan(basePackages = "ca.cmbs")
public class Application {

    public static void main(String... args) throws Exception {
//        System.out.println("CWD: " + System.getProperty("user.dir"));
        SpringApplication.run(Application.class, args);

    }
}

