package com.smk.model.topzf;

import java.io.Serializable;

public class BiRealnameLog implements Serializable {
    private String localSeq;

    private String idType;

    private String idCard;

    private String custName;

    private String hisSetSeq;

    private String faceSeq;

    private String socNo;

    private String realNameRes;

    private String instDate;

    private String instTime;

    private String hisOrgNo;

    private static final long serialVersionUID = 1L;

    public String getLocalSeq() {
        return localSeq;
    }

    public void setLocalSeq(String localSeq) {
        this.localSeq = localSeq == null ? null : localSeq.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getHisSetSeq() {
        return hisSetSeq;
    }

    public void setHisSetSeq(String hisSetSeq) {
        this.hisSetSeq = hisSetSeq == null ? null : hisSetSeq.trim();
    }

    public String getFaceSeq() {
        return faceSeq;
    }

    public void setFaceSeq(String faceSeq) {
        this.faceSeq = faceSeq == null ? null : faceSeq.trim();
    }

    public String getSocNo() {
        return socNo;
    }

    public void setSocNo(String socNo) {
        this.socNo = socNo == null ? null : socNo.trim();
    }

    public String getRealNameRes() {
        return realNameRes;
    }

    public void setRealNameRes(String realNameRes) {
        this.realNameRes = realNameRes == null ? null : realNameRes.trim();
    }

    public String getInstDate() {
        return instDate;
    }

    public void setInstDate(String instDate) {
        this.instDate = instDate == null ? null : instDate.trim();
    }

    public String getInstTime() {
        return instTime;
    }

    public void setInstTime(String instTime) {
        this.instTime = instTime == null ? null : instTime.trim();
    }

    public String getHisOrgNo() {
        return hisOrgNo;
    }

    public void setHisOrgNo(String hisOrgNo) {
        this.hisOrgNo = hisOrgNo == null ? null : hisOrgNo.trim();
    }
}