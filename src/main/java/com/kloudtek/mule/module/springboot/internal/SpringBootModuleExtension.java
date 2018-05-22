package com.kloudtek.mule.module.springboot.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "spring-boot-module")
@Extension(name = "Spring Boot Module")
@Configurations(SpringBootModuleConfiguration.class)
public class SpringBootModuleExtension {

    public SpringBootModuleExtension() {
        System.out.println();
    }

    @PostConstruct
    public void init() {
        System.out.println();
    }

    @PreDestroy
    public void x() {
        System.out.println();
    }
}
