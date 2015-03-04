package com.ysyx.commons.wx.exception;

/**
 * weixin request exception.
 *
 * @author duanbn
 */
public class RequestException extends Exception {

	/**
	 * 
	 * @param msg
	 */
    public RequestException(final String msg) {
        super(msg);
    }

    /**
     * 
     * @param t
     */
    public RequestException(final Throwable t) {
        super(t);
    }

    /**
     * 
     * @param msg
     * @param t
     */
    public RequestException(final String msg, final Throwable t) {
        super(msg, t);
    }

}
