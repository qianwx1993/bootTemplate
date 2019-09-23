package com.smk.util;

import com.smk.mapper.topzf.TopzfSeqExtMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/9/19 11:21
 */
@Component
public class SeqUtil {
	@Resource
	private TopzfSeqExtMapper topzfSeqExtMapper;

	private static final String DATA_FORMAT = "yyyyMMdd";

	private static final String DATA_FORMAT_ALL = "yyyyMMddHHmmss";

	private static final String TOPZF_REALNAME_REQ = "REALNAMESEQ";

	private static final int LENGTH_12 = 12;
	private static final int LENGTH_10 = 10;
	private static final int LENGTH_8 = 8;
	private static final int LENGTH_7=7;
	private static final int LENGTH_6 = 6;

	public synchronized String getRealnameSeq() {
		return topzfSeqExtMapper.getSeq(TOPZF_REALNAME_REQ, LENGTH_12);
	}
}
