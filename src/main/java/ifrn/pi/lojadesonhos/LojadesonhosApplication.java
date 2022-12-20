package ifrn.pi.lojadesonhos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LojadesonhosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojadesonhosApplication.class, args);
	}

}
