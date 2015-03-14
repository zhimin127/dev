package org.my.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author zhimin
 *
 */
public class DateUtil {

	public static final String SHORT_FORMAT = "yyyy-MM-dd";
	public static final String LONG_FORMAT = "yyyy-MM-dd hh:mm:ss";
	
	public static String getShortDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(SHORT_FORMAT);
		if (null == date || "".equals(date)) {
			date = new Date();
		}
		return sdf.format(date);
	}
}
