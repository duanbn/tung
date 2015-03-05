package com.ysyx.commons.wx;

import java.io.File;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import net.spy.memcached.MemcachedClient;

import com.ysyx.commons.wx.exception.RequestException;
import com.ysyx.commons.wx.requests.account.CreatePermanentQRCodeRequest;
import com.ysyx.commons.wx.requests.account.CreateStringPermanentQRCodeRequest;
import com.ysyx.commons.wx.requests.account.respbeans.QRCodeResult;
import com.ysyx.commons.wx.requests.basesupport.EnumUploadMediaType;
import com.ysyx.commons.wx.requests.basesupport.GetAccessTokenRequest;
import com.ysyx.commons.wx.requests.basesupport.GetCallbackIpRequest;
import com.ysyx.commons.wx.requests.basesupport.MediaDownloadRequest;
import com.ysyx.commons.wx.requests.basesupport.MediaUploadRequest;
import com.ysyx.commons.wx.requests.basesupport.respbeans.AccessToken;
import com.ysyx.commons.wx.requests.basesupport.respbeans.CallbackIp;
import com.ysyx.commons.wx.requests.menu.Button;
import com.ysyx.commons.wx.requests.menu.CreateMenuRequest;
import com.ysyx.commons.wx.requests.menu.DeleteMenuRequest;
import com.ysyx.commons.wx.requests.menu.GetMenuRequest;
import com.ysyx.commons.wx.requests.menu.respbeans.GetMenuResult;
import com.ysyx.commons.wx.requests.user.CreateGroupRequest;
import com.ysyx.commons.wx.requests.user.GetGroupIdRequest;
import com.ysyx.commons.wx.requests.user.GetGroupRequest;
import com.ysyx.commons.wx.requests.user.GetUserInfoRequest;
import com.ysyx.commons.wx.requests.user.GetUserListRequest;
import com.ysyx.commons.wx.requests.user.MoveBatchUserGroupRequest;
import com.ysyx.commons.wx.requests.user.MoveOneUserRequest;
import com.ysyx.commons.wx.requests.user.UpdateGroupRequest;
import com.ysyx.commons.wx.requests.user.UpdateUserRemarkRequest;
import com.ysyx.commons.wx.requests.user.respbeans.CreateGroupResult;
import com.ysyx.commons.wx.requests.user.respbeans.GetGroupIdResult;
import com.ysyx.commons.wx.requests.user.respbeans.GetGroupResult;
import com.ysyx.commons.wx.requests.user.respbeans.UserInfoResult;
import com.ysyx.commons.wx.requests.user.respbeans.UserListResult;
import com.ysyx.commons.wx.requests.wxmsg.AddTemplateRequest;
import com.ysyx.commons.wx.requests.wxmsg.EnumSendType;
import com.ysyx.commons.wx.requests.wxmsg.GetSendStatusRequest;
import com.ysyx.commons.wx.requests.wxmsg.SendAllRequest;
import com.ysyx.commons.wx.requests.wxmsg.SendDeleteRequest;
import com.ysyx.commons.wx.requests.wxmsg.SendPreviewRequest;
import com.ysyx.commons.wx.requests.wxmsg.SendRequest;
import com.ysyx.commons.wx.requests.wxmsg.SendTemplateMessageRequest;
import com.ysyx.commons.wx.requests.wxmsg.SetIndustryRequest;
import com.ysyx.commons.wx.requests.wxmsg.UploadNewsRequest;
import com.ysyx.commons.wx.requests.wxmsg.UploadNewsRequest.ArticleItem;

/**
 * keep the connect with weixin server. wrapper weixin request, create and
 * refresh access token. must be close this session when never use.
 */
public class WXSession {

	private MemcachedClient memClient;

	private static final String TOKEN_KEY = "weixin.token";
	private static final long TOKEN_EXPIRE = 7200 * 1000;

	/**
	 * 
	 * @param address
	 */
	public WXSession(final String address) {
		try {
			final List<InetSocketAddress> servers = new ArrayList<InetSocketAddress>();

			final String[] addresses = address.split(",");

			InetSocketAddress socketAddress = null;
			for (final String addr : addresses) {
				final String[] pair = addr.split(":");
				socketAddress = new InetSocketAddress(pair[0], Integer.parseInt(pair[1]));
				servers.add(socketAddress);
			}

			this.memClient = new MemcachedClient(servers);
		} catch (Exception e) {
			throw new RuntimeException("连接memcached服务器失败", e);
		}
	}

