package com.base24.token.ddl.base;

import java.math.BigInteger;
/**
 * 
 * @author duttaaji
 *
 */
public class TOKEN {
	String id;
	int lgth;
	String data;
	
	public TOKEN(){
		super();	
		id = new String();
		lgth = 0;
		data = new String();
	}
	
	public TOKEN(String tokenBuffer){
		super();	
		id = new String();
		lgth = 0;
		data = new String();
		
		/*
		 * Remove any spaces at the beginning.
		 */
		if(tokenBuffer.charAt(0) == ' ') {
			tokenBuffer = tokenBuffer.substring(1);
		}
		
		byte[] byteBuffer = tokenBuffer.getBytes();
		
		/*
		 * Position 1-2 : Token ID
		 */
		this.id = new String(byteBuffer, 0, 2);
		/*
		 * Position 2-3 : Token Length
		 */
		byte tmp[] = new byte[2];
		System.arraycopy(byteBuffer, 2, tmp, 0, tmp.length);
		this.lgth = new BigInteger(tmp).intValue();
		/*
		 * Position 4-n : Token Data
		 */
		this.data = new String(byteBuffer,4, byteBuffer.length - 4);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the lgth
	 */
	public int getLgth() {
		return lgth;
	}

	/**
	 * @param lgth the lgth to set
	 */
	public void setLgth(int lgth) {
		this.lgth = lgth;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return (this.id + " | " + String.format("%4d", this.lgth) + " | " + this.data);
	}
}
