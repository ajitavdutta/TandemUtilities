package com.base24.token.ddl.base;

import java.math.BigInteger;

public class HEADER_TKN {
	
	public static int TKN_LENGTH = 12;
	
	byte[] eye_catcher;
	byte[] user_fld1;
	byte[] cnt;
	byte[] lgth;

	String eye_catcherx;
	String user_fld1x;
	int cntx;
	int lgthx;

	public HEADER_TKN() {
		super();
		eye_catcher = new byte[1];
		user_fld1 = new byte[1];
		cnt = new byte[2];
		lgth = new byte[2];

		eye_catcherx = new String();
		user_fld1x = new String();
		cntx = 0;
		lgthx = 0;
	}
	
	public HEADER_TKN(String data) {
		super();
		eye_catcher = new byte[1];
		user_fld1 = new byte[1];
		cnt = new byte[2];
		lgth = new byte[2];

		eye_catcherx = new String();
		user_fld1x = new String();
		cntx = 0;
		lgthx = 0;
	}

	public void setHEADER_TKN(byte[] data, int idx) {
		System.arraycopy(data, idx, eye_catcher, 0, this.eye_catcher.length);
		idx = idx + this.eye_catcher.length;

		System.arraycopy(data, idx, user_fld1, 0, this.user_fld1.length);
		idx = idx + this.user_fld1.length;

		System.arraycopy(data, idx, cnt, 0, this.cnt.length);
		idx = idx + this.cnt.length;

		System.arraycopy(data, idx, lgth, 0, this.lgth.length);
		idx = idx + this.lgth.length;

		eye_catcherx = new String(this.eye_catcher);
		user_fld1x = new String(this.user_fld1);
		cntx = new BigInteger(this.cnt).intValue();
		lgthx = new BigInteger(this.lgth).intValue();

	}

	public int size() {
		return  this.eye_catcher.length + 
				this.user_fld1.length + 
				this.cnt.length + 
				this.lgth.length;
	}

	/**
	 * @return the eye_catcher
	 */
	public byte[] getEye_catcher() {
		return eye_catcher;
	}

	/**
	 * @param eye_catcher the eye_catcher to set
	 */
	public void setEye_catcher(byte[] eye_catcher) {
		this.eye_catcher = eye_catcher;
	}

	/**
	 * @return the user_fld1
	 */
	public byte[] getUser_fld1() {
		return user_fld1;
	}

	/**
	 * @param user_fld1 the user_fld1 to set
	 */
	public void setUser_fld1(byte[] user_fld1) {
		this.user_fld1 = user_fld1;
	}

	/**
	 * @return the cnt
	 */
	public byte[] getCnt() {
		return cnt;
	}

	/**
	 * @param cnt the cnt to set
	 */
	public void setCnt(byte[] cnt) {
		this.cnt = cnt;
	}

	/**
	 * @return the lgth
	 */
	public byte[] getLgth() {
		return lgth;
	}

	/**
	 * @param lgth the lgth to set
	 */
	public void setLgth(byte[] lgth) {
		this.lgth = lgth;
	}

	/**
	 * @return the eye_catcherx
	 */
	public String getEye_catcherx() {
		return eye_catcherx;
	}

	/**
	 * @param eye_catcherx the eye_catcherx to set
	 */
	public void setEye_catcherx(String eye_catcherx) {
		this.eye_catcherx = eye_catcherx;
	}

	/**
	 * @return the user_fld1x
	 */
	public String getUser_fld1x() {
		return user_fld1x;
	}

	/**
	 * @param user_fld1x the user_fld1x to set
	 */
	public void setUser_fld1x(String user_fld1x) {
		this.user_fld1x = user_fld1x;
	}

	/**
	 * @return the cntx
	 */
	public int getCntx() {
		return cntx;
	}

	/**
	 * @param cntx the cntx to set
	 */
	public void setCntx(int cntx) {
		this.cntx = cntx;
	}

	/**
	 * @return the lgthx
	 */
	public int getLgthx() {
		return lgthx;
	}

	/**
	 * @param lgthx the lgthx to set
	 */
	public void setLgthx(int lgthx) {
		this.lgthx = lgthx;
	}

}
