package com.kloudtek.mule.module.springboot.internal;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class SpringBootModuleOperations {
    @MediaType(value = ANY, strict = false)
    public String cli(@Config SpringBootModuleConfiguration configuration, String person) {
        return "Hello " + person;
    }
}
