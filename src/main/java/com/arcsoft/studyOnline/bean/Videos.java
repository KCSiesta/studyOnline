package com.arcsoft.studyOnline.bean;

public class Videos {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videos.id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videos.name
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videos.path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videos.views
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private Integer views;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videos.cover_path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private String coverPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videos.route_id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private Integer routeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videos.length
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    private String length;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column videos.id
     *
     * @return the value of videos.id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column videos.id
     *
     * @param id the value for videos.id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column videos.name
     *
     * @return the value of videos.name
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column videos.name
     *
     * @param name the value for videos.name
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column videos.path
     *
     * @return the value of videos.path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column videos.path
     *
     * @param path the value for videos.path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column videos.views
     *
     * @return the value of videos.views
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public Integer getViews() {
        return views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column videos.views
     *
     * @param views the value for videos.views
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column videos.cover_path
     *
     * @return the value of videos.cover_path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public String getCoverPath() {
        return coverPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column videos.cover_path
     *
     * @param coverPath the value for videos.cover_path
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath == null ? null : coverPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column videos.route_id
     *
     * @return the value of videos.route_id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public Integer getRouteId() {
        return routeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column videos.route_id
     *
     * @param routeId the value for videos.route_id
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column videos.length
     *
     * @return the value of videos.length
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public String getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column videos.length
     *
     * @param length the value for videos.length
     *
     * @mbg.generated Sun Jun 18 17:34:40 CST 2017
     */
    public void setLength(String length) {
        this.length = length == null ? null : length.trim();
    }
}