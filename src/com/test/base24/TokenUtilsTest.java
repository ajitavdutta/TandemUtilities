package com.test.base24;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.base24.token.ddl.base.TOKEN;
import com.base24.utils.TokenUtil;
import com.custom.reader.CRLFTerminatedReader;

public class TokenUtilsTest {
	
	public static void main(String args[]) {
		String strLine;
		CRLFTerminatedReader rd = null;
		File in_file = new File("C:/NotBackedUp/01 Projects/2016/Schemes 16.1/MDS ILF/IL160328");
		try {
			rd = new CRLFTerminatedReader(new FileInputStream(in_file));
			while( (strLine = rd.readLine()) != null){
				String tokenBuffer = TokenUtil.getTokenBuffer(strLine); 
				if(tokenBuffer != null) {
					TOKEN []tokens = TokenUtil.getAllTokens(tokenBuffer);
					if (tokens.length > 0) {
						System.out.println("Tokens found.");
						for(TOKEN t : tokens) {
							System.out.println( " " + t);
						}
					}
				} else {
					System.out.println("Token Buffer not found...");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				rd.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
