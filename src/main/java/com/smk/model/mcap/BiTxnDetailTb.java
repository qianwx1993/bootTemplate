package com.smk.model.mcap;

import java.io.Serializable;

public class BiTxnDetailTb implements Serializable {
    private String localseq;

    private String mchntid;

    private String mchntseq;

    private String insertdate;

    private String inserttime;

    private String reqstr;

    private String resstr;

    private String respcode;

    private String reqip;

    private String txntype;

    private String respmsg;

    private String returntime;

    private Integer dealtime;

    private String ip;

    private static final long serialVersionUID = 1L;

    public String getLocalseq() {
        return localseq;
    }

    public void setLocalseq(String localseq) {
        this.localseq = localseq == null ? null : localseq.trim();
    }

    public String getMchntid() {
        return mchntid;
    }

    public void setMchntid(String mchntid) {
        this.mchntid = mchntid == null ? null : mchntid.trim();
    }

    public String getMchntseq() {
        return mchntseq;
    }

    public void setMchntseq(String mchntseq) {
        this.mchntseq = mchntseq == null ? null : mchntseq.trim();
    }

    public String getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(String insertdate) {
        this.insertdate = insertdate == null ? null : insertdate.trim();
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime == null ? null : inserttime.trim();
    }

    public String getReqstr() {
        return reqstr;
    }

    public void setReqstr(String reqstr) {
        this.reqstr = reqstr == null ? null : reqstr.trim();
    }

    public String getResstr() {
        return resstr;
    }

    public void setResstr(String resstr) {
        this.resstr = resstr == null ? null : resstr.trim();
    }

    public String getRespcode() {
        return respcode;
    }

    public void setRespcode(String respcode) {
        this.respcode = respcode == null ? null : respcode.trim();
    }

    public String getReqip() {
        return reqip;
    }

    public void setReqip(String reqip) {
        this.reqip = reqip == null ? null : reqip.trim();
    }

    public String getTxntype() {
        return txntype;
    }

    public void setTxntype(String txntype) {
        this.txntype = txntype == null ? null : txntype.trim();
    }

    public String getRespmsg() {
        return respmsg;
    }

    public void setRespmsg(String respmsg) {
        this.respmsg = respmsg == null ? null : respmsg.trim();
    }

    public String getReturntime() {
        return returntime;
    }

    public void setReturntime(String returntime) {
        this.returntime = returntime == null ? null : returntime.trim();
    }

    public Integer getDealtime() {
        return dealtime;
    }

    public void setDealtime(Integer dealtime) {
        this.dealtime = dealtime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}