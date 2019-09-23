package com.smk.model.mcap;

import java.util.ArrayList;
import java.util.List;

public class BiMchntInfTbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiMchntInfTbExample() {
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

        public Criteria andMchntnameIsNull() {
            addCriterion("MCHNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andMchntnameIsNotNull() {
            addCriterion("MCHNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMchntnameEqualTo(String value) {
            addCriterion("MCHNTNAME =", value, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameNotEqualTo(String value) {
            addCriterion("MCHNTNAME <>", value, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameGreaterThan(String value) {
            addCriterion("MCHNTNAME >", value, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNTNAME >=", value, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameLessThan(String value) {
            addCriterion("MCHNTNAME <", value, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameLessThanOrEqualTo(String value) {
            addCriterion("MCHNTNAME <=", value, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameLike(String value) {
            addCriterion("MCHNTNAME like", value, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameNotLike(String value) {
            addCriterion("MCHNTNAME not like", value, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameIn(List<String> values) {
            addCriterion("MCHNTNAME in", values, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameNotIn(List<String> values) {
            addCriterion("MCHNTNAME not in", values, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameBetween(String value1, String value2) {
            addCriterion("MCHNTNAME between", value1, value2, "mchntname");
            return (Criteria) this;
        }

        public Criteria andMchntnameNotBetween(String value1, String value2) {
            addCriterion("MCHNTNAME not between", value1, value2, "mchntname");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNull() {
            addCriterion("TELNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNotNull() {
            addCriterion("TELNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumberEqualTo(String value) {
            addCriterion("TELNUMBER =", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotEqualTo(String value) {
            addCriterion("TELNUMBER <>", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThan(String value) {
            addCriterion("TELNUMBER >", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("TELNUMBER >=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThan(String value) {
            addCriterion("TELNUMBER <", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThanOrEqualTo(String value) {
            addCriterion("TELNUMBER <=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLike(String value) {
            addCriterion("TELNUMBER like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotLike(String value) {
            addCriterion("TELNUMBER not like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberIn(List<String> values) {
            addCriterion("TELNUMBER in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotIn(List<String> values) {
            addCriterion("TELNUMBER not in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberBetween(String value1, String value2) {
            addCriterion("TELNUMBER between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotBetween(String value1, String value2) {
            addCriterion("TELNUMBER not between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("LINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("LINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("LINKMAN =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("LINKMAN <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("LINKMAN >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("LINKMAN <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("LINKMAN like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("LINKMAN not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("LINKMAN in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("LINKMAN not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("LINKMAN between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("LINKMAN not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyIsNull() {
            addCriterion("PRIVATEKEY is null");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyIsNotNull() {
            addCriterion("PRIVATEKEY is not null");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyEqualTo(String value) {
            addCriterion("PRIVATEKEY =", value, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyNotEqualTo(String value) {
            addCriterion("PRIVATEKEY <>", value, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyGreaterThan(String value) {
            addCriterion("PRIVATEKEY >", value, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVATEKEY >=", value, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyLessThan(String value) {
            addCriterion("PRIVATEKEY <", value, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyLessThanOrEqualTo(String value) {
            addCriterion("PRIVATEKEY <=", value, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyLike(String value) {
            addCriterion("PRIVATEKEY like", value, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyNotLike(String value) {
            addCriterion("PRIVATEKEY not like", value, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyIn(List<String> values) {
            addCriterion("PRIVATEKEY in", values, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyNotIn(List<String> values) {
            addCriterion("PRIVATEKEY not in", values, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyBetween(String value1, String value2) {
            addCriterion("PRIVATEKEY between", value1, value2, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPrivatekeyNotBetween(String value1, String value2) {
            addCriterion("PRIVATEKEY not between", value1, value2, "privatekey");
            return (Criteria) this;
        }

        public Criteria andPublickeyIsNull() {
            addCriterion("PUBLICKEY is null");
            return (Criteria) this;
        }

        public Criteria andPublickeyIsNotNull() {
            addCriterion("PUBLICKEY is not null");
            return (Criteria) this;
        }

        public Criteria andPublickeyEqualTo(String value) {
            addCriterion("PUBLICKEY =", value, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyNotEqualTo(String value) {
            addCriterion("PUBLICKEY <>", value, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyGreaterThan(String value) {
            addCriterion("PUBLICKEY >", value, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLICKEY >=", value, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyLessThan(String value) {
            addCriterion("PUBLICKEY <", value, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyLessThanOrEqualTo(String value) {
            addCriterion("PUBLICKEY <=", value, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyLike(String value) {
            addCriterion("PUBLICKEY like", value, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyNotLike(String value) {
            addCriterion("PUBLICKEY not like", value, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyIn(List<String> values) {
            addCriterion("PUBLICKEY in", values, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyNotIn(List<String> values) {
            addCriterion("PUBLICKEY not in", values, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyBetween(String value1, String value2) {
            addCriterion("PUBLICKEY between", value1, value2, "publickey");
            return (Criteria) this;
        }

        public Criteria andPublickeyNotBetween(String value1, String value2) {
            addCriterion("PUBLICKEY not between", value1, value2, "publickey");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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

        public Criteria andIschecksignIsNull() {
            addCriterion("ISCHECKSIGN is null");
            return (Criteria) this;
        }

        public Criteria andIschecksignIsNotNull() {
            addCriterion("ISCHECKSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andIschecksignEqualTo(String value) {
            addCriterion("ISCHECKSIGN =", value, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignNotEqualTo(String value) {
            addCriterion("ISCHECKSIGN <>", value, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignGreaterThan(String value) {
            addCriterion("ISCHECKSIGN >", value, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignGreaterThanOrEqualTo(String value) {
            addCriterion("ISCHECKSIGN >=", value, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignLessThan(String value) {
            addCriterion("ISCHECKSIGN <", value, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignLessThanOrEqualTo(String value) {
            addCriterion("ISCHECKSIGN <=", value, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignLike(String value) {
            addCriterion("ISCHECKSIGN like", value, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignNotLike(String value) {
            addCriterion("ISCHECKSIGN not like", value, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignIn(List<String> values) {
            addCriterion("ISCHECKSIGN in", values, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignNotIn(List<String> values) {
            addCriterion("ISCHECKSIGN not in", values, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignBetween(String value1, String value2) {
            addCriterion("ISCHECKSIGN between", value1, value2, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andIschecksignNotBetween(String value1, String value2) {
            addCriterion("ISCHECKSIGN not between", value1, value2, "ischecksign");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeIsNull() {
            addCriterion("LASTUPDATEDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeIsNotNull() {
            addCriterion("LASTUPDATEDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeEqualTo(String value) {
            addCriterion("LASTUPDATEDATETIME =", value, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeNotEqualTo(String value) {
            addCriterion("LASTUPDATEDATETIME <>", value, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeGreaterThan(String value) {
            addCriterion("LASTUPDATEDATETIME >", value, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDATEDATETIME >=", value, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeLessThan(String value) {
            addCriterion("LASTUPDATEDATETIME <", value, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDATEDATETIME <=", value, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeLike(String value) {
            addCriterion("LASTUPDATEDATETIME like", value, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeNotLike(String value) {
            addCriterion("LASTUPDATEDATETIME not like", value, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeIn(List<String> values) {
            addCriterion("LASTUPDATEDATETIME in", values, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeNotIn(List<String> values) {
            addCriterion("LASTUPDATEDATETIME not in", values, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeBetween(String value1, String value2) {
            addCriterion("LASTUPDATEDATETIME between", value1, value2, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedatetimeNotBetween(String value1, String value2) {
            addCriterion("LASTUPDATEDATETIME not between", value1, value2, "lastupdatedatetime");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyIsNull() {
            addCriterion("ISUPDATEPUBKEY is null");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyIsNotNull() {
            addCriterion("ISUPDATEPUBKEY is not null");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyEqualTo(String value) {
            addCriterion("ISUPDATEPUBKEY =", value, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyNotEqualTo(String value) {
            addCriterion("ISUPDATEPUBKEY <>", value, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyGreaterThan(String value) {
            addCriterion("ISUPDATEPUBKEY >", value, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyGreaterThanOrEqualTo(String value) {
            addCriterion("ISUPDATEPUBKEY >=", value, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyLessThan(String value) {
            addCriterion("ISUPDATEPUBKEY <", value, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyLessThanOrEqualTo(String value) {
            addCriterion("ISUPDATEPUBKEY <=", value, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyLike(String value) {
            addCriterion("ISUPDATEPUBKEY like", value, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyNotLike(String value) {
            addCriterion("ISUPDATEPUBKEY not like", value, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyIn(List<String> values) {
            addCriterion("ISUPDATEPUBKEY in", values, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyNotIn(List<String> values) {
            addCriterion("ISUPDATEPUBKEY not in", values, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyBetween(String value1, String value2) {
            addCriterion("ISUPDATEPUBKEY between", value1, value2, "isupdatepubkey");
            return (Criteria) this;
        }

        public Criteria andIsupdatepubkeyNotBetween(String value1, String value2) {
            addCriterion("ISUPDATEPUBKEY not between", value1, value2, "isupdatepubkey");
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