package com.ysyx.commons.wx;

/**
 * http response implements. if code equals Response.OK, sucMessage have value.
 *
 * @author duanbn
 */
public class HttpResponse<T> implements Response<T> {

	protected int code;

	protected T sucMessage;

	protected String errMessage;

	/**
	 * 
	 * @param code
	 */
	public HttpResponse(final int code) {
		this.code = code;
	}

	/**
     * 
     */
	@Override
	public boolean isOK() {
		return this.code == OK;
	}

	/**
     * 
     */
	@Override
	public int getCode() {
		return this.code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(final int code) {
		this.code = code;
	}

	/**
     * 
     */
	@Override
	public T get() {
		return this.sucMessage;
	}

	/**
	 * 
	 * @param sucMessage
	 */
	public void set(final T sucMessage) {
		this.sucMessage = sucMessage;
	}

	/**
     * 
     */
	@Override
	public String getErrMessage() {
		return this.errMessage;
	}

	/**
	 * 
	 * @param errMessage
	 */
	public void setErrMessage(final String errMessage) {
		this.errMessage = errMessage;
	}

}
