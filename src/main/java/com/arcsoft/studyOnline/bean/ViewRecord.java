package com.arcsoft.studyOnline.bean;

import java.util.Date;

public class ViewRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_record.id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_record.employee_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Integer employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_record.video_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Integer videoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_record.view_time
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Date viewTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_record.id
     *
     * @return the value of view_record.id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_record.id
     *
     * @param id the value for view_record.id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_record.employee_id
     *
     * @return the value of view_record.employee_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_record.employee_id
     *
     * @param employeeId the value for view_record.employee_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_record.video_id
     *
     * @return the value of view_record.video_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_record.video_id
     *
     * @param videoId the value for view_record.video_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_record.view_time
     *
     * @return the value of view_record.view_time
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Date getViewTime() {
        return viewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_record.view_time
     *
     * @param viewTime the value for view_record.view_time
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setViewTime(Date viewTime) {
        this.viewTime = viewTime;
    }
}