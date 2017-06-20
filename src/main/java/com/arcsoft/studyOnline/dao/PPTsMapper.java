package com.arcsoft.studyOnline.dao;

import com.arcsoft.studyOnline.bean.PPTs;
import com.arcsoft.studyOnline.bean.PPTsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PPTsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ppts
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    long countByExample(PPTsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ppts
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int deleteByExample(PPTsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ppts
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int insert(PPTs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ppts
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int insertSelective(PPTs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ppts
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    List<PPTs> selectByExample(PPTsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ppts
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int updateByExampleSelective(@Param("record") PPTs record, @Param("example") PPTsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ppts
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int updateByExample(@Param("record") PPTs record, @Param("example") PPTsExample example);

    void insetPpt(PPTs ppt);
}