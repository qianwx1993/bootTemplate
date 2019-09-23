package com.smk.model.mcap;

import java.util.ArrayList;
import java.util.List;

public class BiTxnDetailTbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiTxnDetailTbExample() {
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

        public Criteria andLocalseqIsNull() {
            addCriterion("LOCALSEQ is null");
            return (Criteria) this;
        }

        public Criteria andLocalseqIsNotNull() {
            addCriterion("LOCALSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andLocalseqEqualTo(String value) {
            addCriterion("LOCALSEQ =", value, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqNotEqualTo(String value) {
            addCriterion("LOCALSEQ <>", value, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqGreaterThan(String value) {
            addCriterion("LOCALSEQ >", value, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALSEQ >=", value, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqLessThan(String value) {
            addCriterion("LOCALSEQ <", value, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqLessThanOrEqualTo(String value) {
            addCriterion("LOCALSEQ <=", value, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqLike(String value) {
            addCriterion("LOCALSEQ like", value, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqNotLike(String value) {
            addCriterion("LOCALSEQ not like", value, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqIn(List<String> values) {
            addCriterion("LOCALSEQ in", values, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqNotIn(List<String> values) {
            addCriterion("LOCALSEQ not in", values, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqBetween(String value1, String value2) {
            addCriterion("LOCALSEQ between", value1, value2, "localseq");
            return (Criteria) this;
        }

        public Criteria andLocalseqNotBetween(String value1, String value2) {
            addCriterion("LOCALSEQ not between", value1, value2, "localseq");
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

        public Criteria andMchntseqIsNull() {
            addCriterion("MCHNTSEQ is null");
            return (Criteria) this;
        }

        public Criteria andMchntseqIsNotNull() {
            addCriterion("MCHNTSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andMchntseqEqualTo(String value) {
            addCriterion("MCHNTSEQ =", value, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqNotEqualTo(String value) {
            addCriterion("MCHNTSEQ <>", value, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqGreaterThan(String value) {
            addCriterion("MCHNTSEQ >", value, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNTSEQ >=", value, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqLessThan(String value) {
            addCriterion("MCHNTSEQ <", value, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqLessThanOrEqualTo(String value) {
            addCriterion("MCHNTSEQ <=", value, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqLike(String value) {
            addCriterion("MCHNTSEQ like", value, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqNotLike(String value) {
            addCriterion("MCHNTSEQ not like", value, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqIn(List<String> values) {
            addCriterion("MCHNTSEQ in", values, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqNotIn(List<String> values) {
            addCriterion("MCHNTSEQ not in", values, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqBetween(String value1, String value2) {
            addCriterion("MCHNTSEQ between", value1, value2, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andMchntseqNotBetween(String value1, String value2) {
            addCriterion("MCHNTSEQ not between", value1, value2, "mchntseq");
            return (Criteria) this;
        }

        public Criteria andInsertdateIsNull() {
            addCriterion("INSERTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInsertdateIsNotNull() {
            addCriterion("INSERTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInsertdateEqualTo(String value) {
            addCriterion("INSERTDATE =", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotEqualTo(String value) {
            addCriterion("INSERTDATE <>", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateGreaterThan(String value) {
            addCriterion("INSERTDATE >", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateGreaterThanOrEqualTo(String value) {
            addCriterion("INSERTDATE >=", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateLessThan(String value) {
            addCriterion("INSERTDATE <", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateLessThanOrEqualTo(String value) {
            addCriterion("INSERTDATE <=", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateLike(String value) {
            addCriterion("INSERTDATE like", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotLike(String value) {
            addCriterion("INSERTDATE not like", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateIn(List<String> values) {
            addCriterion("INSERTDATE in", values, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotIn(List<String> values) {
            addCriterion("INSERTDATE not in", values, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateBetween(String value1, String value2) {
            addCriterion("INSERTDATE between", value1, value2, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotBetween(String value1, String value2) {
            addCriterion("INSERTDATE not between", value1, value2, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNull() {
            addCriterion("INSERTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNotNull() {
            addCriterion("INSERTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInserttimeEqualTo(String value) {
            addCriterion("INSERTTIME =", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotEqualTo(String value) {
            addCriterion("INSERTTIME <>", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThan(String value) {
            addCriterion("INSERTTIME >", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThanOrEqualTo(String value) {
            addCriterion("INSERTTIME >=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThan(String value) {
            addCriterion("INSERTTIME <", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThanOrEqualTo(String value) {
            addCriterion("INSERTTIME <=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLike(String value) {
            addCriterion("INSERTTIME like", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotLike(String value) {
            addCriterion("INSERTTIME not like", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeIn(List<String> values) {
            addCriterion("INSERTTIME in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotIn(List<String> values) {
            addCriterion("INSERTTIME not in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeBetween(String value1, String value2) {
            addCriterion("INSERTTIME between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotBetween(String value1, String value2) {
            addCriterion("INSERTTIME not between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andReqstrIsNull() {
            addCriterion("REQSTR is null");
            return (Criteria) this;
        }

        public Criteria andReqstrIsNotNull() {
            addCriterion("REQSTR is not null");
            return (Criteria) this;
        }

        public Criteria andReqstrEqualTo(String value) {
            addCriterion("REQSTR =", value, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrNotEqualTo(String value) {
            addCriterion("REQSTR <>", value, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrGreaterThan(String value) {
            addCriterion("REQSTR >", value, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrGreaterThanOrEqualTo(String value) {
            addCriterion("REQSTR >=", value, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrLessThan(String value) {
            addCriterion("REQSTR <", value, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrLessThanOrEqualTo(String value) {
            addCriterion("REQSTR <=", value, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrLike(String value) {
            addCriterion("REQSTR like", value, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrNotLike(String value) {
            addCriterion("REQSTR not like", value, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrIn(List<String> values) {
            addCriterion("REQSTR in", values, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrNotIn(List<String> values) {
            addCriterion("REQSTR not in", values, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrBetween(String value1, String value2) {
            addCriterion("REQSTR between", value1, value2, "reqstr");
            return (Criteria) this;
        }

        public Criteria andReqstrNotBetween(String value1, String value2) {
            addCriterion("REQSTR not between", value1, value2, "reqstr");
            return (Criteria) this;
        }

        public Criteria andResstrIsNull() {
            addCriterion("RESSTR is null");
            return (Criteria) this;
        }

        public Criteria andResstrIsNotNull() {
            addCriterion("RESSTR is not null");
            return (Criteria) this;
        }

        public Criteria andResstrEqualTo(String value) {
            addCriterion("RESSTR =", value, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrNotEqualTo(String value) {
            addCriterion("RESSTR <>", value, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrGreaterThan(String value) {
            addCriterion("RESSTR >", value, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrGreaterThanOrEqualTo(String value) {
            addCriterion("RESSTR >=", value, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrLessThan(String value) {
            addCriterion("RESSTR <", value, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrLessThanOrEqualTo(String value) {
            addCriterion("RESSTR <=", value, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrLike(String value) {
            addCriterion("RESSTR like", value, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrNotLike(String value) {
            addCriterion("RESSTR not like", value, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrIn(List<String> values) {
            addCriterion("RESSTR in", values, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrNotIn(List<String> values) {
            addCriterion("RESSTR not in", values, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrBetween(String value1, String value2) {
            addCriterion("RESSTR between", value1, value2, "resstr");
            return (Criteria) this;
        }

        public Criteria andResstrNotBetween(String value1, String value2) {
            addCriterion("RESSTR not between", value1, value2, "resstr");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNull() {
            addCriterion("RESPCODE is null");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNotNull() {
            addCriterion("RESPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRespcodeEqualTo(String value) {
            addCriterion("RESPCODE =", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotEqualTo(String value) {
            addCriterion("RESPCODE <>", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThan(String value) {
            addCriterion("RESPCODE >", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESPCODE >=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThan(String value) {
            addCriterion("RESPCODE <", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThanOrEqualTo(String value) {
            addCriterion("RESPCODE <=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLike(String value) {
            addCriterion("RESPCODE like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotLike(String value) {
            addCriterion("RESPCODE not like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeIn(List<String> values) {
            addCriterion("RESPCODE in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotIn(List<String> values) {
            addCriterion("RESPCODE not in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeBetween(String value1, String value2) {
            addCriterion("RESPCODE between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotBetween(String value1, String value2) {
            addCriterion("RESPCODE not between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andReqipIsNull() {
            addCriterion("REQIP is null");
            return (Criteria) this;
        }

        public Criteria andReqipIsNotNull() {
            addCriterion("REQIP is not null");
            return (Criteria) this;
        }

        public Criteria andReqipEqualTo(String value) {
            addCriterion("REQIP =", value, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipNotEqualTo(String value) {
            addCriterion("REQIP <>", value, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipGreaterThan(String value) {
            addCriterion("REQIP >", value, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipGreaterThanOrEqualTo(String value) {
            addCriterion("REQIP >=", value, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipLessThan(String value) {
            addCriterion("REQIP <", value, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipLessThanOrEqualTo(String value) {
            addCriterion("REQIP <=", value, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipLike(String value) {
            addCriterion("REQIP like", value, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipNotLike(String value) {
            addCriterion("REQIP not like", value, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipIn(List<String> values) {
            addCriterion("REQIP in", values, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipNotIn(List<String> values) {
            addCriterion("REQIP not in", values, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipBetween(String value1, String value2) {
            addCriterion("REQIP between", value1, value2, "reqip");
            return (Criteria) this;
        }

        public Criteria andReqipNotBetween(String value1, String value2) {
            addCriterion("REQIP not between", value1, value2, "reqip");
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

        public Criteria andRespmsgIsNull() {
            addCriterion("RESPMSG is null");
            return (Criteria) this;
        }

        public Criteria andRespmsgIsNotNull() {
            addCriterion("RESPMSG is not null");
            return (Criteria) this;
        }

        public Criteria andRespmsgEqualTo(String value) {
            addCriterion("RESPMSG =", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotEqualTo(String value) {
            addCriterion("RESPMSG <>", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgGreaterThan(String value) {
            addCriterion("RESPMSG >", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESPMSG >=", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLessThan(String value) {
            addCriterion("RESPMSG <", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLessThanOrEqualTo(String value) {
            addCriterion("RESPMSG <=", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLike(String value) {
            addCriterion("RESPMSG like", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotLike(String value) {
            addCriterion("RESPMSG not like", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgIn(List<String> values) {
            addCriterion("RESPMSG in", values, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotIn(List<String> values) {
            addCriterion("RESPMSG not in", values, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgBetween(String value1, String value2) {
            addCriterion("RESPMSG between", value1, value2, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotBetween(String value1, String value2) {
            addCriterion("RESPMSG not between", value1, value2, "respmsg");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("RETURNTIME is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("RETURNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(String value) {
            addCriterion("RETURNTIME =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(String value) {
            addCriterion("RETURNTIME <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(String value) {
            addCriterion("RETURNTIME >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNTIME >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(String value) {
            addCriterion("RETURNTIME <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(String value) {
            addCriterion("RETURNTIME <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLike(String value) {
            addCriterion("RETURNTIME like", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotLike(String value) {
            addCriterion("RETURNTIME not like", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<String> values) {
            addCriterion("RETURNTIME in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<String> values) {
            addCriterion("RETURNTIME not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(String value1, String value2) {
            addCriterion("RETURNTIME between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(String value1, String value2) {
            addCriterion("RETURNTIME not between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNull() {
            addCriterion("DEALTIME is null");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNotNull() {
            addCriterion("DEALTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDealtimeEqualTo(Integer value) {
            addCriterion("DEALTIME =", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotEqualTo(Integer value) {
            addCriterion("DEALTIME <>", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThan(Integer value) {
            addCriterion("DEALTIME >", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEALTIME >=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThan(Integer value) {
            addCriterion("DEALTIME <", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThanOrEqualTo(Integer value) {
            addCriterion("DEALTIME <=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIn(List<Integer> values) {
            addCriterion("DEALTIME in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotIn(List<Integer> values) {
            addCriterion("DEALTIME not in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeBetween(Integer value1, Integer value2) {
            addCriterion("DEALTIME between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("DEALTIME not between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
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