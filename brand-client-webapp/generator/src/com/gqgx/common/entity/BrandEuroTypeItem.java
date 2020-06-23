package com.gqgx.common.entity;

import java.io.Serializable;
import java.util.Date;

public class BrandEuroTypeItem implements Serializable {
    private Long id;

    private Long largeTypeId;

    private String typeNo;

    private String projectName;

    private String projectCoor;

    private String projectHarm;

    private String projectNice;

    private String projectIdli;

    private String projectMgs;

    private String recordStatus;

    private Integer updateCount;

    private Date createDate;

    private Long creatorId;

    private Date updateDate;

    private Long updaterId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLargeTypeId() {
        return largeTypeId;
    }

    public void setLargeTypeId(Long largeTypeId) {
        this.largeTypeId = largeTypeId;
    }

    public String getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(String typeNo) {
        this.typeNo = typeNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCoor() {
        return projectCoor;
    }

    public void setProjectCoor(String projectCoor) {
        this.projectCoor = projectCoor;
    }

    public String getProjectHarm() {
        return projectHarm;
    }

    public void setProjectHarm(String projectHarm) {
        this.projectHarm = projectHarm;
    }

    public String getProjectNice() {
        return projectNice;
    }

    public void setProjectNice(String projectNice) {
        this.projectNice = projectNice;
    }

    public String getProjectIdli() {
        return projectIdli;
    }

    public void setProjectIdli(String projectIdli) {
        this.projectIdli = projectIdli;
    }

    public String getProjectMgs() {
        return projectMgs;
    }

    public void setProjectMgs(String projectMgs) {
        this.projectMgs = projectMgs;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Integer getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Long updaterId) {
        this.updaterId = updaterId;
    }
}