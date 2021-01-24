package com.exceptions;

import java.io.IOException;

public class NoSuchIdException extends IOException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3163983489146457190L;

	public NoSuchIdException(String message) {
        super(message);
    }
}