package com.smk.model.mcap;

import java.util.ArrayList;
import java.util.List;

public class BiExpTxnLogTbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiExpTxnLogTbExample() {
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

        public Criteria andChmchntidIsNull() {
            addCriterion("CHMCHNTID is null");
            return (Criteria) this;
        }

        public Criteria andChmchntidIsNotNull() {
            addCriterion("CHMCHNTID is not null");
            return (Criteria) this;
        }

        public Criteria andChmchntidEqualTo(String value) {
            addCriterion("CHMCHNTID =", value, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidNotEqualTo(String value) {
            addCriterion("CHMCHNTID <>", value, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidGreaterThan(String value) {
            addCriterion("CHMCHNTID >", value, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidGreaterThanOrEqualTo(String value) {
            addCriterion("CHMCHNTID >=", value, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidLessThan(String value) {
            addCriterion("CHMCHNTID <", value, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidLessThanOrEqualTo(String value) {
            addCriterion("CHMCHNTID <=", value, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidLike(String value) {
            addCriterion("CHMCHNTID like", value, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidNotLike(String value) {
            addCriterion("CHMCHNTID not like", value, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidIn(List<String> values) {
            addCriterion("CHMCHNTID in", values, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidNotIn(List<String> values) {
            addCriterion("CHMCHNTID not in", values, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidBetween(String value1, String value2) {
            addCriterion("CHMCHNTID between", value1, value2, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andChmchntidNotBetween(String value1, String value2) {
            addCriterion("CHMCHNTID not between", value1, value2, "chmchntid");
            return (Criteria) this;
        }

        public Criteria andPosidIsNull() {
            addCriterion("POSID is null");
            return (Criteria) this;
        }

        public Criteria andPosidIsNotNull() {
            addCriterion("POSID is not null");
            return (Criteria) this;
        }

        public Criteria andPosidEqualTo(String value) {
            addCriterion("POSID =", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotEqualTo(String value) {
            addCriterion("POSID <>", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidGreaterThan(String value) {
            addCriterion("POSID >", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidGreaterThanOrEqualTo(String value) {
            addCriterion("POSID >=", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLessThan(String value) {
            addCriterion("POSID <", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLessThanOrEqualTo(String value) {
            addCriterion("POSID <=", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLike(String value) {
            addCriterion("POSID like", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotLike(String value) {
            addCriterion("POSID not like", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidIn(List<String> values) {
            addCriterion("POSID in", values, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotIn(List<String> values) {
            addCriterion("POSID not in", values, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidBetween(String value1, String value2) {
            addCriterion("POSID between", value1, value2, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotBetween(String value1, String value2) {
            addCriterion("POSID not between", value1, value2, "posid");
            return (Criteria) this;
        }

        public Criteria andChposidIsNull() {
            addCriterion("CHPOSID is null");
            return (Criteria) this;
        }

        public Criteria andChposidIsNotNull() {
            addCriterion("CHPOSID is not null");
            return (Criteria) this;
        }

        public Criteria andChposidEqualTo(String value) {
            addCriterion("CHPOSID =", value, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidNotEqualTo(String value) {
            addCriterion("CHPOSID <>", value, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidGreaterThan(String value) {
            addCriterion("CHPOSID >", value, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidGreaterThanOrEqualTo(String value) {
            addCriterion("CHPOSID >=", value, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidLessThan(String value) {
            addCriterion("CHPOSID <", value, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidLessThanOrEqualTo(String value) {
            addCriterion("CHPOSID <=", value, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidLike(String value) {
            addCriterion("CHPOSID like", value, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidNotLike(String value) {
            addCriterion("CHPOSID not like", value, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidIn(List<String> values) {
            addCriterion("CHPOSID in", values, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidNotIn(List<String> values) {
            addCriterion("CHPOSID not in", values, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidBetween(String value1, String value2) {
            addCriterion("CHPOSID between", value1, value2, "chposid");
            return (Criteria) this;
        }

        public Criteria andChposidNotBetween(String value1, String value2) {
            addCriterion("CHPOSID not between", value1, value2, "chposid");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andPostypeIsNull() {
            addCriterion("POSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPostypeIsNotNull() {
            addCriterion("POSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPostypeEqualTo(String value) {
            addCriterion("POSTYPE =", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotEqualTo(String value) {
            addCriterion("POSTYPE <>", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeGreaterThan(String value) {
            addCriterion("POSTYPE >", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTYPE >=", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLessThan(String value) {
            addCriterion("POSTYPE <", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLessThanOrEqualTo(String value) {
            addCriterion("POSTYPE <=", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLike(String value) {
            addCriterion("POSTYPE like", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotLike(String value) {
            addCriterion("POSTYPE not like", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeIn(List<String> values) {
            addCriterion("POSTYPE in", values, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotIn(List<String> values) {
            addCriterion("POSTYPE not in", values, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeBetween(String value1, String value2) {
            addCriterion("POSTYPE between", value1, value2, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotBetween(String value1, String value2) {
            addCriterion("POSTYPE not between", value1, value2, "postype");
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

        public Criteria andCsnIsNull() {
            addCriterion("CSN is null");
            return (Criteria) this;
        }

        public Criteria andCsnIsNotNull() {
            addCriterion("CSN is not null");
            return (Criteria) this;
        }

        public Criteria andCsnEqualTo(String value) {
            addCriterion("CSN =", value, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnNotEqualTo(String value) {
            addCriterion("CSN <>", value, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnGreaterThan(String value) {
            addCriterion("CSN >", value, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnGreaterThanOrEqualTo(String value) {
            addCriterion("CSN >=", value, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnLessThan(String value) {
            addCriterion("CSN <", value, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnLessThanOrEqualTo(String value) {
            addCriterion("CSN <=", value, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnLike(String value) {
            addCriterion("CSN like", value, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnNotLike(String value) {
            addCriterion("CSN not like", value, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnIn(List<String> values) {
            addCriterion("CSN in", values, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnNotIn(List<String> values) {
            addCriterion("CSN not in", values, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnBetween(String value1, String value2) {
            addCriterion("CSN between", value1, value2, "csn");
            return (Criteria) this;
        }

        public Criteria andCsnNotBetween(String value1, String value2) {
            addCriterion("CSN not between", value1, value2, "csn");
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

        public Criteria andCardkindEqualTo(String value) {
            addCriterion("CARDKIND =", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindNotEqualTo(String value) {
            addCriterion("CARDKIND <>", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindGreaterThan(String value) {
            addCriterion("CARDKIND >", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindGreaterThanOrEqualTo(String value) {
            addCriterion("CARDKIND >=", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindLessThan(String value) {
            addCriterion("CARDKIND <", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindLessThanOrEqualTo(String value) {
            addCriterion("CARDKIND <=", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindLike(String value) {
            addCriterion("CARDKIND like", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindNotLike(String value) {
            addCriterion("CARDKIND not like", value, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindIn(List<String> values) {
            addCriterion("CARDKIND in", values, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindNotIn(List<String> values) {
            addCriterion("CARDKIND not in", values, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindBetween(String value1, String value2) {
            addCriterion("CARDKIND between", value1, value2, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardkindNotBetween(String value1, String value2) {
            addCriterion("CARDKIND not between", value1, value2, "cardkind");
            return (Criteria) this;
        }

        public Criteria andCardidIsNull() {
            addCriterion("CARDID is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("CARDID is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(String value) {
            addCriterion("CARDID =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(String value) {
            addCriterion("CARDID <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(String value) {
            addCriterion("CARDID >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(String value) {
            addCriterion("CARDID >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(String value) {
            addCriterion("CARDID <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(String value) {
            addCriterion("CARDID <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLike(String value) {
            addCriterion("CARDID like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotLike(String value) {
            addCriterion("CARDID not like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<String> values) {
            addCriterion("CARDID in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<String> values) {
            addCriterion("CARDID not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(String value1, String value2) {
            addCriterion("CARDID between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(String value1, String value2) {
            addCriterion("CARDID not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andInstdateIsNull() {
            addCriterion("INSTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInstdateIsNotNull() {
            addCriterion("INSTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInstdateEqualTo(String value) {
            addCriterion("INSTDATE =", value, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateNotEqualTo(String value) {
            addCriterion("INSTDATE <>", value, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateGreaterThan(String value) {
            addCriterion("INSTDATE >", value, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateGreaterThanOrEqualTo(String value) {
            addCriterion("INSTDATE >=", value, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateLessThan(String value) {
            addCriterion("INSTDATE <", value, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateLessThanOrEqualTo(String value) {
            addCriterion("INSTDATE <=", value, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateLike(String value) {
            addCriterion("INSTDATE like", value, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateNotLike(String value) {
            addCriterion("INSTDATE not like", value, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateIn(List<String> values) {
            addCriterion("INSTDATE in", values, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateNotIn(List<String> values) {
            addCriterion("INSTDATE not in", values, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateBetween(String value1, String value2) {
            addCriterion("INSTDATE between", value1, value2, "instdate");
            return (Criteria) this;
        }

        public Criteria andInstdateNotBetween(String value1, String value2) {
            addCriterion("INSTDATE not between", value1, value2, "instdate");
            return (Criteria) this;
        }

        public Criteria andInsttimeIsNull() {
            addCriterion("INSTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInsttimeIsNotNull() {
            addCriterion("INSTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInsttimeEqualTo(String value) {
            addCriterion("INSTTIME =", value, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeNotEqualTo(String value) {
            addCriterion("INSTTIME <>", value, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeGreaterThan(String value) {
            addCriterion("INSTTIME >", value, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeGreaterThanOrEqualTo(String value) {
            addCriterion("INSTTIME >=", value, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeLessThan(String value) {
            addCriterion("INSTTIME <", value, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeLessThanOrEqualTo(String value) {
            addCriterion("INSTTIME <=", value, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeLike(String value) {
            addCriterion("INSTTIME like", value, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeNotLike(String value) {
            addCriterion("INSTTIME not like", value, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeIn(List<String> values) {
            addCriterion("INSTTIME in", values, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeNotIn(List<String> values) {
            addCriterion("INSTTIME not in", values, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeBetween(String value1, String value2) {
            addCriterion("INSTTIME between", value1, value2, "insttime");
            return (Criteria) this;
        }

        public Criteria andInsttimeNotBetween(String value1, String value2) {
            addCriterion("INSTTIME not between", value1, value2, "insttime");
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

        public Criteria andTxnamtIsNull() {
            addCriterion("TXNAMT is null");
            return (Criteria) this;
        }

        public Criteria andTxnamtIsNotNull() {
            addCriterion("TXNAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTxnamtEqualTo(Integer value) {
            addCriterion("TXNAMT =", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtNotEqualTo(Integer value) {
            addCriterion("TXNAMT <>", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtGreaterThan(Integer value) {
            addCriterion("TXNAMT >", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TXNAMT >=", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtLessThan(Integer value) {
            addCriterion("TXNAMT <", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtLessThanOrEqualTo(Integer value) {
            addCriterion("TXNAMT <=", value, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtIn(List<Integer> values) {
            addCriterion("TXNAMT in", values, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtNotIn(List<Integer> values) {
            addCriterion("TXNAMT not in", values, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtBetween(Integer value1, Integer value2) {
            addCriterion("TXNAMT between", value1, value2, "txnamt");
            return (Criteria) this;
        }

        public Criteria andTxnamtNotBetween(Integer value1, Integer value2) {
            addCriterion("TXNAMT not between", value1, value2, "txnamt");
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

        public Criteria andExceptionstrIsNull() {
            addCriterion("EXCEPTIONSTR is null");
            return (Criteria) this;
        }

        public Criteria andExceptionstrIsNotNull() {
            addCriterion("EXCEPTIONSTR is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionstrEqualTo(String value) {
            addCriterion("EXCEPTIONSTR =", value, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrNotEqualTo(String value) {
            addCriterion("EXCEPTIONSTR <>", value, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrGreaterThan(String value) {
            addCriterion("EXCEPTIONSTR >", value, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONSTR >=", value, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrLessThan(String value) {
            addCriterion("EXCEPTIONSTR <", value, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONSTR <=", value, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrLike(String value) {
            addCriterion("EXCEPTIONSTR like", value, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrNotLike(String value) {
            addCriterion("EXCEPTIONSTR not like", value, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrIn(List<String> values) {
            addCriterion("EXCEPTIONSTR in", values, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrNotIn(List<String> values) {
            addCriterion("EXCEPTIONSTR not in", values, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrBetween(String value1, String value2) {
            addCriterion("EXCEPTIONSTR between", value1, value2, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andExceptionstrNotBetween(String value1, String value2) {
            addCriterion("EXCEPTIONSTR not between", value1, value2, "exceptionstr");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("LASTUPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("LASTUPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(String value) {
            addCriterion("LASTUPDATETIME =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(String value) {
            addCriterion("LASTUPDATETIME <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(String value) {
            addCriterion("LASTUPDATETIME >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDATETIME >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(String value) {
            addCriterion("LASTUPDATETIME <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDATETIME <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLike(String value) {
            addCriterion("LASTUPDATETIME like", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotLike(String value) {
            addCriterion("LASTUPDATETIME not like", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<String> values) {
            addCriterion("LASTUPDATETIME in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<String> values) {
            addCriterion("LASTUPDATETIME not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(String value1, String value2) {
            addCriterion("LASTUPDATETIME between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(String value1, String value2) {
            addCriterion("LASTUPDATETIME not between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andRsvdIsNull() {
            addCriterion("RSVD is null");
            return (Criteria) this;
        }

        public Criteria andRsvdIsNotNull() {
            addCriterion("RSVD is not null");
            return (Criteria) this;
        }

        public Criteria andRsvdEqualTo(String value) {
            addCriterion("RSVD =", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdNotEqualTo(String value) {
            addCriterion("RSVD <>", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdGreaterThan(String value) {
            addCriterion("RSVD >", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdGreaterThanOrEqualTo(String value) {
            addCriterion("RSVD >=", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdLessThan(String value) {
            addCriterion("RSVD <", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdLessThanOrEqualTo(String value) {
            addCriterion("RSVD <=", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdLike(String value) {
            addCriterion("RSVD like", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdNotLike(String value) {
            addCriterion("RSVD not like", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdIn(List<String> values) {
            addCriterion("RSVD in", values, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdNotIn(List<String> values) {
            addCriterion("RSVD not in", values, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdBetween(String value1, String value2) {
            addCriterion("RSVD between", value1, value2, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdNotBetween(String value1, String value2) {
            addCriterion("RSVD not between", value1, value2, "rsvd");
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

        public Criteria andTermssnIsNull() {
            addCriterion("TERMSSN is null");
            return (Criteria) this;
        }

        public Criteria andTermssnIsNotNull() {
            addCriterion("TERMSSN is not null");
            return (Criteria) this;
        }

        public Criteria andTermssnEqualTo(String value) {
            addCriterion("TERMSSN =", value, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnNotEqualTo(String value) {
            addCriterion("TERMSSN <>", value, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnGreaterThan(String value) {
            addCriterion("TERMSSN >", value, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnGreaterThanOrEqualTo(String value) {
            addCriterion("TERMSSN >=", value, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnLessThan(String value) {
            addCriterion("TERMSSN <", value, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnLessThanOrEqualTo(String value) {
            addCriterion("TERMSSN <=", value, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnLike(String value) {
            addCriterion("TERMSSN like", value, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnNotLike(String value) {
            addCriterion("TERMSSN not like", value, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnIn(List<String> values) {
            addCriterion("TERMSSN in", values, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnNotIn(List<String> values) {
            addCriterion("TERMSSN not in", values, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnBetween(String value1, String value2) {
            addCriterion("TERMSSN between", value1, value2, "termssn");
            return (Criteria) this;
        }

        public Criteria andTermssnNotBetween(String value1, String value2) {
            addCriterion("TERMSSN not between", value1, value2, "termssn");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeIsNull() {
            addCriterion("SUBTXNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeIsNotNull() {
            addCriterion("SUBTXNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeEqualTo(String value) {
            addCriterion("SUBTXNTYPE =", value, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeNotEqualTo(String value) {
            addCriterion("SUBTXNTYPE <>", value, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeGreaterThan(String value) {
            addCriterion("SUBTXNTYPE >", value, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBTXNTYPE >=", value, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeLessThan(String value) {
            addCriterion("SUBTXNTYPE <", value, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeLessThanOrEqualTo(String value) {
            addCriterion("SUBTXNTYPE <=", value, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeLike(String value) {
            addCriterion("SUBTXNTYPE like", value, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeNotLike(String value) {
            addCriterion("SUBTXNTYPE not like", value, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeIn(List<String> values) {
            addCriterion("SUBTXNTYPE in", values, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeNotIn(List<String> values) {
            addCriterion("SUBTXNTYPE not in", values, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeBetween(String value1, String value2) {
            addCriterion("SUBTXNTYPE between", value1, value2, "subtxntype");
            return (Criteria) this;
        }

        public Criteria andSubtxntypeNotBetween(String value1, String value2) {
            addCriterion("SUBTXNTYPE not between", value1, value2, "subtxntype");
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