package com.topaiebiz.member.member.bo;

public class QQUserBo {

	//ret	返回码
	private String ret;
	//msg	如果ret<0，会有相应的错误信息提示，返回数据全部用UTF-8编码。
	private String msg;
	//nickname	用户在QQ空间的昵称。
	private String nickname;
/*	//figureurl	大小为30×30像素的QQ空间头像URL。
	private String figureurl;
	//figureurl_1	大小为50×50像素的QQ空间头像URL。
	private String figureurl_1;
	//figureurl_2	大小为100×100像素的QQ空间头像URL。
	private String figureurl_2;*/
	//figureurl_qq_1	大小为40×40像素的QQ头像URL。
	private String figureurl_qq_1;
	//figureurl_qq_2	大小为100×100像素的QQ头像URL。需要注意，不是所有的用户都拥有QQ的100x100的头像，但40x40像素则是一定会有。
	private String figureurl_qq_2;
	//gender	性别。 如果获取不到则默认返回"男"
/*	private String gender;
	//is_yellow_vip	标识用户是否为黄钻用户（0：不是；1：是）。
	private String is_yellow_vip;
	//vip	标识用户是否为黄钻用户（0：不是；1：是）
	private String vip;
	//yellow_vip_level	黄钻等级
	private String yellow_vip_level;
	//level	黄钻等级
	private String level;
	//is_yellow_year_vip	标识是否为年费黄钻用户（0：不是； 1：是）
	private String is_yellow_year_vip;*/
	
	private String openId;
	
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getRet() {
		return ret;
	}
	public void setRet(String ret) {
		this.ret = ret;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getFigureurl_qq_1() {
		return figureurl_qq_1;
	}
	public void setFigureurl_qq_1(String figureurl_qq_1) {
		this.figureurl_qq_1 = figureurl_qq_1;
	}
	public String getFigureurl_qq_2() {
		return figureurl_qq_2;
	}
	public void setFigureurl_qq_2(String figureurl_qq_2) {
		this.figureurl_qq_2 = figureurl_qq_2;
	}
	
}
