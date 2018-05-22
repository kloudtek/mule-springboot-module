package com.kloudtek.mule.module.springboot.internal;

import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

public enum SpringBootError implements ErrorTypeDefinition<SpringBootError> {
    INVALID_APP_CLASS, APP_START_FAIL
}
