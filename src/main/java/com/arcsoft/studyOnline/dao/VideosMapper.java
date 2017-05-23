package com.arcsoft.studyOnline.dao;

import com.arcsoft.studyOnline.bean.Videos;
import com.arcsoft.studyOnline.bean.VideosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    long countByExample(VideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    int deleteByExample(VideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    int insert(Videos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    int insertSelective(Videos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    List<Videos> selectByExample(VideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    int updateByExampleSelective(@Param("record") Videos record, @Param("example") VideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    int updateByExample(@Param("record") Videos record, @Param("example") VideosExample example);
}