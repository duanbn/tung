package com.jybb.wxclient;

/**
 * represent a response of weixin request.
 *
 * @author duanbn
 */
public interface Response<T> {

	/**
	 * request sucess return code.
	 */
	int OK = 200;

	/**
	 * request failure return code.
	 */
	int ERROR = 400;

	/**
	 * code equals 200 will be return true, otherwise return false.
	 * 
	 * @return
	 */
	boolean isOK();

	/**
	 * get response code.
	 *
	 * @return 200 is ok.
	 */
	int getCode();

	/**
	 * get response suc message.
	 */
	T get();

	/**
	 * get response error message.
	 */
	String getErrMessage();

}
