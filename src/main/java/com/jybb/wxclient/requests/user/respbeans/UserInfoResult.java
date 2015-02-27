package com.jybb.wxclient.requests.user.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * user info.
 * 
 * @author duanbn
 *
 */
public class UserInfoResult {

	@JsonProperty("subscribe")
	private int subscribe;

	@JsonProperty("openid")
	private String openId;

	@JsonProperty("nickname")
	private String nickName;

	@JsonProperty("sex")
	private int sex;

	@JsonProperty("language")
	private String language;

	@JsonProperty("city")
	private String city;

	@JsonProperty("province")
	private String province;

	@JsonProperty("country")
	private String country;

	@JsonProperty("headimgurl")
	private String headimgUrl;

	@JsonProperty("subscribe_time")
	private long subscribeTime;

	@JsonProperty("unionid")
	private String unionId;

	/**
	 * 
	 * @return
	 */
	public int getSubscribe() {
		return subscribe;
	}

	/**
	 * 
	 * @param subscribe
	 */
	public void setSubscribe(final int subscribe) {
		this.subscribe = subscribe;
	}

	/**
	 * 
	 * @return
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * 
	 * @param openId
	 */
	public void setOpenId(final String openId) {
		this.openId = openId;
	}

	/**
	 * 
	 * @return
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * 
	 * @param nickName
	 */
	public void setNickName(final String nickName) {
		this.nickName = nickName;
	}

	/**
	 * 
	 * @return
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * 
	 * @param sex
	 */
	public void setSex(final int sex) {
		this.sex = sex;
	}

	/**
	 * 
	 * @return
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * 
	 * @param language
	 */
	public void setLanguage(final String language) {
		this.language = language;
	}

	/**
	 * 
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * 
	 * @return
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 
	 * @param province
	 */
	public void setProvince(final String province) {
		this.province = province;
	}

	/**
	 * 
	 * @return
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * 
	 * @return
	 */
	public String getHeadimgUrl() {
		return headimgUrl;
	}

	/**
	 * 
	 * @param headimgUrl
	 */
	public void setHeadimgUrl(final String headimgUrl) {
		this.headimgUrl = headimgUrl;
	}

	/**
	 * 
	 * @return
	 */
	public long getSubscribeTime() {
		return subscribeTime;
	}

	/**
	 * 
	 * @param subscribeTime
	 */
	public void setSubscribeTime(final long subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	/**
	 * 
	 * @return
	 */
	public String getUnionId() {
		return unionId;
	}

	/**
	 * 
	 * @param unionId
	 */
	public void setUnionId(final String unionId) {
		this.unionId = unionId;
	}

}
