package com.unicorn.srgasoline.entity;

import java.util.ArrayList;
import java.util.List;

public class RecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andHeweiIsNull() {
            addCriterion("Hewei is null");
            return (Criteria) this;
        }

        public Criteria andHeweiIsNotNull() {
            addCriterion("Hewei is not null");
            return (Criteria) this;
        }

        public Criteria andHeweiEqualTo(Short value) {
            addCriterion("Hewei =", value, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiNotEqualTo(Short value) {
            addCriterion("Hewei <>", value, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiGreaterThan(Short value) {
            addCriterion("Hewei >", value, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiGreaterThanOrEqualTo(Short value) {
            addCriterion("Hewei >=", value, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiLessThan(Short value) {
            addCriterion("Hewei <", value, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiLessThanOrEqualTo(Short value) {
            addCriterion("Hewei <=", value, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiIn(List<Short> values) {
            addCriterion("Hewei in", values, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiNotIn(List<Short> values) {
            addCriterion("Hewei not in", values, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiBetween(Short value1, Short value2) {
            addCriterion("Hewei between", value1, value2, "hewei");
            return (Criteria) this;
        }

        public Criteria andHeweiNotBetween(Short value1, Short value2) {
            addCriterion("Hewei not between", value1, value2, "hewei");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanIsNull() {
            addCriterion("Linkyouguan is null");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanIsNotNull() {
            addCriterion("Linkyouguan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanEqualTo(String value) {
            addCriterion("Linkyouguan =", value, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanNotEqualTo(String value) {
            addCriterion("Linkyouguan <>", value, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanGreaterThan(String value) {
            addCriterion("Linkyouguan >", value, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanGreaterThanOrEqualTo(String value) {
            addCriterion("Linkyouguan >=", value, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanLessThan(String value) {
            addCriterion("Linkyouguan <", value, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanLessThanOrEqualTo(String value) {
            addCriterion("Linkyouguan <=", value, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanLike(String value) {
            addCriterion("Linkyouguan like", value, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanNotLike(String value) {
            addCriterion("Linkyouguan not like", value, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanIn(List<String> values) {
            addCriterion("Linkyouguan in", values, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanNotIn(List<String> values) {
            addCriterion("Linkyouguan not in", values, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanBetween(String value1, String value2) {
            addCriterion("Linkyouguan between", value1, value2, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andLinkyouguanNotBetween(String value1, String value2) {
            addCriterion("Linkyouguan not between", value1, value2, "linkyouguan");
            return (Criteria) this;
        }

        public Criteria andYoupinIsNull() {
            addCriterion("Youpin is null");
            return (Criteria) this;
        }

        public Criteria andYoupinIsNotNull() {
            addCriterion("Youpin is not null");
            return (Criteria) this;
        }

        public Criteria andYoupinEqualTo(String value) {
            addCriterion("Youpin =", value, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinNotEqualTo(String value) {
            addCriterion("Youpin <>", value, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinGreaterThan(String value) {
            addCriterion("Youpin >", value, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinGreaterThanOrEqualTo(String value) {
            addCriterion("Youpin >=", value, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinLessThan(String value) {
            addCriterion("Youpin <", value, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinLessThanOrEqualTo(String value) {
            addCriterion("Youpin <=", value, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinLike(String value) {
            addCriterion("Youpin like", value, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinNotLike(String value) {
            addCriterion("Youpin not like", value, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinIn(List<String> values) {
            addCriterion("Youpin in", values, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinNotIn(List<String> values) {
            addCriterion("Youpin not in", values, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinBetween(String value1, String value2) {
            addCriterion("Youpin between", value1, value2, "youpin");
            return (Criteria) this;
        }

        public Criteria andYoupinNotBetween(String value1, String value2) {
            addCriterion("Youpin not between", value1, value2, "youpin");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Long value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Long value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Long value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Long value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Long value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Long value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Long> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Long> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Long value1, Long value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Long value1, Long value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andYufaliangIsNull() {
            addCriterion("Yufaliang is null");
            return (Criteria) this;
        }

        public Criteria andYufaliangIsNotNull() {
            addCriterion("Yufaliang is not null");
            return (Criteria) this;
        }

        public Criteria andYufaliangEqualTo(Float value) {
            addCriterion("Yufaliang =", value, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangNotEqualTo(Float value) {
            addCriterion("Yufaliang <>", value, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangGreaterThan(Float value) {
            addCriterion("Yufaliang >", value, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangGreaterThanOrEqualTo(Float value) {
            addCriterion("Yufaliang >=", value, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangLessThan(Float value) {
            addCriterion("Yufaliang <", value, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangLessThanOrEqualTo(Float value) {
            addCriterion("Yufaliang <=", value, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangIn(List<Float> values) {
            addCriterion("Yufaliang in", values, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangNotIn(List<Float> values) {
            addCriterion("Yufaliang not in", values, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangBetween(Float value1, Float value2) {
            addCriterion("Yufaliang between", value1, value2, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andYufaliangNotBetween(Float value1, Float value2) {
            addCriterion("Yufaliang not between", value1, value2, "yufaliang");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("Total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("Total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Float value) {
            addCriterion("Total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Float value) {
            addCriterion("Total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Float value) {
            addCriterion("Total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("Total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Float value) {
            addCriterion("Total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Float value) {
            addCriterion("Total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Float> values) {
            addCriterion("Total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Float> values) {
            addCriterion("Total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Float value1, Float value2) {
            addCriterion("Total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Float value1, Float value2) {
            addCriterion("Total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andShifaliangIsNull() {
            addCriterion("Shifaliang is null");
            return (Criteria) this;
        }

        public Criteria andShifaliangIsNotNull() {
            addCriterion("Shifaliang is not null");
            return (Criteria) this;
        }

        public Criteria andShifaliangEqualTo(Float value) {
            addCriterion("Shifaliang =", value, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangNotEqualTo(Float value) {
            addCriterion("Shifaliang <>", value, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangGreaterThan(Float value) {
            addCriterion("Shifaliang >", value, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangGreaterThanOrEqualTo(Float value) {
            addCriterion("Shifaliang >=", value, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangLessThan(Float value) {
            addCriterion("Shifaliang <", value, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangLessThanOrEqualTo(Float value) {
            addCriterion("Shifaliang <=", value, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangIn(List<Float> values) {
            addCriterion("Shifaliang in", values, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangNotIn(List<Float> values) {
            addCriterion("Shifaliang not in", values, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangBetween(Float value1, Float value2) {
            addCriterion("Shifaliang between", value1, value2, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andShifaliangNotBetween(Float value1, Float value2) {
            addCriterion("Shifaliang not between", value1, value2, "shifaliang");
            return (Criteria) this;
        }

        public Criteria andDate1IsNull() {
            addCriterion("Date1 is null");
            return (Criteria) this;
        }

        public Criteria andDate1IsNotNull() {
            addCriterion("Date1 is not null");
            return (Criteria) this;
        }

        public Criteria andDate1EqualTo(String value) {
            addCriterion("Date1 =", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotEqualTo(String value) {
            addCriterion("Date1 <>", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThan(String value) {
            addCriterion("Date1 >", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThanOrEqualTo(String value) {
            addCriterion("Date1 >=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThan(String value) {
            addCriterion("Date1 <", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThanOrEqualTo(String value) {
            addCriterion("Date1 <=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Like(String value) {
            addCriterion("Date1 like", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotLike(String value) {
            addCriterion("Date1 not like", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1In(List<String> values) {
            addCriterion("Date1 in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotIn(List<String> values) {
            addCriterion("Date1 not in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Between(String value1, String value2) {
            addCriterion("Date1 between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotBetween(String value1, String value2) {
            addCriterion("Date1 not between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andTime1IsNull() {
            addCriterion("Time1 is null");
            return (Criteria) this;
        }

        public Criteria andTime1IsNotNull() {
            addCriterion("Time1 is not null");
            return (Criteria) this;
        }

        public Criteria andTime1EqualTo(String value) {
            addCriterion("Time1 =", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotEqualTo(String value) {
            addCriterion("Time1 <>", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThan(String value) {
            addCriterion("Time1 >", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThanOrEqualTo(String value) {
            addCriterion("Time1 >=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThan(String value) {
            addCriterion("Time1 <", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThanOrEqualTo(String value) {
            addCriterion("Time1 <=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Like(String value) {
            addCriterion("Time1 like", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotLike(String value) {
            addCriterion("Time1 not like", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1In(List<String> values) {
            addCriterion("Time1 in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotIn(List<String> values) {
            addCriterion("Time1 not in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Between(String value1, String value2) {
            addCriterion("Time1 between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotBetween(String value1, String value2) {
            addCriterion("Time1 not between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoIsNull() {
            addCriterion("Huodanhao is null");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoIsNotNull() {
            addCriterion("Huodanhao is not null");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoEqualTo(String value) {
            addCriterion("Huodanhao =", value, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoNotEqualTo(String value) {
            addCriterion("Huodanhao <>", value, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoGreaterThan(String value) {
            addCriterion("Huodanhao >", value, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoGreaterThanOrEqualTo(String value) {
            addCriterion("Huodanhao >=", value, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoLessThan(String value) {
            addCriterion("Huodanhao <", value, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoLessThanOrEqualTo(String value) {
            addCriterion("Huodanhao <=", value, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoLike(String value) {
            addCriterion("Huodanhao like", value, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoNotLike(String value) {
            addCriterion("Huodanhao not like", value, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoIn(List<String> values) {
            addCriterion("Huodanhao in", values, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoNotIn(List<String> values) {
            addCriterion("Huodanhao not in", values, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoBetween(String value1, String value2) {
            addCriterion("Huodanhao between", value1, value2, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andHuodanhaoNotBetween(String value1, String value2) {
            addCriterion("Huodanhao not between", value1, value2, "huodanhao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoIsNull() {
            addCriterion("Liushuihao is null");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoIsNotNull() {
            addCriterion("Liushuihao is not null");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoEqualTo(String value) {
            addCriterion("Liushuihao =", value, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoNotEqualTo(String value) {
            addCriterion("Liushuihao <>", value, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoGreaterThan(String value) {
            addCriterion("Liushuihao >", value, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoGreaterThanOrEqualTo(String value) {
            addCriterion("Liushuihao >=", value, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoLessThan(String value) {
            addCriterion("Liushuihao <", value, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoLessThanOrEqualTo(String value) {
            addCriterion("Liushuihao <=", value, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoLike(String value) {
            addCriterion("Liushuihao like", value, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoNotLike(String value) {
            addCriterion("Liushuihao not like", value, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoIn(List<String> values) {
            addCriterion("Liushuihao in", values, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoNotIn(List<String> values) {
            addCriterion("Liushuihao not in", values, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoBetween(String value1, String value2) {
            addCriterion("Liushuihao between", value1, value2, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andLiushuihaoNotBetween(String value1, String value2) {
            addCriterion("Liushuihao not between", value1, value2, "liushuihao");
            return (Criteria) this;
        }

        public Criteria andIccardnoIsNull() {
            addCriterion("ICcardno is null");
            return (Criteria) this;
        }

        public Criteria andIccardnoIsNotNull() {
            addCriterion("ICcardno is not null");
            return (Criteria) this;
        }

        public Criteria andIccardnoEqualTo(String value) {
            addCriterion("ICcardno =", value, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoNotEqualTo(String value) {
            addCriterion("ICcardno <>", value, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoGreaterThan(String value) {
            addCriterion("ICcardno >", value, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoGreaterThanOrEqualTo(String value) {
            addCriterion("ICcardno >=", value, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoLessThan(String value) {
            addCriterion("ICcardno <", value, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoLessThanOrEqualTo(String value) {
            addCriterion("ICcardno <=", value, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoLike(String value) {
            addCriterion("ICcardno like", value, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoNotLike(String value) {
            addCriterion("ICcardno not like", value, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoIn(List<String> values) {
            addCriterion("ICcardno in", values, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoNotIn(List<String> values) {
            addCriterion("ICcardno not in", values, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoBetween(String value1, String value2) {
            addCriterion("ICcardno between", value1, value2, "iccardno");
            return (Criteria) this;
        }

        public Criteria andIccardnoNotBetween(String value1, String value2) {
            addCriterion("ICcardno not between", value1, value2, "iccardno");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoIsNull() {
            addCriterion("Fapiaohao is null");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoIsNotNull() {
            addCriterion("Fapiaohao is not null");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoEqualTo(String value) {
            addCriterion("Fapiaohao =", value, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoNotEqualTo(String value) {
            addCriterion("Fapiaohao <>", value, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoGreaterThan(String value) {
            addCriterion("Fapiaohao >", value, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoGreaterThanOrEqualTo(String value) {
            addCriterion("Fapiaohao >=", value, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoLessThan(String value) {
            addCriterion("Fapiaohao <", value, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoLessThanOrEqualTo(String value) {
            addCriterion("Fapiaohao <=", value, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoLike(String value) {
            addCriterion("Fapiaohao like", value, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoNotLike(String value) {
            addCriterion("Fapiaohao not like", value, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoIn(List<String> values) {
            addCriterion("Fapiaohao in", values, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoNotIn(List<String> values) {
            addCriterion("Fapiaohao not in", values, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoBetween(String value1, String value2) {
            addCriterion("Fapiaohao between", value1, value2, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andFapiaohaoNotBetween(String value1, String value2) {
            addCriterion("Fapiaohao not between", value1, value2, "fapiaohao");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeIsNull() {
            addCriterion("GuanzhuangdanweiCode is null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeIsNotNull() {
            addCriterion("GuanzhuangdanweiCode is not null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeEqualTo(String value) {
            addCriterion("GuanzhuangdanweiCode =", value, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeNotEqualTo(String value) {
            addCriterion("GuanzhuangdanweiCode <>", value, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeGreaterThan(String value) {
            addCriterion("GuanzhuangdanweiCode >", value, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeGreaterThanOrEqualTo(String value) {
            addCriterion("GuanzhuangdanweiCode >=", value, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeLessThan(String value) {
            addCriterion("GuanzhuangdanweiCode <", value, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeLessThanOrEqualTo(String value) {
            addCriterion("GuanzhuangdanweiCode <=", value, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeLike(String value) {
            addCriterion("GuanzhuangdanweiCode like", value, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeNotLike(String value) {
            addCriterion("GuanzhuangdanweiCode not like", value, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeIn(List<String> values) {
            addCriterion("GuanzhuangdanweiCode in", values, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeNotIn(List<String> values) {
            addCriterion("GuanzhuangdanweiCode not in", values, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeBetween(String value1, String value2) {
            addCriterion("GuanzhuangdanweiCode between", value1, value2, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweicodeNotBetween(String value1, String value2) {
            addCriterion("GuanzhuangdanweiCode not between", value1, value2, "guanzhuangdanweicode");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiIsNull() {
            addCriterion("Guanzhuangdanwei is null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiIsNotNull() {
            addCriterion("Guanzhuangdanwei is not null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiEqualTo(String value) {
            addCriterion("Guanzhuangdanwei =", value, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiNotEqualTo(String value) {
            addCriterion("Guanzhuangdanwei <>", value, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiGreaterThan(String value) {
            addCriterion("Guanzhuangdanwei >", value, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiGreaterThanOrEqualTo(String value) {
            addCriterion("Guanzhuangdanwei >=", value, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiLessThan(String value) {
            addCriterion("Guanzhuangdanwei <", value, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiLessThanOrEqualTo(String value) {
            addCriterion("Guanzhuangdanwei <=", value, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiLike(String value) {
            addCriterion("Guanzhuangdanwei like", value, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiNotLike(String value) {
            addCriterion("Guanzhuangdanwei not like", value, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiIn(List<String> values) {
            addCriterion("Guanzhuangdanwei in", values, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiNotIn(List<String> values) {
            addCriterion("Guanzhuangdanwei not in", values, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiBetween(String value1, String value2) {
            addCriterion("Guanzhuangdanwei between", value1, value2, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andGuanzhuangdanweiNotBetween(String value1, String value2) {
            addCriterion("Guanzhuangdanwei not between", value1, value2, "guanzhuangdanwei");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanIsNull() {
            addCriterion("Xwjcaozuoyuan is null");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanIsNotNull() {
            addCriterion("Xwjcaozuoyuan is not null");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanEqualTo(String value) {
            addCriterion("Xwjcaozuoyuan =", value, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanNotEqualTo(String value) {
            addCriterion("Xwjcaozuoyuan <>", value, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanGreaterThan(String value) {
            addCriterion("Xwjcaozuoyuan >", value, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanGreaterThanOrEqualTo(String value) {
            addCriterion("Xwjcaozuoyuan >=", value, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanLessThan(String value) {
            addCriterion("Xwjcaozuoyuan <", value, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanLessThanOrEqualTo(String value) {
            addCriterion("Xwjcaozuoyuan <=", value, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanLike(String value) {
            addCriterion("Xwjcaozuoyuan like", value, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanNotLike(String value) {
            addCriterion("Xwjcaozuoyuan not like", value, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanIn(List<String> values) {
            addCriterion("Xwjcaozuoyuan in", values, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanNotIn(List<String> values) {
            addCriterion("Xwjcaozuoyuan not in", values, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanBetween(String value1, String value2) {
            addCriterion("Xwjcaozuoyuan between", value1, value2, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andXwjcaozuoyuanNotBetween(String value1, String value2) {
            addCriterion("Xwjcaozuoyuan not between", value1, value2, "xwjcaozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanIsNull() {
            addCriterion("Caozuoyuan is null");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanIsNotNull() {
            addCriterion("Caozuoyuan is not null");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanEqualTo(String value) {
            addCriterion("Caozuoyuan =", value, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanNotEqualTo(String value) {
            addCriterion("Caozuoyuan <>", value, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanGreaterThan(String value) {
            addCriterion("Caozuoyuan >", value, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanGreaterThanOrEqualTo(String value) {
            addCriterion("Caozuoyuan >=", value, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanLessThan(String value) {
            addCriterion("Caozuoyuan <", value, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanLessThanOrEqualTo(String value) {
            addCriterion("Caozuoyuan <=", value, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanLike(String value) {
            addCriterion("Caozuoyuan like", value, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanNotLike(String value) {
            addCriterion("Caozuoyuan not like", value, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanIn(List<String> values) {
            addCriterion("Caozuoyuan in", values, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanNotIn(List<String> values) {
            addCriterion("Caozuoyuan not in", values, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanBetween(String value1, String value2) {
            addCriterion("Caozuoyuan between", value1, value2, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andCaozuoyuanNotBetween(String value1, String value2) {
            addCriterion("Caozuoyuan not between", value1, value2, "caozuoyuan");
            return (Criteria) this;
        }

        public Criteria andYunshumodeIsNull() {
            addCriterion("Yunshumode is null");
            return (Criteria) this;
        }

        public Criteria andYunshumodeIsNotNull() {
            addCriterion("Yunshumode is not null");
            return (Criteria) this;
        }

        public Criteria andYunshumodeEqualTo(String value) {
            addCriterion("Yunshumode =", value, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeNotEqualTo(String value) {
            addCriterion("Yunshumode <>", value, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeGreaterThan(String value) {
            addCriterion("Yunshumode >", value, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeGreaterThanOrEqualTo(String value) {
            addCriterion("Yunshumode >=", value, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeLessThan(String value) {
            addCriterion("Yunshumode <", value, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeLessThanOrEqualTo(String value) {
            addCriterion("Yunshumode <=", value, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeLike(String value) {
            addCriterion("Yunshumode like", value, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeNotLike(String value) {
            addCriterion("Yunshumode not like", value, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeIn(List<String> values) {
            addCriterion("Yunshumode in", values, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeNotIn(List<String> values) {
            addCriterion("Yunshumode not in", values, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeBetween(String value1, String value2) {
            addCriterion("Yunshumode between", value1, value2, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andYunshumodeNotBetween(String value1, String value2) {
            addCriterion("Yunshumode not between", value1, value2, "yunshumode");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoIsNull() {
            addCriterion("Piaoliushuihao is null");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoIsNotNull() {
            addCriterion("Piaoliushuihao is not null");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoEqualTo(String value) {
            addCriterion("Piaoliushuihao =", value, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoNotEqualTo(String value) {
            addCriterion("Piaoliushuihao <>", value, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoGreaterThan(String value) {
            addCriterion("Piaoliushuihao >", value, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoGreaterThanOrEqualTo(String value) {
            addCriterion("Piaoliushuihao >=", value, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoLessThan(String value) {
            addCriterion("Piaoliushuihao <", value, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoLessThanOrEqualTo(String value) {
            addCriterion("Piaoliushuihao <=", value, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoLike(String value) {
            addCriterion("Piaoliushuihao like", value, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoNotLike(String value) {
            addCriterion("Piaoliushuihao not like", value, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoIn(List<String> values) {
            addCriterion("Piaoliushuihao in", values, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoNotIn(List<String> values) {
            addCriterion("Piaoliushuihao not in", values, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoBetween(String value1, String value2) {
            addCriterion("Piaoliushuihao between", value1, value2, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andPiaoliushuihaoNotBetween(String value1, String value2) {
            addCriterion("Piaoliushuihao not between", value1, value2, "piaoliushuihao");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiIsNull() {
            addCriterion("Fukuanfangshi is null");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiIsNotNull() {
            addCriterion("Fukuanfangshi is not null");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiEqualTo(String value) {
            addCriterion("Fukuanfangshi =", value, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiNotEqualTo(String value) {
            addCriterion("Fukuanfangshi <>", value, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiGreaterThan(String value) {
            addCriterion("Fukuanfangshi >", value, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiGreaterThanOrEqualTo(String value) {
            addCriterion("Fukuanfangshi >=", value, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiLessThan(String value) {
            addCriterion("Fukuanfangshi <", value, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiLessThanOrEqualTo(String value) {
            addCriterion("Fukuanfangshi <=", value, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiLike(String value) {
            addCriterion("Fukuanfangshi like", value, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiNotLike(String value) {
            addCriterion("Fukuanfangshi not like", value, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiIn(List<String> values) {
            addCriterion("Fukuanfangshi in", values, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiNotIn(List<String> values) {
            addCriterion("Fukuanfangshi not in", values, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiBetween(String value1, String value2) {
            addCriterion("Fukuanfangshi between", value1, value2, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andFukuanfangshiNotBetween(String value1, String value2) {
            addCriterion("Fukuanfangshi not between", value1, value2, "fukuanfangshi");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingIsNull() {
            addCriterion("Xiaoshouleixing is null");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingIsNotNull() {
            addCriterion("Xiaoshouleixing is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingEqualTo(String value) {
            addCriterion("Xiaoshouleixing =", value, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingNotEqualTo(String value) {
            addCriterion("Xiaoshouleixing <>", value, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingGreaterThan(String value) {
            addCriterion("Xiaoshouleixing >", value, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingGreaterThanOrEqualTo(String value) {
            addCriterion("Xiaoshouleixing >=", value, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingLessThan(String value) {
            addCriterion("Xiaoshouleixing <", value, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingLessThanOrEqualTo(String value) {
            addCriterion("Xiaoshouleixing <=", value, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingLike(String value) {
            addCriterion("Xiaoshouleixing like", value, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingNotLike(String value) {
            addCriterion("Xiaoshouleixing not like", value, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingIn(List<String> values) {
            addCriterion("Xiaoshouleixing in", values, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingNotIn(List<String> values) {
            addCriterion("Xiaoshouleixing not in", values, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingBetween(String value1, String value2) {
            addCriterion("Xiaoshouleixing between", value1, value2, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andXiaoshouleixingNotBetween(String value1, String value2) {
            addCriterion("Xiaoshouleixing not between", value1, value2, "xiaoshouleixing");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameIsNull() {
            addCriterion("zuguandanweiName is null");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameIsNotNull() {
            addCriterion("zuguandanweiName is not null");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameEqualTo(String value) {
            addCriterion("zuguandanweiName =", value, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameNotEqualTo(String value) {
            addCriterion("zuguandanweiName <>", value, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameGreaterThan(String value) {
            addCriterion("zuguandanweiName >", value, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameGreaterThanOrEqualTo(String value) {
            addCriterion("zuguandanweiName >=", value, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameLessThan(String value) {
            addCriterion("zuguandanweiName <", value, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameLessThanOrEqualTo(String value) {
            addCriterion("zuguandanweiName <=", value, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameLike(String value) {
            addCriterion("zuguandanweiName like", value, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameNotLike(String value) {
            addCriterion("zuguandanweiName not like", value, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameIn(List<String> values) {
            addCriterion("zuguandanweiName in", values, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameNotIn(List<String> values) {
            addCriterion("zuguandanweiName not in", values, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameBetween(String value1, String value2) {
            addCriterion("zuguandanweiName between", value1, value2, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweinameNotBetween(String value1, String value2) {
            addCriterion("zuguandanweiName not between", value1, value2, "zuguandanweiname");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressIsNull() {
            addCriterion("ZuguandanweiAddress is null");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressIsNotNull() {
            addCriterion("ZuguandanweiAddress is not null");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressEqualTo(String value) {
            addCriterion("ZuguandanweiAddress =", value, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressNotEqualTo(String value) {
            addCriterion("ZuguandanweiAddress <>", value, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressGreaterThan(String value) {
            addCriterion("ZuguandanweiAddress >", value, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ZuguandanweiAddress >=", value, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressLessThan(String value) {
            addCriterion("ZuguandanweiAddress <", value, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressLessThanOrEqualTo(String value) {
            addCriterion("ZuguandanweiAddress <=", value, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressLike(String value) {
            addCriterion("ZuguandanweiAddress like", value, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressNotLike(String value) {
            addCriterion("ZuguandanweiAddress not like", value, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressIn(List<String> values) {
            addCriterion("ZuguandanweiAddress in", values, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressNotIn(List<String> values) {
            addCriterion("ZuguandanweiAddress not in", values, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressBetween(String value1, String value2) {
            addCriterion("ZuguandanweiAddress between", value1, value2, "zuguandanweiaddress");
            return (Criteria) this;
        }

        public Criteria andZuguandanweiaddressNotBetween(String value1, String value2) {
            addCriterion("ZuguandanweiAddress not between", value1, value2, "zuguandanweiaddress");
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