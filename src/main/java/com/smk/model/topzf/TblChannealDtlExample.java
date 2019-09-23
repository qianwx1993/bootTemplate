package com.smk.model.topzf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblChannealDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblChannealDtlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andTochannelIsNull() {
            addCriterion("TOCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andTochannelIsNotNull() {
            addCriterion("TOCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andTochannelEqualTo(String value) {
            addCriterion("TOCHANNEL =", value, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelNotEqualTo(String value) {
            addCriterion("TOCHANNEL <>", value, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelGreaterThan(String value) {
            addCriterion("TOCHANNEL >", value, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelGreaterThanOrEqualTo(String value) {
            addCriterion("TOCHANNEL >=", value, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelLessThan(String value) {
            addCriterion("TOCHANNEL <", value, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelLessThanOrEqualTo(String value) {
            addCriterion("TOCHANNEL <=", value, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelLike(String value) {
            addCriterion("TOCHANNEL like", value, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelNotLike(String value) {
            addCriterion("TOCHANNEL not like", value, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelIn(List<String> values) {
            addCriterion("TOCHANNEL in", values, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelNotIn(List<String> values) {
            addCriterion("TOCHANNEL not in", values, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelBetween(String value1, String value2) {
            addCriterion("TOCHANNEL between", value1, value2, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTochannelNotBetween(String value1, String value2) {
            addCriterion("TOCHANNEL not between", value1, value2, "tochannel");
            return (Criteria) this;
        }

        public Criteria andTxntypeIsNull() {
            addCriterion("TXNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTxntypeIsNotNull() {
            addCriterion("TXNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTxntypeEqualTo(String value) {
            addCriterion("TXNTYPE =", value, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeNotEqualTo(String value) {
            addCriterion("TXNTYPE <>", value, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeGreaterThan(String value) {
            addCriterion("TXNTYPE >", value, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeGreaterThanOrEqualTo(String value) {
            addCriterion("TXNTYPE >=", value, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeLessThan(String value) {
            addCriterion("TXNTYPE <", value, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeLessThanOrEqualTo(String value) {
            addCriterion("TXNTYPE <=", value, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeLike(String value) {
            addCriterion("TXNTYPE like", value, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeNotLike(String value) {
            addCriterion("TXNTYPE not like", value, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeIn(List<String> values) {
            addCriterion("TXNTYPE in", values, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeNotIn(List<String> values) {
            addCriterion("TXNTYPE not in", values, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeBetween(String value1, String value2) {
            addCriterion("TXNTYPE between", value1, value2, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxntypeNotBetween(String value1, String value2) {
            addCriterion("TXNTYPE not between", value1, value2, "txntype");
            return (Criteria) this;
        }

        public Criteria andTxndateIsNull() {
            addCriterion("TXNDATE is null");
            return (Criteria) this;
        }

        public Criteria andTxndateIsNotNull() {
            addCriterion("TXNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTxndateEqualTo(String value) {
            addCriterion("TXNDATE =", value, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateNotEqualTo(String value) {
            addCriterion("TXNDATE <>", value, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateGreaterThan(String value) {
            addCriterion("TXNDATE >", value, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateGreaterThanOrEqualTo(String value) {
            addCriterion("TXNDATE >=", value, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateLessThan(String value) {
            addCriterion("TXNDATE <", value, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateLessThanOrEqualTo(String value) {
            addCriterion("TXNDATE <=", value, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateLike(String value) {
            addCriterion("TXNDATE like", value, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateNotLike(String value) {
            addCriterion("TXNDATE not like", value, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateIn(List<String> values) {
            addCriterion("TXNDATE in", values, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateNotIn(List<String> values) {
            addCriterion("TXNDATE not in", values, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateBetween(String value1, String value2) {
            addCriterion("TXNDATE between", value1, value2, "txndate");
            return (Criteria) this;
        }

        public Criteria andTxndateNotBetween(String value1, String value2) {
            addCriterion("TXNDATE not between", value1, value2, "txndate");
            return (Criteria) this;
        }

        public Criteria andReqseqIsNull() {
            addCriterion("REQSEQ is null");
            return (Criteria) this;
        }

        public Criteria andReqseqIsNotNull() {
            addCriterion("REQSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andReqseqEqualTo(String value) {
            addCriterion("REQSEQ =", value, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqNotEqualTo(String value) {
            addCriterion("REQSEQ <>", value, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqGreaterThan(String value) {
            addCriterion("REQSEQ >", value, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqGreaterThanOrEqualTo(String value) {
            addCriterion("REQSEQ >=", value, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqLessThan(String value) {
            addCriterion("REQSEQ <", value, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqLessThanOrEqualTo(String value) {
            addCriterion("REQSEQ <=", value, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqLike(String value) {
            addCriterion("REQSEQ like", value, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqNotLike(String value) {
            addCriterion("REQSEQ not like", value, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqIn(List<String> values) {
            addCriterion("REQSEQ in", values, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqNotIn(List<String> values) {
            addCriterion("REQSEQ not in", values, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqBetween(String value1, String value2) {
            addCriterion("REQSEQ between", value1, value2, "reqseq");
            return (Criteria) this;
        }

        public Criteria andReqseqNotBetween(String value1, String value2) {
            addCriterion("REQSEQ not between", value1, value2, "reqseq");
            return (Criteria) this;
        }

        public Criteria andMchntidIsNull() {
            addCriterion("MCHNTID is null");
            return (Criteria) this;
        }

        public Criteria andMchntidIsNotNull() {
            addCriterion("MCHNTID is not null");
            return (Criteria) this;
        }

        public Criteria andMchntidEqualTo(String value) {
            addCriterion("MCHNTID =", value, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidNotEqualTo(String value) {
            addCriterion("MCHNTID <>", value, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidGreaterThan(String value) {
            addCriterion("MCHNTID >", value, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNTID >=", value, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidLessThan(String value) {
            addCriterion("MCHNTID <", value, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidLessThanOrEqualTo(String value) {
            addCriterion("MCHNTID <=", value, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidLike(String value) {
            addCriterion("MCHNTID like", value, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidNotLike(String value) {
            addCriterion("MCHNTID not like", value, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidIn(List<String> values) {
            addCriterion("MCHNTID in", values, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidNotIn(List<String> values) {
            addCriterion("MCHNTID not in", values, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidBetween(String value1, String value2) {
            addCriterion("MCHNTID between", value1, value2, "mchntid");
            return (Criteria) this;
        }

        public Criteria andMchntidNotBetween(String value1, String value2) {
            addCriterion("MCHNTID not between", value1, value2, "mchntid");
            return (Criteria) this;
        }

        public Criteria andTxntimeIsNull() {
            addCriterion("TXNTIME is null");
            return (Criteria) this;
        }

        public Criteria andTxntimeIsNotNull() {
            addCriterion("TXNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTxntimeEqualTo(String value) {
            addCriterion("TXNTIME =", value, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeNotEqualTo(String value) {
            addCriterion("TXNTIME <>", value, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeGreaterThan(String value) {
            addCriterion("TXNTIME >", value, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeGreaterThanOrEqualTo(String value) {
            addCriterion("TXNTIME >=", value, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeLessThan(String value) {
            addCriterion("TXNTIME <", value, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeLessThanOrEqualTo(String value) {
            addCriterion("TXNTIME <=", value, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeLike(String value) {
            addCriterion("TXNTIME like", value, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeNotLike(String value) {
            addCriterion("TXNTIME not like", value, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeIn(List<String> values) {
            addCriterion("TXNTIME in", values, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeNotIn(List<String> values) {
            addCriterion("TXNTIME not in", values, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeBetween(String value1, String value2) {
            addCriterion("TXNTIME between", value1, value2, "txntime");
            return (Criteria) this;
        }

        public Criteria andTxntimeNotBetween(String value1, String value2) {
            addCriterion("TXNTIME not between", value1, value2, "txntime");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCentseqIsNull() {
            addCriterion("CENTSEQ is null");
            return (Criteria) this;
        }

        public Criteria andCentseqIsNotNull() {
            addCriterion("CENTSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCentseqEqualTo(String value) {
            addCriterion("CENTSEQ =", value, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqNotEqualTo(String value) {
            addCriterion("CENTSEQ <>", value, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqGreaterThan(String value) {
            addCriterion("CENTSEQ >", value, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqGreaterThanOrEqualTo(String value) {
            addCriterion("CENTSEQ >=", value, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqLessThan(String value) {
            addCriterion("CENTSEQ <", value, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqLessThanOrEqualTo(String value) {
            addCriterion("CENTSEQ <=", value, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqLike(String value) {
            addCriterion("CENTSEQ like", value, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqNotLike(String value) {
            addCriterion("CENTSEQ not like", value, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqIn(List<String> values) {
            addCriterion("CENTSEQ in", values, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqNotIn(List<String> values) {
            addCriterion("CENTSEQ not in", values, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqBetween(String value1, String value2) {
            addCriterion("CENTSEQ between", value1, value2, "centseq");
            return (Criteria) this;
        }

        public Criteria andCentseqNotBetween(String value1, String value2) {
            addCriterion("CENTSEQ not between", value1, value2, "centseq");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefIsNull() {
            addCriterion("RETRIVLREF is null");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefIsNotNull() {
            addCriterion("RETRIVLREF is not null");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefEqualTo(String value) {
            addCriterion("RETRIVLREF =", value, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefNotEqualTo(String value) {
            addCriterion("RETRIVLREF <>", value, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefGreaterThan(String value) {
            addCriterion("RETRIVLREF >", value, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefGreaterThanOrEqualTo(String value) {
            addCriterion("RETRIVLREF >=", value, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefLessThan(String value) {
            addCriterion("RETRIVLREF <", value, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefLessThanOrEqualTo(String value) {
            addCriterion("RETRIVLREF <=", value, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefLike(String value) {
            addCriterion("RETRIVLREF like", value, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefNotLike(String value) {
            addCriterion("RETRIVLREF not like", value, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefIn(List<String> values) {
            addCriterion("RETRIVLREF in", values, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefNotIn(List<String> values) {
            addCriterion("RETRIVLREF not in", values, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefBetween(String value1, String value2) {
            addCriterion("RETRIVLREF between", value1, value2, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andRetrivlrefNotBetween(String value1, String value2) {
            addCriterion("RETRIVLREF not between", value1, value2, "retrivlref");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("CARDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("CARDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("CARDNUMBER =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("CARDNUMBER <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("CARDNUMBER >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CARDNUMBER >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("CARDNUMBER <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("CARDNUMBER <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("CARDNUMBER like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("CARDNUMBER not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("CARDNUMBER in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("CARDNUMBER not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("CARDNUMBER between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("CARDNUMBER not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andTxnamtIsNull() {
            addCriterion("TXNAMT is null");
            return (Criteria) this;
        }

        public Criteria andTxnamtIsNotNull() {
            addCriterion("TXNAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTxnamtEqualTo(String value) {
            addCriterion("TXNAMT =", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtNotEqualTo(String value) {
            addCriterion("TXNAMT <>", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtGreaterThan(String value) {
            addCriterion("TXNAMT >", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtGreaterThanOrEqualTo(String value) {
            addCriterion("TXNAMT >=", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtLessThan(String value) {
            addCriterion("TXNAMT <", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtLessThanOrEqualTo(String value) {
            addCriterion("TXNAMT <=", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtLike(String value) {
            addCriterion("TXNAMT like", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtNotLike(String value) {
            addCriterion("TXNAMT not like", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtIn(List<String> values) {
            addCriterion("TXNAMT in", values, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtNotIn(List<String> values) {
            addCriterion("TXNAMT not in", values, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtBetween(String value1, String value2) {
            addCriterion("TXNAMT between", value1, value2, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtNotBetween(String value1, String value2) {
            addCriterion("TXNAMT not between", value1, value2, "txnamt");
            return (Criteria) this;
        }

        public Criteria andReqtypeIsNull() {
            addCriterion("REQTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReqtypeIsNotNull() {
            addCriterion("REQTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReqtypeEqualTo(String value) {
            addCriterion("REQTYPE =", value, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeNotEqualTo(String value) {
            addCriterion("REQTYPE <>", value, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeGreaterThan(String value) {
            addCriterion("REQTYPE >", value, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeGreaterThanOrEqualTo(String value) {
            addCriterion("REQTYPE >=", value, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeLessThan(String value) {
            addCriterion("REQTYPE <", value, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeLessThanOrEqualTo(String value) {
            addCriterion("REQTYPE <=", value, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeLike(String value) {
            addCriterion("REQTYPE like", value, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeNotLike(String value) {
            addCriterion("REQTYPE not like", value, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeIn(List<String> values) {
            addCriterion("REQTYPE in", values, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeNotIn(List<String> values) {
            addCriterion("REQTYPE not in", values, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeBetween(String value1, String value2) {
            addCriterion("REQTYPE between", value1, value2, "reqtype");
            return (Criteria) this;
        }

        public Criteria andReqtypeNotBetween(String value1, String value2) {
            addCriterion("REQTYPE not between", value1, value2, "reqtype");
            return (Criteria) this;
        }

        public Criteria andSettdateIsNull() {
            addCriterion("SETTDATE is null");
            return (Criteria) this;
        }

        public Criteria andSettdateIsNotNull() {
            addCriterion("SETTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSettdateEqualTo(String value) {
            addCriterion("SETTDATE =", value, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateNotEqualTo(String value) {
            addCriterion("SETTDATE <>", value, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateGreaterThan(String value) {
            addCriterion("SETTDATE >", value, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateGreaterThanOrEqualTo(String value) {
            addCriterion("SETTDATE >=", value, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateLessThan(String value) {
            addCriterion("SETTDATE <", value, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateLessThanOrEqualTo(String value) {
            addCriterion("SETTDATE <=", value, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateLike(String value) {
            addCriterion("SETTDATE like", value, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateNotLike(String value) {
            addCriterion("SETTDATE not like", value, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateIn(List<String> values) {
            addCriterion("SETTDATE in", values, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateNotIn(List<String> values) {
            addCriterion("SETTDATE not in", values, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateBetween(String value1, String value2) {
            addCriterion("SETTDATE between", value1, value2, "settdate");
            return (Criteria) this;
        }

        public Criteria andSettdateNotBetween(String value1, String value2) {
            addCriterion("SETTDATE not between", value1, value2, "settdate");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalIsNull() {
            addCriterion("KEY_REVSAL is null");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalIsNotNull() {
            addCriterion("KEY_REVSAL is not null");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalEqualTo(String value) {
            addCriterion("KEY_REVSAL =", value, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalNotEqualTo(String value) {
            addCriterion("KEY_REVSAL <>", value, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalGreaterThan(String value) {
            addCriterion("KEY_REVSAL >", value, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_REVSAL >=", value, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalLessThan(String value) {
            addCriterion("KEY_REVSAL <", value, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalLessThanOrEqualTo(String value) {
            addCriterion("KEY_REVSAL <=", value, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalLike(String value) {
            addCriterion("KEY_REVSAL like", value, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalNotLike(String value) {
            addCriterion("KEY_REVSAL not like", value, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalIn(List<String> values) {
            addCriterion("KEY_REVSAL in", values, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalNotIn(List<String> values) {
            addCriterion("KEY_REVSAL not in", values, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalBetween(String value1, String value2) {
            addCriterion("KEY_REVSAL between", value1, value2, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyRevsalNotBetween(String value1, String value2) {
            addCriterion("KEY_REVSAL not between", value1, value2, "keyRevsal");
            return (Criteria) this;
        }

        public Criteria andKeyCancelIsNull() {
            addCriterion("KEY_CANCEL is null");
            return (Criteria) this;
        }

        public Criteria andKeyCancelIsNotNull() {
            addCriterion("KEY_CANCEL is not null");
            return (Criteria) this;
        }

        public Criteria andKeyCancelEqualTo(String value) {
            addCriterion("KEY_CANCEL =", value, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelNotEqualTo(String value) {
            addCriterion("KEY_CANCEL <>", value, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelGreaterThan(String value) {
            addCriterion("KEY_CANCEL >", value, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_CANCEL >=", value, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelLessThan(String value) {
            addCriterion("KEY_CANCEL <", value, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelLessThanOrEqualTo(String value) {
            addCriterion("KEY_CANCEL <=", value, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelLike(String value) {
            addCriterion("KEY_CANCEL like", value, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelNotLike(String value) {
            addCriterion("KEY_CANCEL not like", value, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelIn(List<String> values) {
            addCriterion("KEY_CANCEL in", values, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelNotIn(List<String> values) {
            addCriterion("KEY_CANCEL not in", values, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelBetween(String value1, String value2) {
            addCriterion("KEY_CANCEL between", value1, value2, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andKeyCancelNotBetween(String value1, String value2) {
            addCriterion("KEY_CANCEL not between", value1, value2, "keyCancel");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNull() {
            addCriterion("TRANSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNotNull() {
            addCriterion("TRANSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransstatusEqualTo(String value) {
            addCriterion("TRANSSTATUS =", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotEqualTo(String value) {
            addCriterion("TRANSSTATUS <>", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThan(String value) {
            addCriterion("TRANSSTATUS >", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSTATUS >=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThan(String value) {
            addCriterion("TRANSSTATUS <", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThanOrEqualTo(String value) {
            addCriterion("TRANSSTATUS <=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLike(String value) {
            addCriterion("TRANSSTATUS like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotLike(String value) {
            addCriterion("TRANSSTATUS not like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusIn(List<String> values) {
            addCriterion("TRANSSTATUS in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotIn(List<String> values) {
            addCriterion("TRANSSTATUS not in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusBetween(String value1, String value2) {
            addCriterion("TRANSSTATUS between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotBetween(String value1, String value2) {
            addCriterion("TRANSSTATUS not between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNull() {
            addCriterion("ERRCODE is null");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNotNull() {
            addCriterion("ERRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrcodeEqualTo(String value) {
            addCriterion("ERRCODE =", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotEqualTo(String value) {
            addCriterion("ERRCODE <>", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThan(String value) {
            addCriterion("ERRCODE >", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERRCODE >=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThan(String value) {
            addCriterion("ERRCODE <", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThanOrEqualTo(String value) {
            addCriterion("ERRCODE <=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLike(String value) {
            addCriterion("ERRCODE like", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotLike(String value) {
            addCriterion("ERRCODE not like", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeIn(List<String> values) {
            addCriterion("ERRCODE in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotIn(List<String> values) {
            addCriterion("ERRCODE not in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeBetween(String value1, String value2) {
            addCriterion("ERRCODE between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotBetween(String value1, String value2) {
            addCriterion("ERRCODE not between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrinfoIsNull() {
            addCriterion("ERRINFO is null");
            return (Criteria) this;
        }

        public Criteria andErrinfoIsNotNull() {
            addCriterion("ERRINFO is not null");
            return (Criteria) this;
        }

        public Criteria andErrinfoEqualTo(String value) {
            addCriterion("ERRINFO =", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoNotEqualTo(String value) {
            addCriterion("ERRINFO <>", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoGreaterThan(String value) {
            addCriterion("ERRINFO >", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ERRINFO >=", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoLessThan(String value) {
            addCriterion("ERRINFO <", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoLessThanOrEqualTo(String value) {
            addCriterion("ERRINFO <=", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoLike(String value) {
            addCriterion("ERRINFO like", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoNotLike(String value) {
            addCriterion("ERRINFO not like", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoIn(List<String> values) {
            addCriterion("ERRINFO in", values, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoNotIn(List<String> values) {
            addCriterion("ERRINFO not in", values, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoBetween(String value1, String value2) {
            addCriterion("ERRINFO between", value1, value2, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoNotBetween(String value1, String value2) {
            addCriterion("ERRINFO not between", value1, value2, "errinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoIsNull() {
            addCriterion("REQINFO is null");
            return (Criteria) this;
        }

        public Criteria andReqinfoIsNotNull() {
            addCriterion("REQINFO is not null");
            return (Criteria) this;
        }

        public Criteria andReqinfoEqualTo(String value) {
            addCriterion("REQINFO =", value, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoNotEqualTo(String value) {
            addCriterion("REQINFO <>", value, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoGreaterThan(String value) {
            addCriterion("REQINFO >", value, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoGreaterThanOrEqualTo(String value) {
            addCriterion("REQINFO >=", value, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoLessThan(String value) {
            addCriterion("REQINFO <", value, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoLessThanOrEqualTo(String value) {
            addCriterion("REQINFO <=", value, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoLike(String value) {
            addCriterion("REQINFO like", value, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoNotLike(String value) {
            addCriterion("REQINFO not like", value, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoIn(List<String> values) {
            addCriterion("REQINFO in", values, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoNotIn(List<String> values) {
            addCriterion("REQINFO not in", values, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoBetween(String value1, String value2) {
            addCriterion("REQINFO between", value1, value2, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andReqinfoNotBetween(String value1, String value2) {
            addCriterion("REQINFO not between", value1, value2, "reqinfo");
            return (Criteria) this;
        }

        public Criteria andSalemodeIsNull() {
            addCriterion("SALEMODE is null");
            return (Criteria) this;
        }

        public Criteria andSalemodeIsNotNull() {
            addCriterion("SALEMODE is not null");
            return (Criteria) this;
        }

        public Criteria andSalemodeEqualTo(String value) {
            addCriterion("SALEMODE =", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotEqualTo(String value) {
            addCriterion("SALEMODE <>", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeGreaterThan(String value) {
            addCriterion("SALEMODE >", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeGreaterThanOrEqualTo(String value) {
            addCriterion("SALEMODE >=", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeLessThan(String value) {
            addCriterion("SALEMODE <", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeLessThanOrEqualTo(String value) {
            addCriterion("SALEMODE <=", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeLike(String value) {
            addCriterion("SALEMODE like", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotLike(String value) {
            addCriterion("SALEMODE not like", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeIn(List<String> values) {
            addCriterion("SALEMODE in", values, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotIn(List<String> values) {
            addCriterion("SALEMODE not in", values, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeBetween(String value1, String value2) {
            addCriterion("SALEMODE between", value1, value2, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotBetween(String value1, String value2) {
            addCriterion("SALEMODE not between", value1, value2, "salemode");
            return (Criteria) this;
        }

        public Criteria andRelcentseqIsNull() {
            addCriterion("RELCENTSEQ is null");
            return (Criteria) this;
        }

        public Criteria andRelcentseqIsNotNull() {
            addCriterion("RELCENTSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRelcentseqEqualTo(BigDecimal value) {
            addCriterion("RELCENTSEQ =", value, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqNotEqualTo(BigDecimal value) {
            addCriterion("RELCENTSEQ <>", value, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqGreaterThan(BigDecimal value) {
            addCriterion("RELCENTSEQ >", value, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELCENTSEQ >=", value, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqLessThan(BigDecimal value) {
            addCriterion("RELCENTSEQ <", value, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELCENTSEQ <=", value, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqIn(List<BigDecimal> values) {
            addCriterion("RELCENTSEQ in", values, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqNotIn(List<BigDecimal> values) {
            addCriterion("RELCENTSEQ not in", values, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELCENTSEQ between", value1, value2, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andRelcentseqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELCENTSEQ not between", value1, value2, "relcentseq");
            return (Criteria) this;
        }

        public Criteria andCardkindIsNull() {
            addCriterion("CARDKIND is null");
            return (Criteria) this;
        }

        public Criteria andCardkindIsNotNull() {
            addCriterion("CARDKIND is not null");
            return (Criteria) this;
        }

        public Criteria andCardkindEqualTo(Integer value) {
            addCriterion("CARDKIND =", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindNotEqualTo(Integer value) {
            addCriterion("CARDKIND <>", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindGreaterThan(Integer value) {
            addCriterion("CARDKIND >", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARDKIND >=", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindLessThan(Integer value) {
            addCriterion("CARDKIND <", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindLessThanOrEqualTo(Integer value) {
            addCriterion("CARDKIND <=", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindIn(List<Integer> values) {
            addCriterion("CARDKIND in", values, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindNotIn(List<Integer> values) {
            addCriterion("CARDKIND not in", values, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindBetween(Integer value1, Integer value2) {
            addCriterion("CARDKIND between", value1, value2, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindNotBetween(Integer value1, Integer value2) {
            addCriterion("CARDKIND not between", value1, value2, "cardkind");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNull() {
            addCriterion("PAYMODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNotNull() {
            addCriterion("PAYMODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymodeEqualTo(String value) {
            addCriterion("PAYMODE =", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotEqualTo(String value) {
            addCriterion("PAYMODE <>", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThan(String value) {
            addCriterion("PAYMODE >", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMODE >=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThan(String value) {
            addCriterion("PAYMODE <", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMODE <=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLike(String value) {
            addCriterion("PAYMODE like", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotLike(String value) {
            addCriterion("PAYMODE not like", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeIn(List<String> values) {
            addCriterion("PAYMODE in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotIn(List<String> values) {
            addCriterion("PAYMODE not in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeBetween(String value1, String value2) {
            addCriterion("PAYMODE between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotBetween(String value1, String value2) {
            addCriterion("PAYMODE not between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andRsvd1IsNull() {
            addCriterion("RSVD1 is null");
            return (Criteria) this;
        }

        public Criteria andRsvd1IsNotNull() {
            addCriterion("RSVD1 is not null");
            return (Criteria) this;
        }

        public Criteria andRsvd1EqualTo(String value) {
            addCriterion("RSVD1 =", value, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1NotEqualTo(String value) {
            addCriterion("RSVD1 <>", value, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1GreaterThan(String value) {
            addCriterion("RSVD1 >", value, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1GreaterThanOrEqualTo(String value) {
            addCriterion("RSVD1 >=", value, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1LessThan(String value) {
            addCriterion("RSVD1 <", value, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1LessThanOrEqualTo(String value) {
            addCriterion("RSVD1 <=", value, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1Like(String value) {
            addCriterion("RSVD1 like", value, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1NotLike(String value) {
            addCriterion("RSVD1 not like", value, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1In(List<String> values) {
            addCriterion("RSVD1 in", values, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1NotIn(List<String> values) {
            addCriterion("RSVD1 not in", values, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1Between(String value1, String value2) {
            addCriterion("RSVD1 between", value1, value2, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd1NotBetween(String value1, String value2) {
            addCriterion("RSVD1 not between", value1, value2, "rsvd1");
            return (Criteria) this;
        }

        public Criteria andRsvd2IsNull() {
            addCriterion("RSVD2 is null");
            return (Criteria) this;
        }

        public Criteria andRsvd2IsNotNull() {
            addCriterion("RSVD2 is not null");
            return (Criteria) this;
        }

        public Criteria andRsvd2EqualTo(String value) {
            addCriterion("RSVD2 =", value, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2NotEqualTo(String value) {
            addCriterion("RSVD2 <>", value, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2GreaterThan(String value) {
            addCriterion("RSVD2 >", value, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2GreaterThanOrEqualTo(String value) {
            addCriterion("RSVD2 >=", value, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2LessThan(String value) {
            addCriterion("RSVD2 <", value, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2LessThanOrEqualTo(String value) {
            addCriterion("RSVD2 <=", value, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2Like(String value) {
            addCriterion("RSVD2 like", value, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2NotLike(String value) {
            addCriterion("RSVD2 not like", value, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2In(List<String> values) {
            addCriterion("RSVD2 in", values, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2NotIn(List<String> values) {
            addCriterion("RSVD2 not in", values, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2Between(String value1, String value2) {
            addCriterion("RSVD2 between", value1, value2, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd2NotBetween(String value1, String value2) {
            addCriterion("RSVD2 not between", value1, value2, "rsvd2");
            return (Criteria) this;
        }

        public Criteria andRsvd3IsNull() {
            addCriterion("RSVD3 is null");
            return (Criteria) this;
        }

        public Criteria andRsvd3IsNotNull() {
            addCriterion("RSVD3 is not null");
            return (Criteria) this;
        }

        public Criteria andRsvd3EqualTo(String value) {
            addCriterion("RSVD3 =", value, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3NotEqualTo(String value) {
            addCriterion("RSVD3 <>", value, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3GreaterThan(String value) {
            addCriterion("RSVD3 >", value, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3GreaterThanOrEqualTo(String value) {
            addCriterion("RSVD3 >=", value, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3LessThan(String value) {
            addCriterion("RSVD3 <", value, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3LessThanOrEqualTo(String value) {
            addCriterion("RSVD3 <=", value, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3Like(String value) {
            addCriterion("RSVD3 like", value, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3NotLike(String value) {
            addCriterion("RSVD3 not like", value, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3In(List<String> values) {
            addCriterion("RSVD3 in", values, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3NotIn(List<String> values) {
            addCriterion("RSVD3 not in", values, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3Between(String value1, String value2) {
            addCriterion("RSVD3 between", value1, value2, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd3NotBetween(String value1, String value2) {
            addCriterion("RSVD3 not between", value1, value2, "rsvd3");
            return (Criteria) this;
        }

        public Criteria andRsvd4IsNull() {
            addCriterion("RSVD4 is null");
            return (Criteria) this;
        }

        public Criteria andRsvd4IsNotNull() {
            addCriterion("RSVD4 is not null");
            return (Criteria) this;
        }

        public Criteria andRsvd4EqualTo(String value) {
            addCriterion("RSVD4 =", value, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4NotEqualTo(String value) {
            addCriterion("RSVD4 <>", value, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4GreaterThan(String value) {
            addCriterion("RSVD4 >", value, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4GreaterThanOrEqualTo(String value) {
            addCriterion("RSVD4 >=", value, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4LessThan(String value) {
            addCriterion("RSVD4 <", value, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4LessThanOrEqualTo(String value) {
            addCriterion("RSVD4 <=", value, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4Like(String value) {
            addCriterion("RSVD4 like", value, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4NotLike(String value) {
            addCriterion("RSVD4 not like", value, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4In(List<String> values) {
            addCriterion("RSVD4 in", values, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4NotIn(List<String> values) {
            addCriterion("RSVD4 not in", values, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4Between(String value1, String value2) {
            addCriterion("RSVD4 between", value1, value2, "rsvd4");
            return (Criteria) this;
        }

        public Criteria andRsvd4NotBetween(String value1, String value2) {
            addCriterion("RSVD4 not between", value1, value2, "rsvd4");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}