package com.example.resumecreatorproject.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 6:43 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Configuration
public class FreemarkerConfigurer {

    @Bean
    public FreeMarkerConfigurationFactoryBean configuration() {
        FreeMarkerConfigurationFactoryBean bean = new FreeMarkerConfigurationFactoryBean();
        bean.setTemplateLoaderPath("classpath:/templates/");
        return bean;
    }
}
