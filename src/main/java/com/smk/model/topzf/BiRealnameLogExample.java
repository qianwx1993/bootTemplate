package com.smk.model.topzf;

import java.util.ArrayList;
import java.util.List;

public class BiRealnameLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiRealnameLogExample() {
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

        public Criteria andLocalSeqIsNull() {
            addCriterion("LOCAL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andLocalSeqIsNotNull() {
            addCriterion("LOCAL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andLocalSeqEqualTo(String value) {
            addCriterion("LOCAL_SEQ =", value, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqNotEqualTo(String value) {
            addCriterion("LOCAL_SEQ <>", value, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqGreaterThan(String value) {
            addCriterion("LOCAL_SEQ >", value, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqGreaterThanOrEqualTo(String value) {
            addCriterion("LOCAL_SEQ >=", value, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqLessThan(String value) {
            addCriterion("LOCAL_SEQ <", value, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqLessThanOrEqualTo(String value) {
            addCriterion("LOCAL_SEQ <=", value, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqLike(String value) {
            addCriterion("LOCAL_SEQ like", value, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqNotLike(String value) {
            addCriterion("LOCAL_SEQ not like", value, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqIn(List<String> values) {
            addCriterion("LOCAL_SEQ in", values, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqNotIn(List<String> values) {
            addCriterion("LOCAL_SEQ not in", values, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqBetween(String value1, String value2) {
            addCriterion("LOCAL_SEQ between", value1, value2, "localSeq");
            return (Criteria) this;
        }

        public Criteria andLocalSeqNotBetween(String value1, String value2) {
            addCriterion("LOCAL_SEQ not between", value1, value2, "localSeq");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqIsNull() {
            addCriterion("HIS_SET_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqIsNotNull() {
            addCriterion("HIS_SET_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqEqualTo(String value) {
            addCriterion("HIS_SET_SEQ =", value, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqNotEqualTo(String value) {
            addCriterion("HIS_SET_SEQ <>", value, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqGreaterThan(String value) {
            addCriterion("HIS_SET_SEQ >", value, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqGreaterThanOrEqualTo(String value) {
            addCriterion("HIS_SET_SEQ >=", value, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqLessThan(String value) {
            addCriterion("HIS_SET_SEQ <", value, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqLessThanOrEqualTo(String value) {
            addCriterion("HIS_SET_SEQ <=", value, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqLike(String value) {
            addCriterion("HIS_SET_SEQ like", value, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqNotLike(String value) {
            addCriterion("HIS_SET_SEQ not like", value, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqIn(List<String> values) {
            addCriterion("HIS_SET_SEQ in", values, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqNotIn(List<String> values) {
            addCriterion("HIS_SET_SEQ not in", values, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqBetween(String value1, String value2) {
            addCriterion("HIS_SET_SEQ between", value1, value2, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andHisSetSeqNotBetween(String value1, String value2) {
            addCriterion("HIS_SET_SEQ not between", value1, value2, "hisSetSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqIsNull() {
            addCriterion("FACE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFaceSeqIsNotNull() {
            addCriterion("FACE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFaceSeqEqualTo(String value) {
            addCriterion("FACE_SEQ =", value, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqNotEqualTo(String value) {
            addCriterion("FACE_SEQ <>", value, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqGreaterThan(String value) {
            addCriterion("FACE_SEQ >", value, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FACE_SEQ >=", value, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqLessThan(String value) {
            addCriterion("FACE_SEQ <", value, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqLessThanOrEqualTo(String value) {
            addCriterion("FACE_SEQ <=", value, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqLike(String value) {
            addCriterion("FACE_SEQ like", value, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqNotLike(String value) {
            addCriterion("FACE_SEQ not like", value, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqIn(List<String> values) {
            addCriterion("FACE_SEQ in", values, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqNotIn(List<String> values) {
            addCriterion("FACE_SEQ not in", values, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqBetween(String value1, String value2) {
            addCriterion("FACE_SEQ between", value1, value2, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andFaceSeqNotBetween(String value1, String value2) {
            addCriterion("FACE_SEQ not between", value1, value2, "faceSeq");
            return (Criteria) this;
        }

        public Criteria andSocNoIsNull() {
            addCriterion("SOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andSocNoIsNotNull() {
            addCriterion("SOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSocNoEqualTo(String value) {
            addCriterion("SOC_NO =", value, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoNotEqualTo(String value) {
            addCriterion("SOC_NO <>", value, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoGreaterThan(String value) {
            addCriterion("SOC_NO >", value, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoGreaterThanOrEqualTo(String value) {
            addCriterion("SOC_NO >=", value, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoLessThan(String value) {
            addCriterion("SOC_NO <", value, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoLessThanOrEqualTo(String value) {
            addCriterion("SOC_NO <=", value, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoLike(String value) {
            addCriterion("SOC_NO like", value, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoNotLike(String value) {
            addCriterion("SOC_NO not like", value, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoIn(List<String> values) {
            addCriterion("SOC_NO in", values, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoNotIn(List<String> values) {
            addCriterion("SOC_NO not in", values, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoBetween(String value1, String value2) {
            addCriterion("SOC_NO between", value1, value2, "socNo");
            return (Criteria) this;
        }

        public Criteria andSocNoNotBetween(String value1, String value2) {
            addCriterion("SOC_NO not between", value1, value2, "socNo");
            return (Criteria) this;
        }

        public Criteria andRealNameResIsNull() {
            addCriterion("REAL_NAME_RES is null");
            return (Criteria) this;
        }

        public Criteria andRealNameResIsNotNull() {
            addCriterion("REAL_NAME_RES is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameResEqualTo(String value) {
            addCriterion("REAL_NAME_RES =", value, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResNotEqualTo(String value) {
            addCriterion("REAL_NAME_RES <>", value, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResGreaterThan(String value) {
            addCriterion("REAL_NAME_RES >", value, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME_RES >=", value, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResLessThan(String value) {
            addCriterion("REAL_NAME_RES <", value, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME_RES <=", value, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResLike(String value) {
            addCriterion("REAL_NAME_RES like", value, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResNotLike(String value) {
            addCriterion("REAL_NAME_RES not like", value, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResIn(List<String> values) {
            addCriterion("REAL_NAME_RES in", values, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResNotIn(List<String> values) {
            addCriterion("REAL_NAME_RES not in", values, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResBetween(String value1, String value2) {
            addCriterion("REAL_NAME_RES between", value1, value2, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andRealNameResNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME_RES not between", value1, value2, "realNameRes");
            return (Criteria) this;
        }

        public Criteria andInstDateIsNull() {
            addCriterion("INST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInstDateIsNotNull() {
            addCriterion("INST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInstDateEqualTo(String value) {
            addCriterion("INST_DATE =", value, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateNotEqualTo(String value) {
            addCriterion("INST_DATE <>", value, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateGreaterThan(String value) {
            addCriterion("INST_DATE >", value, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateGreaterThanOrEqualTo(String value) {
            addCriterion("INST_DATE >=", value, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateLessThan(String value) {
            addCriterion("INST_DATE <", value, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateLessThanOrEqualTo(String value) {
            addCriterion("INST_DATE <=", value, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateLike(String value) {
            addCriterion("INST_DATE like", value, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateNotLike(String value) {
            addCriterion("INST_DATE not like", value, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateIn(List<String> values) {
            addCriterion("INST_DATE in", values, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateNotIn(List<String> values) {
            addCriterion("INST_DATE not in", values, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateBetween(String value1, String value2) {
            addCriterion("INST_DATE between", value1, value2, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstDateNotBetween(String value1, String value2) {
            addCriterion("INST_DATE not between", value1, value2, "instDate");
            return (Criteria) this;
        }

        public Criteria andInstTimeIsNull() {
            addCriterion("INST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInstTimeIsNotNull() {
            addCriterion("INST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInstTimeEqualTo(String value) {
            addCriterion("INST_TIME =", value, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeNotEqualTo(String value) {
            addCriterion("INST_TIME <>", value, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeGreaterThan(String value) {
            addCriterion("INST_TIME >", value, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INST_TIME >=", value, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeLessThan(String value) {
            addCriterion("INST_TIME <", value, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeLessThanOrEqualTo(String value) {
            addCriterion("INST_TIME <=", value, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeLike(String value) {
            addCriterion("INST_TIME like", value, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeNotLike(String value) {
            addCriterion("INST_TIME not like", value, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeIn(List<String> values) {
            addCriterion("INST_TIME in", values, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeNotIn(List<String> values) {
            addCriterion("INST_TIME not in", values, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeBetween(String value1, String value2) {
            addCriterion("INST_TIME between", value1, value2, "instTime");
            return (Criteria) this;
        }

        public Criteria andInstTimeNotBetween(String value1, String value2) {
            addCriterion("INST_TIME not between", value1, value2, "instTime");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoIsNull() {
            addCriterion("HIS_ORG_NO is null");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoIsNotNull() {
            addCriterion("HIS_ORG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoEqualTo(String value) {
            addCriterion("HIS_ORG_NO =", value, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoNotEqualTo(String value) {
            addCriterion("HIS_ORG_NO <>", value, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoGreaterThan(String value) {
            addCriterion("HIS_ORG_NO >", value, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("HIS_ORG_NO >=", value, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoLessThan(String value) {
            addCriterion("HIS_ORG_NO <", value, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoLessThanOrEqualTo(String value) {
            addCriterion("HIS_ORG_NO <=", value, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoLike(String value) {
            addCriterion("HIS_ORG_NO like", value, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoNotLike(String value) {
            addCriterion("HIS_ORG_NO not like", value, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoIn(List<String> values) {
            addCriterion("HIS_ORG_NO in", values, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoNotIn(List<String> values) {
            addCriterion("HIS_ORG_NO not in", values, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoBetween(String value1, String value2) {
            addCriterion("HIS_ORG_NO between", value1, value2, "hisOrgNo");
            return (Criteria) this;
        }

        public Criteria andHisOrgNoNotBetween(String value1, String value2) {
            addCriterion("HIS_ORG_NO not between", value1, value2, "hisOrgNo");
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