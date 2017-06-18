package com.arcsoft.studyOnline.dao;

import com.arcsoft.studyOnline.bean.Route;
import com.arcsoft.studyOnline.bean.RouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    long countByExample(RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int deleteByExample(RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int insert(Route record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int insertSelective(Route record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    List<Route> selectByExample(RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int updateByExampleSelective(@Param("record") Route record, @Param("example") RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    int updateByExample(@Param("record") Route record, @Param("example") RouteExample example);
}