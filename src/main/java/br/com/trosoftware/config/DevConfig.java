package br.com.trosoftware.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.trosoftware.domain.idm.IDMConfig;
import br.com.trosoftware.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;
	
	@Bean
	public boolean instanciaDB() {
		if(value.equals(IDMConfig.DDL_AUTO_HIBERNATE_CREATE))
		{
			this.dbService.instanciaDB();
		}
		return false;
	}
	
}
