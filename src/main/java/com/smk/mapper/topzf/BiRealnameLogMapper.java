package com.smk.mapper.topzf;

import com.smk.model.topzf.BiRealnameLog;
import com.smk.model.topzf.BiRealnameLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiRealnameLogMapper {
    long countByExample(BiRealnameLogExample example);

    int deleteByExample(BiRealnameLogExample example);

    int deleteByPrimaryKey(String localSeq);

    int insert(BiRealnameLog record);

    int insertSelective(BiRealnameLog record);

    List<BiRealnameLog> selectByExample(BiRealnameLogExample example);

    BiRealnameLog selectByPrimaryKey(String localSeq);

    int updateByExampleSelective(@Param("record") BiRealnameLog record, @Param("example") BiRealnameLogExample example);

    int updateByExample(@Param("record") BiRealnameLog record, @Param("example") BiRealnameLogExample example);

    int updateByPrimaryKeySelective(BiRealnameLog record);

    int updateByPrimaryKey(BiRealnameLog record);
}