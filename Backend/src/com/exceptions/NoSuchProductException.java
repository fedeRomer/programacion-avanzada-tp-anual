package com.exceptions;


import java.io.IOException;

public class NoSuchProductException extends IOException {
    
	private static final long serialVersionUID = -1626523297210008704L;

	public NoSuchProductException(String message) {
        super(message);
    }
}