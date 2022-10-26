package com.example.resumecreatorproject.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 6:44 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

public class TemplateUtils {

    private static Configuration configuration;

    private TemplateUtils() {
    }

    public static void setConfiguration(Configuration configuration) {
        TemplateUtils.configuration = configuration;
    }

    public static Template getTemplate(String templateName) {

        try {
            if (!templateName.endsWith(".ftl"))
                templateName = templateName + ".ftl";
            return configuration.getTemplate(templateName);
        } catch (IOException e) {
            throw new RuntimeException("Template not found");
        }
    }


}
