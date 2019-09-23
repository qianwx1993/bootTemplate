package com.smk.mapper.topzf;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: qian
 * @Date: 2019/9/19 11:24
 * @Company Bangsun
 * @Description:
 */
public interface TopzfSeqExtMapper {
	@Select("SELECT lpad(${seq}.nextval,${length},0) AS id FROM DUAL")
	String getSeq(@Param("seq") String seq, @Param("length") int length);
}
