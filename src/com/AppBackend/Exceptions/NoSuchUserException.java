package com.AppBackend.Exceptions;

import java.io.IOException;
import java.io.Serializable;

public class NoSuchUserException extends IOException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3163983489146457190L;

	public NoSuchUserException(String message) {
        super(message);
    }
}