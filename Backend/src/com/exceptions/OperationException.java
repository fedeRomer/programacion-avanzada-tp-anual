package com.exceptions;

import java.io.IOException;

public class OperationException extends IOException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 9199628923160853180L;

	public OperationException(String message) {
        super(message);
    }
}
