package com.kloudtek.mule.module.springboot.internal;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.api.lifecycle.Startable;
import org.mule.runtime.api.lifecycle.Stoppable;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.exception.ModuleException;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(SpringBootModuleOperations.class)
@ConnectionProviders(SpringBootModuleConnectionProvider.class)
@ErrorTypes(SpringBootError.class)
public class SpringBootModuleConfiguration implements Startable, Stoppable {
    @Parameter
    private String appClass;

    public String getAppClass() {
        return appClass;
    }

    @Override
    public void start() throws MuleException {
        try {
            Class<?> appClass = Class.forName(appClass);
//            SpringApplication.run(MDRoissyApplication.class, args);
        } catch (ClassNotFoundException|IllegalAccessException e) {
            throw new ModuleException("Class "+appClass+" not found", SpringBootError.INVALID_APP_CLASS, e);
        } catch (InstantiationException e) {
            throw new ModuleException("Class "+appClass+" failed to start", SpringBootError.APP_START_FAIL, e);
        }
    }

    @Override
    public void stop() throws MuleException {
        System.out.println();
    }
}
