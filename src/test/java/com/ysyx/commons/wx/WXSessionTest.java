package com.ysyx.commons.wx;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ysyx.commons.wx.exception.RequestException;
import com.ysyx.commons.wx.requests.basesupport.EnumUploadMediaType;
import com.ysyx.commons.wx.requests.basesupport.respbeans.CallbackIp;
import com.ysyx.commons.wx.requests.js.respbeans.JsapiTicket;
import com.ysyx.commons.wx.requests.menu.Button;
import com.ysyx.commons.wx.requests.menu.EnumButtonType;
import com.ysyx.commons.wx.requests.menu.respbeans.GetMenuResult;
import com.ysyx.commons.wx.requests.user.respbeans.GetGroupResult;
import com.ysyx.commons.wx.requests.user.respbeans.UserInfoResult;
import com.ysyx.commons.wx.requests.user.respbeans.UserListResult;
import com.ysyx.commons.wx.requests.wxmsg.UploadNewsRequest.ArticleItem;

public class WXSessionTest {

	private static WXSession wxSession;

	@BeforeClass
	public static void startup() {
		// 慢鱼
		wxSession = new WXSession("127.0.0.1:11211");
		// 郊游宝宝
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
	}

	@Test
	public void testCreateMenu() throws RequestException {
		List<Button> buttons = new ArrayList<Button>(3);

		Button btn1 = new Button("人气活动", EnumButtonType.VIEW);
		btn1.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx2.jiaoyoubaobao.com%2Factivity%2Flist&response_type=code&scope=snsapi_base&state=#wechat_redirect");
		buttons.add(btn1);

		Button btn2 = new Button("亲子路线", EnumButtonType.VIEW);
		Button btn21 = new Button("主题线路", EnumButtonType.VIEW);
		btn21.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx2.jiaoyoubaobao.com%2Fthemetrip%2Flist&response_type=code&scope=snsapi_base&state=#wechat_redirect");
		btn2.appendButton(btn21);
		Button btn22 = new Button("精选去处", EnumButtonType.VIEW);
		btn22.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx2.jiaoyoubaobao.com%2Fmerchant%2Flist&response_type=code&scope=snsapi_base&state=#wechat_redirect");
		btn2.appendButton(btn22);
		buttons.add(btn2);

		Button btn3 = new Button("百宝箱", EnumButtonType.VIEW);
		Button btn31 = new Button("宝贝资料", EnumButtonType.VIEW);
		btn31.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx2.jiaoyoubaobao.com%2Fbaby%2Fbabyinfo&response_type=code&scope=snsapi_base&state=#wechat_redirect");
		btn3.appendButton(btn31);
		Button btn32 = new Button("宝贝头像", EnumButtonType.VIEW);
		btn32.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx2.jiaoyoubaobao.com%2Fbaby%2Fupload_photo&response_type=code&scope=snsapi_base&state=#wechat_redirect");
		btn3.appendButton(btn32);
		Button btn33 = new Button("我的行程", EnumButtonType.VIEW);
		btn33.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx2.jiaoyoubaobao.com%2Flist%2Ftrips&response_type=code&scope=snsapi_base&state=#wechat_redirect");
		btn3.appendButton(btn33);
		Button btn34 = new Button("我的积分", EnumButtonType.VIEW);
		btn34.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx2.jiaoyoubaobao.com%2Fshow%2Fcoins&response_type=code&scope=snsapi_base&state=#wechat_redirect");
		btn3.appendButton(btn34);
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
	}

	@Test
	public void testGetUserList() throws RequestException {
		final UserListResult result = wxSession.getUserList(null);
		System.out.println(result.getData());
	}

	@Test
	public void testGetUserInfo() throws RequestException {
		UserInfoResult result = wxSession.getUserInfo("oN_S5s_N0fSF4GmtEXyD95ImUxRA");
		System.out.println(result);
	}

	@Test
	public void testGetGroup() throws RequestException {
		GetGroupResult result = wxSession.getGroup();
		System.out.println(result);
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
	public void testSendTemplateMessage() throws RequestException, IOException {
		Map<String, Object> data = new LinkedHashMap<String, Object>();

		Map<String, String> first = new LinkedHashMap<String, String>();
		first.put("value", "􏰘你好，你订阅的0元抢活动将于11：00开始");
		data.put("first", first);

		Map<String, String> keyword1 = new LinkedHashMap<String, String>();
		keyword1.put("value", "0元抢198元温泉门票");
		data.put("keyword1", keyword1);

		Map<String, String> keyword2 = new LinkedHashMap<String, String>();
		keyword2.put("value", "2015年4月8日 11:00");
		data.put("keyword2", keyword2);

		Map<String, String> remark = new LinkedHashMap<String, String>();
		remark.put("value", "摩拳擦掌，做好准备~");
		data.put("remark", remark);

		String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxedabf9b277b61d91&redirect_uri=http%3A%2F%2Fwx.jiaoyoubaobao.com%2Fseckill%2Fintro&response_type=code&scope=snsapi_base&state=#wechat_redirect";

//		List<String> openIdList = FileUtils.readLines(new File("/Users/apple/Documents/openid.txt"));
//		for (String openId : openIdList) {
//			try {
//				wxSession.sendTemplateMessage(openId, "WwUWCSKq7H-a5aGgPMT93GcKHDsw-MjO1Gdx4au5SUA", url, null, data);
//			} catch (Exception e) {
//				System.out.println(openId + " igonre");
//			}
//		}
		
		wxSession.sendTemplateMessage("oN_S5s_N0fSF4GmtEXyD95ImUxRA", "WwUWCSKq7H-a5aGgPMT93GcKHDsw-MjO1Gdx4au5SUA", url, null, data);
	}

	@Test
	public void testAddTemplate() {
		fail("Not yet implemented");
	}

	@Test
	public void testUploadNews() throws RequestException {
		List<ArticleItem> items = new ArrayList<ArticleItem>();
		ArticleItem item = new ArticleItem("SogUccTTTgWkRFVQY0tmG39a-KapFKf95L5SGdUJjCbbMWQVYKsbTPPzXp3o_Agh",
				"欢迎加入慢鱼", "");
		item.setContentSourceUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8c7fd9739d4600e2&redirect_uri=http%3A%2F%2Fwx.jiaoyoubaobao.com%2Fuser&response_type=code&scope=snsapi_base&state=#wechat_redirect");
		item.setAuthor("慢鱼");
		item.setShowCoverPic("1");
		items.add(item);
		WXMediaUploadResult result = wxSession.uploadNews(items);
		System.out.println(result);
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
	public void testUploadMedia() throws RequestException {
		File file = new File("/Users/apple/Pictures/head.jpg");
		WXMediaUploadResult result = wxSession.uploadMedia(EnumUploadMediaType.IMAGE, file);
		System.out.println(result.getMediaId());
	}

	@Test
	public void testGetCallbackIp() throws RequestException {
		final CallbackIp result = wxSession.getCallbackIp();
		System.out.println(result);
	}

}
