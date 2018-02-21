package com.base24.token.ddl.base;

import java.math.BigInteger;

/**
 * The <b>{@code TOKEN_B0}</b> class represents both the Acquirer and Issuer
 * Switch Token. The token ID for the Switch Token is B0 for Acquirer and B1 for
 * Issuer. Both tokens use the same structure; therefore these tokens are
 * documented together.
 * <p>
 * The B0 and B1 tokens are specific to individual switch interfaces.
 * <p>
 * This class represent the generic structure of the Switch Token since the data
 * carried in the token varies by interchange, the information is documented for
 * each interchange individually.
 * <p>
 * Below is the list of schemes specific representation of the token buffer:
 * <ul>
 * <li>TOKEN_B0_AMEX
 * <li>TOKEN_B0_AXCI_ISO
 * <li>TOKEN_B0_BankNet
 * <li>TOKEN_B0_BIC_ISO
 * <li>TOKEN_B0_EPS_Net
 * <li>TOKEN_B0_LINK_LIS5
 * <li>TOKEN_B0_MACI
 * <li>MDS_SWI_TKN_DATA
 * <li>TOKEN_B0_PLUS_ISO
 * <li>TOKEN_B0_VISA_DPS
 * <li>TOKEN_B0_Visanet
 * </ul>
 * 
 * @version 1.0
 * @author duttaaji
 *
 */
public class TOKEN_B0 {
	/**
	 * The length of the token data. The length includes the FIID and the data
	 * present in the data buffer.
	 */
	private int lgth;
	/**
	 * The FIID assigned to the interface. The value in this field matches the FIID
	 * in the Interchange Configuration File (ICF).
	 */
	private String fiid;
	/**
	 * The generic data, which has a variable length up to 442 characters.
	 */
	private String token_buffer;

	/**
	 * <b><i>TOKEN_B0</b></i>
	 * <p>
	 * {@code public TOKEN_B0()}
	 * <p>
	 * 
	 * Initializes a newly created {@code TOKEN_B0} object so that it represents an
	 * empty Switch Token.
	 */
	public TOKEN_B0() {
		super();
		lgth = 0;
		fiid = new String();
		token_buffer = new String();
	}

	/**
	 * <b><i>TOKEN_B0</b></i>
	 * <p>
	 * {@code public TOKEN_B0(String buffer)}
	 * <p>
	 * 
	 * Initializes a newly created {@code TOKEN_B0} object by decoding the specified
	 * data buffer.
	 * <p>
	 * <b>Note</b>: It is assumed that user will provide the token data and no
	 * validation will be performed on the data passed.
	 */
	public TOKEN_B0(String buffer) {
		super();
		lgth = 0;
		fiid = new String();
		token_buffer = new String();

		byte[] byteBuffer = buffer.getBytes();

		byte tmp[] = new byte[2];
		System.arraycopy(byteBuffer, 2, tmp, 0, tmp.length);
		this.lgth = new BigInteger(tmp).intValue();

		this.fiid = buffer.substring(2, 6);

	}

	/**
	 * <b><i>getLgth</b></i>
	 * <p>
	 * {@code public int getLgth()}
	 * <p>
	 * Return the length of the token data including the FIID length.
	 * 
	 * @return The length of the Token data.
	 */
	public int getLgth() {
		return lgth;
	}

	/**
	 * <b><i>setLgth</b></i>
	 * <p>
	 * {@code public void setLgth(int lgth)}
	 * <p>
	 * Sets the length of the token data including the FIID length.
	 * 
	 * @param lgth
	 *            Length of the Token Data.
	 */
	public void setLgth(int lgth) {
		this.lgth = lgth;
	}

	/**
	 * <b><i>getFiid</b></i>
	 * <p>
	 * {@code public String getFiid()}
	 * <p>
	 * Returns the FIID assigned to the interface for which the Switch Token was
	 * added.
	 * 
	 * @return FIID of the Interface/Scheme.
	 */
	public String getFiid() {
		return fiid;
	}

	/**
	 * <b><i>setFiid</b></i>
	 * <p>
	 * {@code public void setFiid(String fiid)}
	 * <p>
	 * Set the value of the Interface FIID for which the Switch Token was added.
	 * 
	 * @param fiid
	 *            FIID of the interface from ICF.
	 */
	public void setFiid(String fiid) {
		this.fiid = fiid;
	}

	/**
	 * <b><i>getToken_buffer</b></i>
	 * <p>
	 * {@code public String getToken_buffer()}
	 * <p>
	 * Return the Token data buffer.
	 * 
	 * @return Token data buffer.
	 */
	public String getToken_buffer() {
		return token_buffer;
	}

	/**
	 * <b><i>setToken_buffer</b></i>
	 * <p>
	 * {@code public void setToken_buffer(String token_buffer)}
	 * <p>
	 * 
	 * Set the value of the buffer of the Token.
	 * 
	 * @param token_buffer
	 *            Token buffer for the Token.
	 */
	public void setToken_buffer(String token_buffer) {
		this.token_buffer = token_buffer;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Length : " + this.lgth + "\n");
		sb.append("FIID   : " + this.fiid + "\n");
		switch (this.fiid) {
		case "MDS":
			
			break;

		default:
			sb.append(this.token_buffer + "\n");
			break;
		}
		return sb.toString();
	}

}
