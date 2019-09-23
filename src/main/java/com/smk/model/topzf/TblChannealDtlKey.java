package com.smk.model.topzf;

import java.io.Serializable;

public class TblChannealDtlKey implements Serializable {
    private String channel;

    private String tochannel;

    private String txntype;

    private String txndate;

    private String reqseq;

    private String mchntid;

    private static final long serialVersionUID = 1L;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getTochannel() {
        return tochannel;
    }

    public void setTochannel(String tochannel) {
        this.tochannel = tochannel == null ? null : tochannel.trim();
    }

    public String getTxntype() {
        return txntype;
    }

    public void setTxntype(String txntype) {
        this.txntype = txntype == null ? null : txntype.trim();
    }

    public String getTxndate() {
        return txndate;
    }

    public void setTxndate(String txndate) {
        this.txndate = txndate == null ? null : txndate.trim();
    }

    public String getReqseq() {
        return reqseq;
    }

    public void setReqseq(String reqseq) {
        this.reqseq = reqseq == null ? null : reqseq.trim();
    }

    public String getMchntid() {
        return mchntid;
    }

    public void setMchntid(String mchntid) {
        this.mchntid = mchntid == null ? null : mchntid.trim();
    }
}