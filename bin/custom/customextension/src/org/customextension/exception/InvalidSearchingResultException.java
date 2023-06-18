package org.customextension.exception;

public class InvalidSearchingResultException extends RuntimeException {
    public InvalidSearchingResultException() {
        super();
    }

    public InvalidSearchingResultException(String message) {
        super(message);
    }
}
