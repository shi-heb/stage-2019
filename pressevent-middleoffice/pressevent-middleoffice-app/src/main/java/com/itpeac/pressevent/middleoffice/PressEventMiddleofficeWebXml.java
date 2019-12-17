package com.itpeac.pressevent.middleoffice;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.itpeac.pressevent.middleoffice.configuration.DefaultProfileUtil;

public class PressEventMiddleofficeWebXml extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        /**
         * set a default to use when no profile is configured.
         */
        DefaultProfileUtil.addDefaultProfile(application.application());
        return application.sources(PressEventMiddleofficeBootstrapApplication.class);
    }
}