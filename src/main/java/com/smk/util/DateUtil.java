package com.smk.util;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author HYK
 * @Company bangsun
 * @Date 2018/11/23 0023 10:38
 */
@Slf4j
public class DateUtil {

	public static final String YEAR_MONTH_DAY = "yyyyMMdd";

	public static final String HOUR_MINUTE_SECOND = "HHmmss";

	public static final String SYSTEM_DATE = "yyyyMMddHHmmss";
	
	public static final String SYSTEM_DATE2 = "yyyyMMdd HH:mm:ss";
	

	/**
	 * 获取yyyyMMdd格式的当前时间
	 *
	 * @return 当前时间
	 */
	public static String getYearMonthDay() {
		return getDate(YEAR_MONTH_DAY);
	}

	/**
	 * 获取HHmmss格式的当前时间
	 *
	 * @return 当前时间
	 */
	public static String getHourMinuteSecond() {
		return getDate(HOUR_MINUTE_SECOND);
	}

	/**
	 * 获取yyyyMMddHHmmss格式的当前时间
	 *
	 * @return 当前时间
	 */
	public static String getSystemDate() {
		return getDate(SYSTEM_DATE);
	}

	/**
	 * 获取格式化后的当前时间
	 *
	 * @param format 格式
	 * @return 当前时间
	 */
	public static String getDate(String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.format(new Date());
	}

	/**
	 * 日期格式转换
	 *
	 * @param date      日期字符串
	 * @param inFormat  日期原格式
	 * @param outFormat 日期返回格式
	 * @return 改变格式后的日期字符串
	 */
	public static String dateFormat(String date, String inFormat, String outFormat) {
		try {
			Date time = new SimpleDateFormat(inFormat).parse(date);
			return dateFormat(time, outFormat);
		} catch (ParseException e) {
			log.error(e.getMessage(),e);
			return date;
		}
	}

	/**
	 * 日期格式转换
	 *
	 * @param date      日期
	 * @param outFormat 日期返回格式
	 * @return 格式化后的日期字符串
	 */
	public static String dateFormat(Date date, String outFormat) {
		return new SimpleDateFormat(outFormat).format(date);
	}
	
	/**
	 * 获取两个时间的时间差 
	 * @param date
	 * @param date1
	 * @return
	 */
	public static Long subdate(Date date, Date date1) {
		return date.getTime()-date1.getTime();
	}
	
public static void main(String[] args) {
	 Date date1 = new Date();
	System.out.println(date1.getTime());
}
}
