package hello;

import hello.config.MyDataSourceConfig;
import hello.config.MyDataSourceConfigV1;
import hello.config.MyDataSourceValueConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

@Import(MyDataSourceConfigV1.class)
//@Import(MyDataSourceValueConfig.class)
@ConfigurationPropertiesScan(basePackages = {"hello.datasource"})
@SpringBootApplication(scanBasePackages = {"hello.datasource"})
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}
