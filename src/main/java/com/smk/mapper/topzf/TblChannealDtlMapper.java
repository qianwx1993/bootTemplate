package com.smk.mapper.topzf;

import com.smk.model.topzf.TblChannealDtl;
import com.smk.model.topzf.TblChannealDtlExample;
import com.smk.model.topzf.TblChannealDtlKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblChannealDtlMapper {
    long countByExample(TblChannealDtlExample example);

    int deleteByExample(TblChannealDtlExample example);

    int deleteByPrimaryKey(TblChannealDtlKey key);

    int insert(TblChannealDtl record);

    int insertSelective(TblChannealDtl record);

    List<TblChannealDtl> selectByExample(TblChannealDtlExample example);

    TblChannealDtl selectByPrimaryKey(TblChannealDtlKey key);

    int updateByExampleSelective(@Param("record") TblChannealDtl record, @Param("example") TblChannealDtlExample example);

    int updateByExample(@Param("record") TblChannealDtl record, @Param("example") TblChannealDtlExample example);

    int updateByPrimaryKeySelective(TblChannealDtl record);

    int updateByPrimaryKey(TblChannealDtl record);
}