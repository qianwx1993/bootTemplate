package com.smk.mapper.mcap;

import com.smk.model.mcap.BiTxnDetailTb;
import com.smk.model.mcap.BiTxnDetailTbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiTxnDetailTbMapper {
    long countByExample(BiTxnDetailTbExample example);

    int deleteByExample(BiTxnDetailTbExample example);

    int deleteByPrimaryKey(String localseq);

    int insert(BiTxnDetailTb record);

    int insertSelective(BiTxnDetailTb record);

    List<BiTxnDetailTb> selectByExample(BiTxnDetailTbExample example);

    BiTxnDetailTb selectByPrimaryKey(String localseq);

    int updateByExampleSelective(@Param("record") BiTxnDetailTb record, @Param("example") BiTxnDetailTbExample example);

    int updateByExample(@Param("record") BiTxnDetailTb record, @Param("example") BiTxnDetailTbExample example);

    int updateByPrimaryKeySelective(BiTxnDetailTb record);

    int updateByPrimaryKey(BiTxnDetailTb record);
}