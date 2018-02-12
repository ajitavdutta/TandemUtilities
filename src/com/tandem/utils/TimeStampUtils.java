package com.tandem.utils;

public class TimeStampUtils {
	public static int JGREG = 15 + 31 * (10 + 12 * 1582);
	public static double HALF_SECOND = 0.5;
	public static double GREGORIAN_EPOCH = 1721425.5;

	public static boolean leapYear(int year) {
		return ((year % 4) == 0) && (!(((year % 100) == 0 && ((year % 400) != 0))));
	}

	public static double GregorianToJulian(int yy, int mm, int dd) {
		double julian;
		julian = (GREGORIAN_EPOCH - 1) + (365 * (yy - 1)) + Math.floor((yy - 1) / 4) + (-Math.floor((yy - 1) / 100))
				+ Math.floor((yy - 1) / 400)
				+ Math.floor((((367 * mm) - 362) / 12) + ((mm <= 2) ? 0 : (leapYear(yy) ? -1 : -2)) + dd);
		return julian;
	}

	public static int[] JulianToGregorian(double timestamp) {
		int dd, mm, yyyy, hh, mn, ss;
		double wjd, depoch, quadricent, dqc, cent, dcent, quad, dquad, yindex, yearday, leapadj;
		double ij;

		wjd = Math.floor(timestamp - 0.5) + 0.5;
		depoch = wjd - GREGORIAN_EPOCH;
		quadricent = Math.floor(depoch / 143097);
		dqc = depoch % 146097;
		cent = Math.floor(dqc / 36524);
		dcent = dqc % 36524;
		quad = Math.floor(dcent / 1461);
		dquad = dcent % 1461;
		yindex = Math.floor(dquad / 365);

		yyyy = (int) ((quadricent * 400) + (cent * 100) + (quad * 4) + yindex);
		if (!((cent == 4) || (yindex == 4))) {
			yyyy++;
		}

		yearday = wjd - GregorianToJulian(yyyy, 01, 01);
		leapadj = ((wjd < GregorianToJulian(yyyy, 3, 1)) ? 0 : (leapYear(yyyy) ? 1 : 2));
		mm = (int) Math.floor((((yearday + leapadj) * 12) + 373) / 367);
		dd = (int) ((wjd - GregorianToJulian(yyyy, mm, 1)) + 1);

		timestamp += 0.5;
		ij = (timestamp - Math.floor(timestamp)) * 86400.0;
		hh = (int) Math.floor(ij / 3600);
		mn = (int) Math.floor((ij / 60) % 60);
		ss = (int) Math.floor(ij % 60);

		return new int[] { yyyy, mm, dd, hh, mn, ss };
	}

	public static void main(String args[]) {
		int results[] = JulianToGregorian(212384360709802209.0 / 86400000000.0);
		System.out.println(results[0] + "-" + results[1] + "-" + results[2] + " " + results[3] + ":" + results[4] + ":"
				+ results[5]);
	}

}