	/**
	 * close session.
	 */
	public void close() {
		this.memClient.shutdown();
	}

	/******************************************************
	 * stat support
	 *****************************************************/
	// TODO:

	/******************************************************
	 * account support
	 *****************************************************/
	/**
     *
     */
	public QRCodeResult createStringPermanentQRCode(final String sceneStr) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<QRCodeResult> resp = new CreateStringPermanentQRCodeRequest(accessToken, sceneStr).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public QRCodeResult createPermanentQRCode(final int sceneId) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<QRCodeResult> resp = new CreatePermanentQRCodeRequest(accessToken, sceneId).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/******************************************************
	 * menu support
	 *****************************************************/
	/**
     *
     */
	public GetMenuResult getMenu() throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<GetMenuResult> resp = new GetMenuRequest(accessToken).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult deleteMenu() throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<WXCommonResult> resp = new DeleteMenuRequest(accessToken).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult createMenu(final List<Button> buttons) throws RequestException {
		final String accessToken = getToken().getValue();

		final CreateMenuRequest req = new CreateMenuRequest(accessToken);
		req.setButtons(buttons);

		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/******************************************************
	 * user support
	 *****************************************************/
	/**
     *
     */
	public WXCommonResult updateUserRemark(final String openId, final String remark) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<WXCommonResult> resp = new UpdateUserRemarkRequest(accessToken, openId, remark).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult updateGroup(final int groupId, final String groupName) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<WXCommonResult> resp = new UpdateGroupRequest(accessToken, groupId, groupName).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult moveOneUser(final String openId, final String toGroupId) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<WXCommonResult> resp = new MoveOneUserRequest(accessToken, openId, toGroupId).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult moveBatchUserGroup(final List<String> openIdList, final int toGroupId)
			throws RequestException {
		final String accessToken = getToken().getValue();

		final MoveBatchUserGroupRequest req = new MoveBatchUserGroupRequest(accessToken, toGroupId);
		req.appendOpenId(openIdList);
		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
	 * @param nextOpenId
	 *            can be set null.
	 */
	public UserListResult getUserList(final String nextOpenId) throws RequestException {
		final String accessToken = getToken().getValue();

		final GetUserListRequest req = new GetUserListRequest(accessToken);
		if (nextOpenId != null) {
			req.setNextOpenId(nextOpenId);
		}
		final Response<UserListResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public UserInfoResult getUserInfo(final String openId) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<UserInfoResult> resp = new GetUserInfoRequest(accessToken, openId).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public GetGroupResult getGroup() throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<GetGroupResult> resp = new GetGroupRequest(accessToken).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public GetGroupIdResult getGroupId(final String openId) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<GetGroupIdResult> resp = new GetGroupIdRequest(accessToken, openId).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public CreateGroupResult createGroup(final String groupName) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<CreateGroupResult> resp = new CreateGroupRequest(accessToken, groupName).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/******************************************************
	 * message support
	 *****************************************************/
	/**
     *
     */
	public WXCommonResult setIndustry(final String industryId1, final String industryId2) throws RequestException {
		final String accessToken = getToken().getValue();
		final Response<WXCommonResult> resp = new SetIndustryRequest(accessToken, industryId1, industryId2).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
	 * @param topcolor
	 *            can be ignored, default value if #FF0000
	 */
	public <T> WXCommonResult sendTemplateMessage(final String toUser, final String templateId, final String url,
			final String topcolor, final T data) throws RequestException {
		final String accessToken = getToken().getValue();

		final SendTemplateMessageRequest<T> req = new SendTemplateMessageRequest<T>(accessToken, toUser, templateId,
				url, data);
		if (topcolor != null) {
			req.setTopcolor(topcolor);
		}
		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult addTemplate(final String tempalteIdShort) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<WXCommonResult> resp = new AddTemplateRequest(accessToken, tempalteIdShort).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXMediaUploadResult uploadNews(final List<ArticleItem> items) throws RequestException {
		final String accessToken = getToken().getValue();

		final UploadNewsRequest req = new UploadNewsRequest(accessToken);
		req.append(items);

		final Response<WXMediaUploadResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult sendMedia(final EnumSendType sendType, final List<String> openIdList, final String mediaId)
			throws RequestException {
		final String accessToken = getToken().getValue();

		final SendRequest req = new SendRequest(accessToken, sendType);
		req.appendOpenId(openIdList);
		req.setMediaId(mediaId);

		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult sendText(final EnumSendType sendType, final List<String> openIdList, final String content)
			throws RequestException {
		final String accessToken = getToken().getValue();

		final SendRequest req = new SendRequest(accessToken, EnumSendType.TEXT);
		req.appendOpenId(openIdList);
		req.setContent(content);

		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     * 
     */
	public WXCommonResult sendMediaPreview(final EnumSendType sendType, final String openId, final String mediaId)
			throws RequestException {
		final String accessToken = getToken().getValue();

		final SendPreviewRequest req = new SendPreviewRequest(accessToken, sendType);
		req.setOpenId(openId);
		req.setMediaId(mediaId);

		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult sendTextPreview(final String openId, final String content) throws RequestException {
		final String accessToken = getToken().getValue();

		final SendPreviewRequest req = new SendPreviewRequest(accessToken, EnumSendType.TEXT);
		req.setOpenId(openId);
		req.setContent(content);

		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
	 * delete message which has sent.
	 */
	public WXCommonResult sendDelete(final long msgId) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<WXCommonResult> resp = new SendDeleteRequest(accessToken, msgId).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	public WXCommonResult sendMediaAll(final EnumSendType sendType, final boolean toAll, final String groupId,
			final String mediaId) throws RequestException {
		final String accessToken = getToken().getValue();

		final SendAllRequest req = new SendAllRequest(accessToken, sendType);
		req.setToAll(toAll);
		req.setGroupId(groupId);
		req.setMediaId(mediaId);
		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
	 * send all.
	 */
	public WXCommonResult sendTextAll(final boolean toAll, final String groupId, final String content)
			throws RequestException {
		final String accessToken = getToken().getValue();

		final SendAllRequest req = new SendAllRequest(accessToken, EnumSendType.TEXT);
		req.setToAll(toAll);
		req.setGroupId(groupId);
		req.setContent(content);
		final Response<WXCommonResult> resp = req.execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
	 * get status of send message.
	 */
	public WXCommonResult getSendStatus(final String msgId) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<WXCommonResult> resp = new GetSendStatusRequest(accessToken, msgId).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/******************************************************
	 * base support
	 *****************************************************/
	/**
	 * download media from weixin server.
	 */
	public byte[] downloadMedia(final String mediaId) throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<byte[]> resp = new MediaDownloadRequest(accessToken, mediaId).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
	 * upload media to weixin server.
	 */
	public WXMediaUploadResult uploadMedia(final EnumUploadMediaType mediaType, final File file)
			throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<WXMediaUploadResult> resp = new MediaUploadRequest(accessToken, mediaType, file).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
	 * get weixin server ip.
	 */
	public CallbackIp getCallbackIp() throws RequestException {
		final String accessToken = getToken().getValue();

		final Response<CallbackIp> resp = new GetCallbackIpRequest(accessToken).execute();

		if (resp.isOK()) {
			return resp.get();
		}

		throw new RequestException(resp.getErrMessage());
	}

	/**
     *
     */
	private WXAccessToken getToken() {
		final long nowTime = System.currentTimeMillis();

		WXAccessToken wxAccessToken = (WXAccessToken) this.memClient.get(TOKEN_KEY);

		if (wxAccessToken == null || (nowTime - wxAccessToken.getCreateTime()) >= TOKEN_EXPIRE) {
			synchronized (this) {
				wxAccessToken = (WXAccessToken) this.memClient.get(TOKEN_KEY);
				if (wxAccessToken == null || (nowTime - wxAccessToken.getCreateTime()) >= TOKEN_EXPIRE) {
					int retry = 3;
					while (retry-- > 0) {
						final Response<AccessToken> resp = new GetAccessTokenRequest().execute();
						if (resp.isOK()) {
							final AccessToken accessToken = resp.get();
							wxAccessToken = new WXAccessToken(accessToken.getAccessToken(), System.currentTimeMillis());
							this.memClient.set(TOKEN_KEY, 0, wxAccessToken);
							break;
						} else {
							sleep(1000);
						}
					}
				}
			}
		}
		
		return wxAccessToken;
	}

	private void sleep(final long time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
     * 
     */
	private static class WXAccessToken implements Serializable {
		private static final long serialVersionUID = 1L;

		private final String value;

		private final long createTime;

		/**
		 * 
		 * @param value
		 * @param createTime
		 */
		public WXAccessToken(final String value, final long createTime) {
			this.value = value;
			this.createTime = createTime;
		}

		/**
         *
         */
		public String getValue() {
			return this.value;
		}

		/**
         *
         */
		public long getCreateTime() {
			return this.createTime;
		}
	}

}
