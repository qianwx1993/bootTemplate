package com.smk.model.mcap;

import java.io.Serializable;

public class BiMchntInfTb implements Serializable {
    private String mchntid;

    private String mchntname;

    private String telnumber;

    private String linkman;

    private String privatekey;

    private String publickey;

    private String state;

    private String reqip;

    private String ischecksign;

    private String lastupdatedatetime;

    private String isupdatepubkey;

    private static final long serialVersionUID = 1L;

    public String getMchntid() {
        return mchntid;
    }

    public void setMchntid(String mchntid) {
        this.mchntid = mchntid == null ? null : mchntid.trim();
    }

    public String getMchntname() {
        return mchntname;
    }

    public void setMchntname(String mchntname) {
        this.mchntname = mchntname == null ? null : mchntname.trim();
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey == null ? null : privatekey.trim();
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey == null ? null : publickey.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getReqip() {
        return reqip;
    }

    public void setReqip(String reqip) {
        this.reqip = reqip == null ? null : reqip.trim();
    }

    public String getIschecksign() {
        return ischecksign;
    }

    public void setIschecksign(String ischecksign) {
        this.ischecksign = ischecksign == null ? null : ischecksign.trim();
    }

    public String getLastupdatedatetime() {
        return lastupdatedatetime;
    }

    public void setLastupdatedatetime(String lastupdatedatetime) {
        this.lastupdatedatetime = lastupdatedatetime == null ? null : lastupdatedatetime.trim();
    }

    public String getIsupdatepubkey() {
        return isupdatepubkey;
    }

    public void setIsupdatepubkey(String isupdatepubkey) {
        this.isupdatepubkey = isupdatepubkey == null ? null : isupdatepubkey.trim();
    }
}