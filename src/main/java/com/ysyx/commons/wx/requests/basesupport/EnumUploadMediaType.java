package com.ysyx.commons.wx.requests.basesupport;

import java.util.HashMap;
import java.util.Map;

/**
 * media type for request.
 *
 * @author duanbn
 */
public enum EnumUploadMediaType {

	IMAGE("image"), VOICE("voice"), VIDEO("video"), THUMB("thumb");

	private final String value;

	private static final Map<String, EnumUploadMediaType> MAP = new HashMap<String, EnumUploadMediaType>(4);

	static {
		for (final EnumUploadMediaType type : EnumUploadMediaType.values()) {
			MAP.put(type.value, type);
		}
	}

	private EnumUploadMediaType(final String value) {
		this.value = value;
	}

	/**
	 * get enum type.
	 * 
	 * @param value
	 * @return
	 */
	public static EnumUploadMediaType getEnum(final String value) {
		return MAP.get(value);
	}
	
    /**
     *
     */
	public String getValue() {
	    return value;
	}
}
