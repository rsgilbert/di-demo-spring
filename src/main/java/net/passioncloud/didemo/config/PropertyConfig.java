package net.passioncloud.didemo.config;

import net.passioncloud.didemo.FakeDataSource;
import net.passioncloud.didemo.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:datasource.properties")
@PropertySource("classpath:jms.properties")
public class PropertyConfig {
    @Autowired
    Environment env;

    // below annotation gets value out of the application context as an externalized property
    // Uses spring expression language to find the value (uses ${})
    @Value("${passioncloud.username}")
    private String user;

    @Value("${passioncloud.password}")
    private String password;

    @Value("${passioncloud.dburl}")
    private String url;

    @Value("${jms.username}")
    private String jmsUser;

    @Value("${jms.password}")
    private String jmsPassword;

    @Value("${jms.dburl}")
    private String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        fakeJmsBroker.setUser(jmsUser);
        return fakeJmsBroker;
    }



}
