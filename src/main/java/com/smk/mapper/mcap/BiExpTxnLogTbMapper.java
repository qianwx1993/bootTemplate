package com.smk.mapper.mcap;

import com.smk.model.mcap.BiExpTxnLogTb;
import com.smk.model.mcap.BiExpTxnLogTbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiExpTxnLogTbMapper {
    long countByExample(BiExpTxnLogTbExample example);

    int deleteByExample(BiExpTxnLogTbExample example);

    int deleteByPrimaryKey(String localseq);

    int insert(BiExpTxnLogTb record);

    int insertSelective(BiExpTxnLogTb record);

    List<BiExpTxnLogTb> selectByExample(BiExpTxnLogTbExample example);

    BiExpTxnLogTb selectByPrimaryKey(String localseq);

    int updateByExampleSelective(@Param("record") BiExpTxnLogTb record, @Param("example") BiExpTxnLogTbExample example);

    int updateByExample(@Param("record") BiExpTxnLogTb record, @Param("example") BiExpTxnLogTbExample example);

    int updateByPrimaryKeySelective(BiExpTxnLogTb record);

    int updateByPrimaryKey(BiExpTxnLogTb record);
}