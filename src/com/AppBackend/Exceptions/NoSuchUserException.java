package com.AppBackend.exceptions;

import java.io.IOException;

public class NoSuchUserException extends IOException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3163983489146457190L;

	public NoSuchUserException(String message) {
        super(message);
    }
}