package com.andrey_nicollas.mongodb_demo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVerisonUID = 1L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
