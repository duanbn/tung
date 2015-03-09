package com.ysyx.commons.wx;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ysyx.commons.wx.exception.RequestException;
import com.ysyx.commons.wx.requests.basesupport.respbeans.CallbackIp;
import com.ysyx.commons.wx.requests.js.respbeans.JsapiTicket;
import com.ysyx.commons.wx.requests.menu.Button;
import com.ysyx.commons.wx.requests.menu.EnumButtonType;
import com.ysyx.commons.wx.requests.menu.respbeans.GetMenuResult;
import com.ysyx.commons.wx.requests.user.respbeans.UserInfoResult;
import com.ysyx.commons.wx.requests.user.respbeans.UserListResult;

public class WXSessionTest {

	private static WXSession wxSession;

	@BeforeClass
	public static void startup() {
		wxSession = new WXSession("127.0.0.1:11211");
		// wxSession = new WXSession("127.0.0.1:11211", "wx8c7fd9739d4600e2",
		// "ec8d243dd68323ce0fe0e86fbf84745e");
	}

	@AfterClass
	public static void shutdown() {
		wxSession.close();
	}

	@Test
	public void testGetJsapiTicket() throws RequestException {
		final JsapiTicket jsapiTicket = wxSession.getJsapiTicket();
		System.out.println(jsapiTicket);
	}

	@Test
	public void testCreateStringPermanentQRCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreatePermanentQRCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMenu() throws RequestException {
		GetMenuResult result = wxSession.getMenu();
		System.out.println(result);
	}

	@Test
	public void testDeleteMenu() throws RequestException {
		WXCommonResult result = wxSession.deleteMenu();
		System.out.println(result);
	}

	@Test
	public void testCreateMenu() throws RequestException {
		List<Button> buttons = new ArrayList<Button>(3);

		// Button btn1 = new Button("测试", EnumButtonType.VIEW);
		// btn1.setKey("test");
		// String url =
		// "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx.jiaoyoubaobao.com%2Fuser&response_type=code&scope=snsapi_base&state=#wechat_redirect";
		// btn1.setUrl(url);
		// buttons.add(btn1);

		Button miaosha = new Button("秒杀", EnumButtonType.CLICK);
		miaosha.setKey("miaosha");
		miaosha.setUrl("http://www.baidu.com");
		buttons.add(miaosha);

		Button zhuti = new Button("主题", EnumButtonType.CLICK);
		zhuti.setKey("zhuti");
		zhuti.setUrl("http://www.qq.com");
		buttons.add(zhuti);

		Button more = new Button("更多");

		Button jingxuan = new Button("精选去处", EnumButtonType.CLICK);
		jingxuan.setKey("jingxuan");
		jingxuan.setUrl("http://www.baidu.com");
		more.appendButton(jingxuan);

		Button me = new Button("我的信息", EnumButtonType.CLICK);
		me.setKey("me");
		me.setUrl("http://www.baidu.com");
		more.appendButton(me);

		buttons.add(more);

		WXCommonResult result = wxSession.createMenu(buttons);

		System.out.println(result);
	}

	@Test
	public void testUpdateUserRemark() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateGroup() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveOneUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveBatchUserGroup() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserList() throws RequestException {
		final UserListResult result = wxSession.getUserList(null);
		System.out.println(result.getData());
	}

	@Test
	public void testGetUserInfo() throws RequestException {
		UserInfoResult result = wxSession.getUserInfo("onJmIs9hX1i4TBjhoxTpVYgRb70A");
		System.out.println(result);
	}

	@Test
	public void testGetGroup() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGroupId() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateGroup() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIndustry() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendTemplateMessage() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddTemplate() {
		fail("Not yet implemented");
	}

	@Test
	public void testUploadNews() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendMedia() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendText() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendMediaPreview() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendTextPreview() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendMediaAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendTextAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSendStatus() {
		fail("Not yet implemented");
	}

	@Test
	public void testDownloadMedia() {
		fail("Not yet implemented");
	}

	@Test
	public void testUploadMedia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCallbackIp() throws RequestException {
		final CallbackIp result = wxSession.getCallbackIp();
		System.out.println(result);
	}

}
