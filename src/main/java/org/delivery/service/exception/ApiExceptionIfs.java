package org.delivery.service.exception;

import org.delivery.service.api.error.ErrorCodeIfs;

public interface ApiExceptionIfs {

    ErrorCodeIfs getErrorCodeIfs();
    String getErrorDescription();

}
