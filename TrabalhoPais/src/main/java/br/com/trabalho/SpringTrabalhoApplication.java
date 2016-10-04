package br.com.trabalho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author joao vitor
 */

@SpringBootApplication
@EntityScan(basePackages = {
              "br.com.trabalho.model"
              })
@EnableJpaRepositories(basePackages = {
              "br.com.trabalho.repository"
              })
public class SpringTrabalhoApplication {
   
	public static void main(String[] args) {
		SpringApplication.run(SpringTrabalhoApplication.class, args);
	}
}
