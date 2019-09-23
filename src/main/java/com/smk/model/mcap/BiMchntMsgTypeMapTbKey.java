package com.smk.model.mcap;

import java.io.Serializable;

public class BiMchntMsgTypeMapTbKey implements Serializable {
    private String mchntid;

    private String messagetype;

    private static final long serialVersionUID = 1L;

    public String getMchntid() {
        return mchntid;
    }

    public void setMchntid(String mchntid) {
        this.mchntid = mchntid == null ? null : mchntid.trim();
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype == null ? null : messagetype.trim();
    }
}