package com.jybb.wxclient.requests.menu.respbeans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.requests.menu.Button;

/**
 * get menu result.
 * 
 * @author duanbn
 *
 */
public class GetMenuResult {

	@JsonProperty("menu")
	private MenuInfo menu;

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "GetMenuResult [menu=" + menu + "]";
	}

	/**
	 * 
	 * @return
	 */
	public MenuInfo getMenu() {
		return menu;
	}

	/**
	 * 
	 * @param menu
	 */
	public void setMenu(final MenuInfo menu) {
		this.menu = menu;
	}

	/**
	 * 
	 * @author duanbn
	 *
	 */
	public class MenuInfo {
		@JsonProperty("button")
		private List<Button> button;

		/**
		 * 
		 */
		@Override
		public String toString() {
			return "MenuInfo [button=" + button + "]";
		}

		/**
		 * 
		 * @return
		 */
		public List<Button> getButton() {
			return button;
		}

		/**
		 * 
		 * @param button
		 */
		public void setButton(final List<Button> button) {
			this.button = button;
		}
	}

}
