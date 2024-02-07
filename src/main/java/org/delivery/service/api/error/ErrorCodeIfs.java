package org.delivery.service.api.error;

public interface ErrorCodeIfs {

    Integer getHttpStatusCode();
    Integer getErrorCode();
    String getDescription();

}
