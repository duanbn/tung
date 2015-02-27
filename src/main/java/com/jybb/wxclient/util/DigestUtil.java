package com.jybb.wxclient.util;

import java.security.MessageDigest;

/**
 * digest util.
 * 
 * @author duanbn
 *
 */
public final class DigestUtil {

	private DigestUtil() {
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String md5(final String s) {
		final char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		try {
			final byte[] btInput = s.getBytes();
			// 获得MD5摘要算法的 MessageDigest 对象
			final MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			final byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			final int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				final byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
}
