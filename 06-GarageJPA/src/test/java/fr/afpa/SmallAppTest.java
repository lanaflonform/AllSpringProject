package fr.afpa;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import fr.afpa.Application;

@SpringBootApplication
@EntityScan(basePackages = {"fr.afpa"})
public class SmallAppTest implements CommandLineRunner{
	
	private Log log = LogFactory.getLog(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SmallAppTest.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("");		
	}

}