package com.ysyx.commons.wx.util;

import com.ysyx.commons.wx.WXCommonResult;
import org.junit.Test;

public class JsonUtilTest {

	@Test
	public void test() {
		String json = "{\"errcode\":0,\"errmsg\":\"send job submission success\",\"msg_id\":2350254591}";

		WXCommonResult wxRst = JsonUtil.parseObject(json, WXCommonResult.class);

		System.out.println(wxRst);
	}

}
