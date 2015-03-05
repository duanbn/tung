package com.ysyx.commons.wx;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ysyx.commons.wx.exception.RequestException;
import com.ysyx.commons.wx.requests.basesupport.respbeans.CallbackIp;
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
	}

	@AfterClass
	public static void shutdown() {
		wxSession.close();
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

		Button btn1 = new Button("百度", EnumButtonType.VIEW);
		btn1.setKey("baidu");
		btn1.setUrl("http://www.baidu.com");
		buttons.add(btn1);

		Button btn2 = new Button("阿里", EnumButtonType.VIEW);
		btn2.setKey("alibaba");
		btn2.setUrl("http://www.taobao.com");
		buttons.add(btn2);

		Button btn3 = new Button("腾讯", EnumButtonType.VIEW);
		btn3.setKey("tengxun");
		btn3.setUrl("http://www.qq.com");
		buttons.add(btn3);

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
