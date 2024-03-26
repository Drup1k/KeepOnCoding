package KeepOnCoding.DynamicApp.config;

import KeepOnCoding.DynamicApp.common.Coach;
import KeepOnCoding.DynamicApp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aqua")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
