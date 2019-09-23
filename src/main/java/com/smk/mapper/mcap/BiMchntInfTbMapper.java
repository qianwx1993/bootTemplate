package com.smk.mapper.mcap;

import com.smk.model.mcap.BiMchntInfTb;
import com.smk.model.mcap.BiMchntInfTbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiMchntInfTbMapper {
    long countByExample(BiMchntInfTbExample example);

    int deleteByExample(BiMchntInfTbExample example);

    int deleteByPrimaryKey(String mchntid);

    int insert(BiMchntInfTb record);

    int insertSelective(BiMchntInfTb record);

    List<BiMchntInfTb> selectByExample(BiMchntInfTbExample example);

    BiMchntInfTb selectByPrimaryKey(String mchntid);

    int updateByExampleSelective(@Param("record") BiMchntInfTb record, @Param("example") BiMchntInfTbExample example);

    int updateByExample(@Param("record") BiMchntInfTb record, @Param("example") BiMchntInfTbExample example);

    int updateByPrimaryKeySelective(BiMchntInfTb record);

    int updateByPrimaryKey(BiMchntInfTb record);
}