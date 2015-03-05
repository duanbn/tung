package com.ysyx.commons.wx.util;

import org.junit.Test;

import com.ysyx.commons.wx.requests.menu.respbeans.GetMenuResult;

public class JsonUtilTest {

	@Test
	public void test() {
		String json = "{\"menu\":{\"button\":[{\"sub_button\":[]},{\"name\":\"服务信息\",\"sub_button\":[{\"sub_button\":[]},{\"sub_button\":[]},{\"type\":\"view\",\"name\":\"link\",\"url\":\"http:\\/\\/www.baidu.com\\/\",\"sub_button\":[]}]},{\"sub_button\":[]}]}}";

		GetMenuResult wxRst = JsonUtil.parseObject(json, GetMenuResult.class);

		System.out.println(wxRst);
	}
}
