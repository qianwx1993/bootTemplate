package com.smk.service;

import com.smk.model.mcap.BiTxnDetailTb;

public interface BiTxnDetailTbService {

	/**
	 * 保存日志信息
	 *
	 * @param biTxnDetailTb 日志信息
	 * @return 日志信息主键
	 */
	String save(BiTxnDetailTb biTxnDetailTb);

	/**
	 * 更新日志信息
	 *
	 * @param biTxnDetailTb 日志信息
	 */
	void update(BiTxnDetailTb biTxnDetailTb);

}
