package com.smk.mapper.mcap;

import com.smk.model.mcap.BiMchntMsgTypeMapTb;
import com.smk.model.mcap.BiMchntMsgTypeMapTbExample;
import com.smk.model.mcap.BiMchntMsgTypeMapTbKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiMchntMsgTypeMapTbMapper {
    long countByExample(BiMchntMsgTypeMapTbExample example);

    int deleteByExample(BiMchntMsgTypeMapTbExample example);

    int deleteByPrimaryKey(BiMchntMsgTypeMapTbKey key);

    int insert(BiMchntMsgTypeMapTb record);

    int insertSelective(BiMchntMsgTypeMapTb record);

    List<BiMchntMsgTypeMapTb> selectByExample(BiMchntMsgTypeMapTbExample example);

    BiMchntMsgTypeMapTb selectByPrimaryKey(BiMchntMsgTypeMapTbKey key);

    int updateByExampleSelective(@Param("record") BiMchntMsgTypeMapTb record, @Param("example") BiMchntMsgTypeMapTbExample example);

    int updateByExample(@Param("record") BiMchntMsgTypeMapTb record, @Param("example") BiMchntMsgTypeMapTbExample example);

    int updateByPrimaryKeySelective(BiMchntMsgTypeMapTb record);

    int updateByPrimaryKey(BiMchntMsgTypeMapTb record);
}