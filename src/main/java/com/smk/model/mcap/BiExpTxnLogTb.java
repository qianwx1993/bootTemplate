package com.smk.model.mcap;

import java.io.Serializable;

public class BiExpTxnLogTb implements Serializable {
    private String localseq;

    private String mchntid;

    private String chmchntid;

    private String posid;

    private String chposid;

    private String batchid;

    private String postype;

    private String cardnumber;

    private String csn;

    private String cardkind;

    private String cardid;

    private String instdate;

    private String insttime;

    private String txntype;

    private Integer txnamt;

    private String respcode;

    private String respmsg;

    private String channel;

    private String reqstr;

    private String resstr;

    private String centseq;

    private String settdate;

    private String exceptionstr;

    private String lastupdatetime;

    private String rsvd;

    private String rsvd1;

    private String rsvd2;

    private String rsvd3;

    private String termssn;

    private String subtxntype;

    private String mchntseq;

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

    public String getChmchntid() {
        return chmchntid;
    }

    public void setChmchntid(String chmchntid) {
        this.chmchntid = chmchntid == null ? null : chmchntid.trim();
    }

    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid == null ? null : posid.trim();
    }

    public String getChposid() {
        return chposid;
    }

    public void setChposid(String chposid) {
        this.chposid = chposid == null ? null : chposid.trim();
    }

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid == null ? null : batchid.trim();
    }

    public String getPostype() {
        return postype;
    }

    public void setPostype(String postype) {
        this.postype = postype == null ? null : postype.trim();
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public String getCsn() {
        return csn;
    }

    public void setCsn(String csn) {
        this.csn = csn == null ? null : csn.trim();
    }

    public String getCardkind() {
        return cardkind;
    }

    public void setCardkind(String cardkind) {
        this.cardkind = cardkind == null ? null : cardkind.trim();
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public String getInstdate() {
        return instdate;
    }

    public void setInstdate(String instdate) {
        this.instdate = instdate == null ? null : instdate.trim();
    }

    public String getInsttime() {
        return insttime;
    }

    public void setInsttime(String insttime) {
        this.insttime = insttime == null ? null : insttime.trim();
    }

    public String getTxntype() {
        return txntype;
    }

    public void setTxntype(String txntype) {
        this.txntype = txntype == null ? null : txntype.trim();
    }

    public Integer getTxnamt() {
        return txnamt;
    }

    public void setTxnamt(Integer txnamt) {
        this.txnamt = txnamt;
    }

    public String getRespcode() {
        return respcode;
    }

    public void setRespcode(String respcode) {
        this.respcode = respcode == null ? null : respcode.trim();
    }

    public String getRespmsg() {
        return respmsg;
    }

    public void setRespmsg(String respmsg) {
        this.respmsg = respmsg == null ? null : respmsg.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
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

    public String getCentseq() {
        return centseq;
    }

    public void setCentseq(String centseq) {
        this.centseq = centseq == null ? null : centseq.trim();
    }

    public String getSettdate() {
        return settdate;
    }

    public void setSettdate(String settdate) {
        this.settdate = settdate == null ? null : settdate.trim();
    }

    public String getExceptionstr() {
        return exceptionstr;
    }

    public void setExceptionstr(String exceptionstr) {
        this.exceptionstr = exceptionstr == null ? null : exceptionstr.trim();
    }

    public String getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(String lastupdatetime) {
        this.lastupdatetime = lastupdatetime == null ? null : lastupdatetime.trim();
    }

    public String getRsvd() {
        return rsvd;
    }

    public void setRsvd(String rsvd) {
        this.rsvd = rsvd == null ? null : rsvd.trim();
    }

    public String getRsvd1() {
        return rsvd1;
    }

    public void setRsvd1(String rsvd1) {
        this.rsvd1 = rsvd1 == null ? null : rsvd1.trim();
    }

    public String getRsvd2() {
        return rsvd2;
    }

    public void setRsvd2(String rsvd2) {
        this.rsvd2 = rsvd2 == null ? null : rsvd2.trim();
    }

    public String getRsvd3() {
        return rsvd3;
    }

    public void setRsvd3(String rsvd3) {
        this.rsvd3 = rsvd3 == null ? null : rsvd3.trim();
    }

    public String getTermssn() {
        return termssn;
    }

    public void setTermssn(String termssn) {
        this.termssn = termssn == null ? null : termssn.trim();
    }

    public String getSubtxntype() {
        return subtxntype;
    }

    public void setSubtxntype(String subtxntype) {
        this.subtxntype = subtxntype == null ? null : subtxntype.trim();
    }

    public String getMchntseq() {
        return mchntseq;
    }

    public void setMchntseq(String mchntseq) {
        this.mchntseq = mchntseq == null ? null : mchntseq.trim();
    }
}