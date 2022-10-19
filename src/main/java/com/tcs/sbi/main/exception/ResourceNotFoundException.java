package com.tcs.sbi.main.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 920091894568415941L;
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
