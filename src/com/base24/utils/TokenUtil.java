package com.base24.utils;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import com.base24.token.ddl.base.TOKEN;

/**
 * The {@code TokenUtil} class provides a list of function to handle token data
 * in internal and external messages. These utilities are listed below:
 * <p>
 * <ul>
 * <li><b>getTokenBuffer</b> - Extract the Token buffer from a data buffer.
 * <li><b>getTokens</b> - Returns all the individual tokens from the token
 * buffer as an array.
 * </ul>
 * 
 * @author duttaaji
 * @version 1.0
 */
public class TokenUtil {
	/**
	 * <b><i>getTokenBuffer</i></b>
	 * <p>
	 * {@code public static String getTokenBuffer(String dataBuffer)}
	 * <p>
	 * Extracts the Token buffer from the data buffer. if Token buffer is not found
	 * it will return null.
	 * 
	 * @param dataBuffer
	 *            - Data buffer from where the Token buffer has to be extracted.
	 * @return Token buffer extracted from <code>dataBuffer</code> or null.
	 */
	public static String getTokenBuffer(String dataBuffer) {
		String tokenBuffer = null;

		/*
		 * Locate the Header Token Eye Catcher in the dataBuffer
		 */
		int idx = dataBuffer.indexOf("&");

		if (idx < 0) {
			/*
			 * Unable to find Header Token Eye catcher in the dataBuffer.
			 */
			return null;
		}

		/*
		 * If we reach here then we have found the Header Token eye catcher i.e. &.
		 * Extract the Token buffer.
		 * 
		 */
		tokenBuffer = dataBuffer.substring(idx);

		return tokenBuffer;
	}

	/**
	 * <b><i>getAllTokens</i></b>
	 * <p>
	 * {@code public static TOKEN[] getAllTokens(String tokenBuffer)}
	 * <p>
	 * Returns a list of token from the token data buffer. If the Header Token is
	 * present in the data buffer it will be skipped.
	 * 
	 * @param tokenBuffer
	 *            - The token data buffer
	 * @return A list of tokens present in the token data buffer.
	 */
	public static TOKEN[] getAllTokens(String tokenBuffer) {
		ArrayList<TOKEN> tokens = new ArrayList<TOKEN>();
		int idx = 0;
		/*
		 * All the tokens in the buffer will be separated by '!' as a delimiter. Split
		 * the entire token buffer into an array of individual token buffer.
		 */
		String tokenList[] = tokenBuffer.split("!");

		/*
		 * Check if the header token is present in the token buffer. If the header token
		 * is present skip it;
		 */
		if (tokenList[0].startsWith("&")) {
			idx++;
		}

		while (idx < tokenList.length) {
			tokens.add(new TOKEN(tokenList[idx]));
			idx++;
		}

		// return tokens.toArray(TOKEN()[0]);
		return (tokens.stream().toArray(TOKEN[]::new));
	}

}
