package io.pivotal.stubrunner;

import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CfStubRunnerConfiguration {

    @Bean
    @Primary
    public StubRunnerProperties build(){
        StubRunnerProperties props = new StubRunnerProperties();

        props.setStubsMode(StubRunnerProperties.StubsMode.REMOTE);
        props.setHttpServerStubConfigurer(HttpStubConfigurer.class);

        return props;
    }


}
