package eureka.server.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerBankApplication.class, args);
	}

}
