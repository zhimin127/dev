package org.my.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author zhimin
 *
 */
public class DateUtil {

	private final static Log log = LogFactory.getLog(DateUtil.class);

	public static final String SHORT_FORMAT = "yyyy-MM-dd";
	public static final String LONG_FORMAT = "yyyy-MM-dd HH:MM:ss";

	public static String format(Date date) {
		if (null == date) {
			date = new Date();
		}
		return format(date, LONG_FORMAT);
	}

	public static String format(Date date, String pattern) {
		if (StringUtils.isBlank(pattern)) {
			pattern = LONG_FORMAT;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	public static Date parse(String dateStr, String pattern) {
		if (StringUtils.isBlank(dateStr)) {
			return null;
		}
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		try {
			return df.parse(dateStr);
		} catch (Exception e) {
			log.error("Parse date fail, date=" + dateStr + ", pattern=" + pattern, e);
		}
		return null;
	}

	public static Date parse(String dateStr) {
		return parse(dateStr, LONG_FORMAT);
	}
}
