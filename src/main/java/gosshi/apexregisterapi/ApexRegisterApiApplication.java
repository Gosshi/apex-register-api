package gosshi.apexregisterapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("gosshi.apexregisterapi.domain")
@EnableJpaRepositories("gosshi.apexregisterapi.repository")
public class ApexRegisterApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApexRegisterApiApplication.class, args);
    }

}
