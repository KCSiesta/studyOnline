package com.arcsoft.studyOnline.bean;

public class PPTs {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ppts.id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ppts.name
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ppts.path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ppts.route_id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private Integer routeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ppts.id
     *
     * @return the value of ppts.id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ppts.id
     *
     * @param id the value for ppts.id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ppts.name
     *
     * @return the value of ppts.name
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ppts.name
     *
     * @param name the value for ppts.name
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ppts.path
     *
     * @return the value of ppts.path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ppts.path
     *
     * @param path the value for ppts.path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ppts.route_id
     *
     * @return the value of ppts.route_id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public Integer getRouteId() {
        return routeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ppts.route_id
     *
     * @param routeId the value for ppts.route_id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }
}