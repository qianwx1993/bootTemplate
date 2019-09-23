package com.smk.http.back.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @author KCF
 */
public class AccCenrJsonUtil {

	private static final String ERRCODE = "errcode";

	private static final String ERRDISP = "errdisp";

	private static final String HEAD = "head";

	private static final String TXN = "txn";

	private static final String SUC = "00";

	private static final String CENT_SEQ = "centseq";

	private static final String SETT_DATE = "settdate";


	/**
	 * 返回是否成功标志位
	 *
	 * @param json
	 * @return
	 */
	public static Boolean isSuc(JSONObject json) {
		return SUC.equals(getJsonHeadKey(json, ERRCODE));
	}

	/**
	 * 获取 txn json
	 *
	 * @param json
	 * @return
	 */
	public static JSONObject getJson(JSONObject json, String Key) {
		return json.getJSONObject(Key);
	}

	/**
	 * 获取 txn 内的参数
	 *
	 * @param json
	 * @param key
	 * @return
	 */
	public static String getJsonTxnKey(JSONObject json, String key) {
		return json.getJSONObject(TXN).getString(key);
	}

	/**
	 * 获取head里面的参数
	 *
	 * @param json
	 * @param key
	 * @return
	 */
	public static String getJsonHeadKey(JSONObject json, String key) {
		return json.getJSONObject(HEAD).getString(key);
	}

	/**
	 * 获取 txn 内的 seq
	 *
	 * @param json
	 * @return
	 */
	public static String getJsonTxnCentSeq(JSONObject json) {
		return getJsonTxnKey(json, CENT_SEQ);
	}

	/**
	 * 获取 head 内的 返回码
	 *
	 * @param json
	 * @return
	 */
	public static String getJsonHeadErrCode(JSONObject json) {
		return getJsonHeadKey(json, ERRCODE);
	}

	/**
	 * 获取 head 内的 返回描述
	 *
	 * @param json
	 * @return
	 */
	public static String getJsonHeadErrDisp(JSONObject json) {
		return getJsonHeadKey(json, ERRDISP);
	}

	/**
	 * 获取 txn 内的 settdate
	 * @param json
	 * @return
	 */
	public static String getJsonTxnSettDate(JSONObject json) {
		return getJsonTxnKey(json, SETT_DATE);
	}

}
