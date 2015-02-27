package com.jybb.wxclient.util;

import org.junit.Test;

import com.jybb.wxclient.WXCommonResult;

public class JsonUtilTest {

	@Test
	public void test() {
		String json = "{\"errcode\":0,\"errmsg\":\"send job submission success\",\"msg_id\":2350254591}";

		WXCommonResult wxRst = JsonUtil.parseObject(json, WXCommonResult.class);

		System.out.println(wxRst);
	}

}
