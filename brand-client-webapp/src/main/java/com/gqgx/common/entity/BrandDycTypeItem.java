package com.gqgx.common.entity;

import java.io.Serializable;
import java.util.Date;

public class BrandDycTypeItem implements Serializable {
    private Long id;

    private Long navItemId;

    private Long largeTypeId;

    private String typeNo;

    private String projectName;

    private String projectTranslation;

    private String projectStatus;

    private String projectInvalidDate;

    private String projectType;

    private String projectVersion;

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

    public Long getNavItemId() {
        return navItemId;
    }

    public void setNavItemId(Long navItemId) {
        this.navItemId = navItemId;
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

    public String getProjectTranslation() {
        return projectTranslation;
    }

    public void setProjectTranslation(String projectTranslation) {
        this.projectTranslation = projectTranslation;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectInvalidDate() {
        return projectInvalidDate;
    }

    public void setProjectInvalidDate(String projectInvalidDate) {
        this.projectInvalidDate = projectInvalidDate;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
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