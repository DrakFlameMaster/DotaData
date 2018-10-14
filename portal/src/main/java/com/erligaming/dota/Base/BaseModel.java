package com.erligaming.dota.Base;

import java.io.Serializable;
import java.util.Date;

public class BaseModel {

    private Long pkid;

    private Integer version = 0;

    protected String sysState = "1";

    protected Date createTime = new Date();

    protected Date modifyTime = new Date();

    protected String operator;

    protected String creator;

    protected String remark;

    private int countId;


    @Override
    public String toString() {
        return "BaseModel{" +
                "pkid=" + pkid +
                ", version=" + version +
                ", sysState='" + sysState + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", operator='" + operator + '\'' +
                ", creator='" + creator + '\'' +
                ", remark='" + remark + '\'' +
                ", countId=" + countId +
                '}';
    }

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getSysState() {
        return sysState;
    }

    public void setSysState(String sysState) {
        this.sysState = sysState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCountId() {
        return countId;
    }

    public void setCountId(int countId) {
        this.countId = countId;
    }
}
