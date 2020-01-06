package com.unicorn.srgasoline.entity;

import java.util.ArrayList;
import java.util.List;

public class FlowmeterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowmeterExample() {
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

        public Criteria andSbbmIsNull() {
            addCriterion("SBBM is null");
            return (Criteria) this;
        }

        public Criteria andSbbmIsNotNull() {
            addCriterion("SBBM is not null");
            return (Criteria) this;
        }

        public Criteria andSbbmEqualTo(String value) {
            addCriterion("SBBM =", value, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmNotEqualTo(String value) {
            addCriterion("SBBM <>", value, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmGreaterThan(String value) {
            addCriterion("SBBM >", value, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmGreaterThanOrEqualTo(String value) {
            addCriterion("SBBM >=", value, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmLessThan(String value) {
            addCriterion("SBBM <", value, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmLessThanOrEqualTo(String value) {
            addCriterion("SBBM <=", value, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmLike(String value) {
            addCriterion("SBBM like", value, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmNotLike(String value) {
            addCriterion("SBBM not like", value, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmIn(List<String> values) {
            addCriterion("SBBM in", values, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmNotIn(List<String> values) {
            addCriterion("SBBM not in", values, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmBetween(String value1, String value2) {
            addCriterion("SBBM between", value1, value2, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSbbmNotBetween(String value1, String value2) {
            addCriterion("SBBM not between", value1, value2, "sbbm");
            return (Criteria) this;
        }

        public Criteria andSblbIsNull() {
            addCriterion("SBLB is null");
            return (Criteria) this;
        }

        public Criteria andSblbIsNotNull() {
            addCriterion("SBLB is not null");
            return (Criteria) this;
        }

        public Criteria andSblbEqualTo(String value) {
            addCriterion("SBLB =", value, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbNotEqualTo(String value) {
            addCriterion("SBLB <>", value, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbGreaterThan(String value) {
            addCriterion("SBLB >", value, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbGreaterThanOrEqualTo(String value) {
            addCriterion("SBLB >=", value, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbLessThan(String value) {
            addCriterion("SBLB <", value, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbLessThanOrEqualTo(String value) {
            addCriterion("SBLB <=", value, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbLike(String value) {
            addCriterion("SBLB like", value, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbNotLike(String value) {
            addCriterion("SBLB not like", value, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbIn(List<String> values) {
            addCriterion("SBLB in", values, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbNotIn(List<String> values) {
            addCriterion("SBLB not in", values, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbBetween(String value1, String value2) {
            addCriterion("SBLB between", value1, value2, "sblb");
            return (Criteria) this;
        }

        public Criteria andSblbNotBetween(String value1, String value2) {
            addCriterion("SBLB not between", value1, value2, "sblb");
            return (Criteria) this;
        }

        public Criteria andCldwIsNull() {
            addCriterion("CLDW is null");
            return (Criteria) this;
        }

        public Criteria andCldwIsNotNull() {
            addCriterion("CLDW is not null");
            return (Criteria) this;
        }

        public Criteria andCldwEqualTo(String value) {
            addCriterion("CLDW =", value, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwNotEqualTo(String value) {
            addCriterion("CLDW <>", value, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwGreaterThan(String value) {
            addCriterion("CLDW >", value, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwGreaterThanOrEqualTo(String value) {
            addCriterion("CLDW >=", value, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwLessThan(String value) {
            addCriterion("CLDW <", value, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwLessThanOrEqualTo(String value) {
            addCriterion("CLDW <=", value, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwLike(String value) {
            addCriterion("CLDW like", value, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwNotLike(String value) {
            addCriterion("CLDW not like", value, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwIn(List<String> values) {
            addCriterion("CLDW in", values, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwNotIn(List<String> values) {
            addCriterion("CLDW not in", values, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwBetween(String value1, String value2) {
            addCriterion("CLDW between", value1, value2, "cldw");
            return (Criteria) this;
        }

        public Criteria andCldwNotBetween(String value1, String value2) {
            addCriterion("CLDW not between", value1, value2, "cldw");
            return (Criteria) this;
        }

        public Criteria andYlbbhIsNull() {
            addCriterion("YLBBH is null");
            return (Criteria) this;
        }

        public Criteria andYlbbhIsNotNull() {
            addCriterion("YLBBH is not null");
            return (Criteria) this;
        }

        public Criteria andYlbbhEqualTo(String value) {
            addCriterion("YLBBH =", value, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhNotEqualTo(String value) {
            addCriterion("YLBBH <>", value, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhGreaterThan(String value) {
            addCriterion("YLBBH >", value, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhGreaterThanOrEqualTo(String value) {
            addCriterion("YLBBH >=", value, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhLessThan(String value) {
            addCriterion("YLBBH <", value, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhLessThanOrEqualTo(String value) {
            addCriterion("YLBBH <=", value, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhLike(String value) {
            addCriterion("YLBBH like", value, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhNotLike(String value) {
            addCriterion("YLBBH not like", value, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhIn(List<String> values) {
            addCriterion("YLBBH in", values, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhNotIn(List<String> values) {
            addCriterion("YLBBH not in", values, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhBetween(String value1, String value2) {
            addCriterion("YLBBH between", value1, value2, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andYlbbhNotBetween(String value1, String value2) {
            addCriterion("YLBBH not between", value1, value2, "ylbbh");
            return (Criteria) this;
        }

        public Criteria andSzwzIsNull() {
            addCriterion("SZWZ is null");
            return (Criteria) this;
        }

        public Criteria andSzwzIsNotNull() {
            addCriterion("SZWZ is not null");
            return (Criteria) this;
        }

        public Criteria andSzwzEqualTo(String value) {
            addCriterion("SZWZ =", value, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzNotEqualTo(String value) {
            addCriterion("SZWZ <>", value, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzGreaterThan(String value) {
            addCriterion("SZWZ >", value, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzGreaterThanOrEqualTo(String value) {
            addCriterion("SZWZ >=", value, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzLessThan(String value) {
            addCriterion("SZWZ <", value, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzLessThanOrEqualTo(String value) {
            addCriterion("SZWZ <=", value, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzLike(String value) {
            addCriterion("SZWZ like", value, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzNotLike(String value) {
            addCriterion("SZWZ not like", value, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzIn(List<String> values) {
            addCriterion("SZWZ in", values, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzNotIn(List<String> values) {
            addCriterion("SZWZ not in", values, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzBetween(String value1, String value2) {
            addCriterion("SZWZ between", value1, value2, "szwz");
            return (Criteria) this;
        }

        public Criteria andSzwzNotBetween(String value1, String value2) {
            addCriterion("SZWZ not between", value1, value2, "szwz");
            return (Criteria) this;
        }

        public Criteria andGxbzIsNull() {
            addCriterion("GXBZ is null");
            return (Criteria) this;
        }

        public Criteria andGxbzIsNotNull() {
            addCriterion("GXBZ is not null");
            return (Criteria) this;
        }

        public Criteria andGxbzEqualTo(String value) {
            addCriterion("GXBZ =", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzNotEqualTo(String value) {
            addCriterion("GXBZ <>", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzGreaterThan(String value) {
            addCriterion("GXBZ >", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzGreaterThanOrEqualTo(String value) {
            addCriterion("GXBZ >=", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzLessThan(String value) {
            addCriterion("GXBZ <", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzLessThanOrEqualTo(String value) {
            addCriterion("GXBZ <=", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzLike(String value) {
            addCriterion("GXBZ like", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzNotLike(String value) {
            addCriterion("GXBZ not like", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzIn(List<String> values) {
            addCriterion("GXBZ in", values, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzNotIn(List<String> values) {
            addCriterion("GXBZ not in", values, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzBetween(String value1, String value2) {
            addCriterion("GXBZ between", value1, value2, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzNotBetween(String value1, String value2) {
            addCriterion("GXBZ not between", value1, value2, "gxbz");
            return (Criteria) this;
        }

        public Criteria andNamesIsNull() {
            addCriterion("NAMES is null");
            return (Criteria) this;
        }

        public Criteria andNamesIsNotNull() {
            addCriterion("NAMES is not null");
            return (Criteria) this;
        }

        public Criteria andNamesEqualTo(String value) {
            addCriterion("NAMES =", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotEqualTo(String value) {
            addCriterion("NAMES <>", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesGreaterThan(String value) {
            addCriterion("NAMES >", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesGreaterThanOrEqualTo(String value) {
            addCriterion("NAMES >=", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLessThan(String value) {
            addCriterion("NAMES <", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLessThanOrEqualTo(String value) {
            addCriterion("NAMES <=", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLike(String value) {
            addCriterion("NAMES like", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotLike(String value) {
            addCriterion("NAMES not like", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesIn(List<String> values) {
            addCriterion("NAMES in", values, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotIn(List<String> values) {
            addCriterion("NAMES not in", values, "names");
            return (Criteria) this;
        }

        public Criteria andNamesBetween(String value1, String value2) {
            addCriterion("NAMES between", value1, value2, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotBetween(String value1, String value2) {
            addCriterion("NAMES not between", value1, value2, "names");
            return (Criteria) this;
        }

        public Criteria andOilsIsNull() {
            addCriterion("OILS is null");
            return (Criteria) this;
        }

        public Criteria andOilsIsNotNull() {
            addCriterion("OILS is not null");
            return (Criteria) this;
        }

        public Criteria andOilsEqualTo(String value) {
            addCriterion("OILS =", value, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsNotEqualTo(String value) {
            addCriterion("OILS <>", value, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsGreaterThan(String value) {
            addCriterion("OILS >", value, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsGreaterThanOrEqualTo(String value) {
            addCriterion("OILS >=", value, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsLessThan(String value) {
            addCriterion("OILS <", value, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsLessThanOrEqualTo(String value) {
            addCriterion("OILS <=", value, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsLike(String value) {
            addCriterion("OILS like", value, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsNotLike(String value) {
            addCriterion("OILS not like", value, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsIn(List<String> values) {
            addCriterion("OILS in", values, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsNotIn(List<String> values) {
            addCriterion("OILS not in", values, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsBetween(String value1, String value2) {
            addCriterion("OILS between", value1, value2, "oils");
            return (Criteria) this;
        }

        public Criteria andOilsNotBetween(String value1, String value2) {
            addCriterion("OILS not between", value1, value2, "oils");
            return (Criteria) this;
        }

        public Criteria andUnitsIsNull() {
            addCriterion("UNITS is null");
            return (Criteria) this;
        }

        public Criteria andUnitsIsNotNull() {
            addCriterion("UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsEqualTo(String value) {
            addCriterion("UNITS =", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotEqualTo(String value) {
            addCriterion("UNITS <>", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsGreaterThan(String value) {
            addCriterion("UNITS >", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("UNITS >=", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLessThan(String value) {
            addCriterion("UNITS <", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLessThanOrEqualTo(String value) {
            addCriterion("UNITS <=", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLike(String value) {
            addCriterion("UNITS like", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotLike(String value) {
            addCriterion("UNITS not like", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsIn(List<String> values) {
            addCriterion("UNITS in", values, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotIn(List<String> values) {
            addCriterion("UNITS not in", values, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsBetween(String value1, String value2) {
            addCriterion("UNITS between", value1, value2, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotBetween(String value1, String value2) {
            addCriterion("UNITS not between", value1, value2, "units");
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