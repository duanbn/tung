package com.ysyx.commons.wx;

/**
 * represent a wei xin request.
 *
 * @author duanbn
 */
public interface Request<T> {

	/**
	 * domain of weixin.
	 */
	String WX_DOMAIN = "https://api.weixin.qq.com";

    /**
     * media domain of weixin.
     * for upload file.
     */
    String WX_FILE_DOMAIN = "http://file.api.weixin.qq.com";

	/**
	 * do request.
	 *
	 * @return response.
	 */
	Response<T> execute();

}
