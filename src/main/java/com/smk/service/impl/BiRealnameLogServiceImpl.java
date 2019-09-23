package com.smk.service.impl;

import com.smk.mapper.topzf.BiRealnameLogMapper;
import com.smk.model.topzf.BiRealnameLog;
import com.smk.service.BiRealnameLogService;
import com.smk.util.DateUtil;
import com.smk.util.SeqUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/9/19 14:13
 */
@Service
public class BiRealnameLogServiceImpl implements BiRealnameLogService {
	@Resource
	private BiRealnameLogMapper biRealnameLogMapper;
	@Resource
	private SeqUtil seqUtil;
	@Override
	public int saveBiRealnameLog(BiRealnameLog biRealnameLog) {
		biRealnameLog.setInstDate(DateUtil.getDate(DateUtil.YEAR_MONTH_DAY));
		biRealnameLog.setInstTime(DateUtil.getDate(DateUtil.HOUR_MINUTE_SECOND));
		if (StringUtils.isBlank(biRealnameLog.getLocalSeq())){
			biRealnameLog.setLocalSeq(seqUtil.getRealnameSeq());
		}
		return biRealnameLogMapper.insertSelective(biRealnameLog);
	}
}
