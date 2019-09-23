package com.smk.model.topzf;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblChannealDtl extends TblChannealDtlKey implements Serializable {
    private String txntime;

    private String orderid;

    private String centseq;

    private String retrivlref;

    private String cardnumber;

    private String accountno;

    private String txnamt;

    private String reqtype;

    private String settdate;

    private String keyRevsal;

    private String keyCancel;

    private String transstatus;

    private String errcode;

    private String errinfo;

    private String reqinfo;

    private String salemode;

    private BigDecimal relcentseq;

    private Integer cardkind;

    private String paymode;

    private String rsvd1;

    private String rsvd2;

    private String rsvd3;

    private String rsvd4;

    private static final long serialVersionUID = 1L;

    public String getTxntime() {
        return txntime;
    }

    public void setTxntime(String txntime) {
        this.txntime = txntime == null ? null : txntime.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCentseq() {
        return centseq;
    }

    public void setCentseq(String centseq) {
        this.centseq = centseq == null ? null : centseq.trim();
    }

    public String getRetrivlref() {
        return retrivlref;
    }

    public void setRetrivlref(String retrivlref) {
        this.retrivlref = retrivlref == null ? null : retrivlref.trim();
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getTxnamt() {
        return txnamt;
    }

    public void setTxnamt(String txnamt) {
        this.txnamt = txnamt == null ? null : txnamt.trim();
    }

    public String getReqtype() {
        return reqtype;
    }

    public void setReqtype(String reqtype) {
        this.reqtype = reqtype == null ? null : reqtype.trim();
    }

    public String getSettdate() {
        return settdate;
    }

    public void setSettdate(String settdate) {
        this.settdate = settdate == null ? null : settdate.trim();
    }

    public String getKeyRevsal() {
        return keyRevsal;
    }

    public void setKeyRevsal(String keyRevsal) {
        this.keyRevsal = keyRevsal == null ? null : keyRevsal.trim();
    }

    public String getKeyCancel() {
        return keyCancel;
    }

    public void setKeyCancel(String keyCancel) {
        this.keyCancel = keyCancel == null ? null : keyCancel.trim();
    }

    public String getTransstatus() {
        return transstatus;
    }

    public void setTransstatus(String transstatus) {
        this.transstatus = transstatus == null ? null : transstatus.trim();
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode == null ? null : errcode.trim();
    }

    public String getErrinfo() {
        return errinfo;
    }

    public void setErrinfo(String errinfo) {
        this.errinfo = errinfo == null ? null : errinfo.trim();
    }

    public String getReqinfo() {
        return reqinfo;
    }

    public void setReqinfo(String reqinfo) {
        this.reqinfo = reqinfo == null ? null : reqinfo.trim();
    }

    public String getSalemode() {
        return salemode;
    }

    public void setSalemode(String salemode) {
        this.salemode = salemode == null ? null : salemode.trim();
    }

    public BigDecimal getRelcentseq() {
        return relcentseq;
    }

    public void setRelcentseq(BigDecimal relcentseq) {
        this.relcentseq = relcentseq;
    }

    public Integer getCardkind() {
        return cardkind;
    }

    public void setCardkind(Integer cardkind) {
        this.cardkind = cardkind;
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode == null ? null : paymode.trim();
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

    public String getRsvd4() {
        return rsvd4;
    }

    public void setRsvd4(String rsvd4) {
        this.rsvd4 = rsvd4 == null ? null : rsvd4.trim();
    }
}