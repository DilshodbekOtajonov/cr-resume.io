package com.example.resumecreatorproject.configs;

import com.example.resumecreatorproject.utils.TemplateUtils;
import freemarker.template.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 6:52 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Component
@RequiredArgsConstructor
public class StaticContextInitializer {

    private final Configuration configuration;

    @PostConstruct
    public void init() {
        TemplateUtils.setConfiguration(configuration);
    }
}
