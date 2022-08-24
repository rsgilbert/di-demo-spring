package net.passioncloud.didemo.config;

import net.passioncloud.didemo.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    // below annotation gets value out of the application context as an externalized property
    // Uses spring expression language to find the value (uses ${})
    @Value("${passioncloud.username}")
    private String user;

    @Value("${passioncloud.password}")
    private String password;

    @Value("${passioncloud.dburl}")
    private String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);
        return fakeDataSource;
    }



}
