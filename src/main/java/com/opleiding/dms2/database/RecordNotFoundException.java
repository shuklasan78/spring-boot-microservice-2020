package com.opleiding.dms2.database;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
//This annotation tells Spring Boot to respond with the specified HTTP status code in case the exception is thrown.
public class RecordNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String exceptionDetail;
    private Object fieldValue;

    public RecordNotFoundException(String exceptionDetail, Long fieldValue) {
        super(exceptionDetail + " - " + fieldValue);
        this.exceptionDetail = exceptionDetail;
        this.fieldValue = fieldValue;
    }

    public String getExceptionDetail() {
        return exceptionDetail;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}