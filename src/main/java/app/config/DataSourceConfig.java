package app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DataSourceConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("ueducation");
		dataSource.setUrl(
				"jdbc:mysql://127.0.0.1:3306/anand_test_db?createDatabaseIfNotExist=true");
		return dataSource;
	}

//	@Bean
//	public Properties additionalProperties() { TODO : check why properties are not getting applied when defining a bean but works fine when defined in appication.yml
//		Properties properties = new Properties();
//		properties.setProperty("spring.jpa.hibernate.ddl-auto", "create-drop");
//		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
//
//		return properties;
//	}

}
