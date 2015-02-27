package com.jybb.wxclient.exception;

/**
 * parse response content exception.
 * 
 * @author duanbn
 *
 */
public class ResponseParseException extends RuntimeException {
	/**
	 * 
	 * @param msg
	 */
	public ResponseParseException(final String msg) {
		super(msg);
	}

	/**
	 * 
	 * @param t
	 */
	public ResponseParseException(final Throwable t) {
		super(t);
	}

	/**
	 * 
	 * @param msg
	 * @param t
	 */
	public ResponseParseException(final String msg, final Throwable t) {
		super(msg, t);
	}
}
