package com.example.demo.bean;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liyhu
 * @since 2020-06-23
 */
@TableName("smbms_user")
public class SmbmsUser extends Model<SmbmsUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 性别（1:女、 2:男）
     */
    private Integer gender;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 手机
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 用户角色（取自角色表-角色id）
     */
    private Long userRole;
    /**
     * 创建者（userId）
     */
    private Long createdBy;
    /**
     * 创建时间
     */
    private Date creationDate;
    /**
     * 更新者（userId）
     */
    private Long modifyBy;
    /**
     * 更新时间
     */
    private Date modifyDate;
    /**
     * 证件照图片路径
     */
    private String idPicPath;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUserRole() {
        return userRole;
    }

    public void setUserRole(Long userRole) {
        this.userRole = userRole;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getIdPicPath() {
        return idPicPath;
    }

    public void setIdPicPath(String idPicPath) {
        this.idPicPath = idPicPath;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SmbmsUser{" +
        "id=" + id +
        ", userCode=" + userCode +
        ", userName=" + userName +
        ", userPassword=" + userPassword +
        ", gender=" + gender +
        ", birthday=" + birthday +
        ", phone=" + phone +
        ", address=" + address +
        ", userRole=" + userRole +
        ", createdBy=" + createdBy +
        ", creationDate=" + creationDate +
        ", modifyBy=" + modifyBy +
        ", modifyDate=" + modifyDate +
        ", idPicPath=" + idPicPath +
        "}";
    }
}
