package org.linlinjava.litemall.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LitemallCouponExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public LitemallCouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public LitemallCouponExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public LitemallCouponExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyIsNull() {
            addCriterion("type_money is null");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyIsNotNull() {
            addCriterion("type_money is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyEqualTo(BigDecimal value) {
            addCriterion("type_money =", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("type_money <>", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyGreaterThan(BigDecimal value) {
            addCriterion("type_money >", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("type_money >=", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyLessThan(BigDecimal value) {
            addCriterion("type_money <", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("type_money <=", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyIn(List<BigDecimal> values) {
            addCriterion("type_money in", values, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("type_money not in", values, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_money between", value1, value2, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_money not between", value1, value2, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(Byte value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(Byte value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(Byte value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(Byte value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(Byte value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<Byte> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<Byte> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(Byte value1, Byte value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andMinAmountIsNull() {
            addCriterion("min_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinAmountIsNotNull() {
            addCriterion("min_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinAmountEqualTo(BigDecimal value) {
            addCriterion("min_amount =", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotEqualTo(BigDecimal value) {
            addCriterion("min_amount <>", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountGreaterThan(BigDecimal value) {
            addCriterion("min_amount >", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_amount >=", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountLessThan(BigDecimal value) {
            addCriterion("min_amount <", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_amount <=", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountIn(List<BigDecimal> values) {
            addCriterion("min_amount in", values, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotIn(List<BigDecimal> values) {
            addCriterion("min_amount not in", values, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_amount between", value1, value2, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_amount not between", value1, value2, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIsNull() {
            addCriterion("max_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIsNotNull() {
            addCriterion("max_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAmountEqualTo(BigDecimal value) {
            addCriterion("max_amount =", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("max_amount <>", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountGreaterThan(BigDecimal value) {
            addCriterion("max_amount >", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_amount >=", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountLessThan(BigDecimal value) {
            addCriterion("max_amount <", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_amount <=", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIn(List<BigDecimal> values) {
            addCriterion("max_amount in", values, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("max_amount not in", values, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_amount between", value1, value2, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_amount not between", value1, value2, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountIsNull() {
            addCriterion("min_goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountIsNotNull() {
            addCriterion("min_goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("min_goods_amount =", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("min_goods_amount <>", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("min_goods_amount >", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_goods_amount >=", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountLessThan(BigDecimal value) {
            addCriterion("min_goods_amount <", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_goods_amount <=", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("min_goods_amount in", values, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("min_goods_amount not in", values, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_goods_amount between", value1, value2, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_goods_amount not between", value1, value2, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSendStartIsNull() {
            addCriterion("send_start is null");
            return (Criteria) this;
        }

        public Criteria andSendStartIsNotNull() {
            addCriterion("send_start is not null");
            return (Criteria) this;
        }

        public Criteria andSendStartEqualTo(LocalDateTime value) {
            addCriterion("send_start =", value, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartNotEqualTo(LocalDateTime value) {
            addCriterion("send_start <>", value, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartGreaterThan(LocalDateTime value) {
            addCriterion("send_start >", value, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("send_start >=", value, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartLessThan(LocalDateTime value) {
            addCriterion("send_start <", value, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("send_start <=", value, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartIn(List<LocalDateTime> values) {
            addCriterion("send_start in", values, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartNotIn(List<LocalDateTime> values) {
            addCriterion("send_start not in", values, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("send_start between", value1, value2, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendStartNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("send_start not between", value1, value2, "sendStart");
            return (Criteria) this;
        }

        public Criteria andSendEndIsNull() {
            addCriterion("send_end is null");
            return (Criteria) this;
        }

        public Criteria andSendEndIsNotNull() {
            addCriterion("send_end is not null");
            return (Criteria) this;
        }

        public Criteria andSendEndEqualTo(LocalDateTime value) {
            addCriterion("send_end =", value, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndNotEqualTo(LocalDateTime value) {
            addCriterion("send_end <>", value, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndGreaterThan(LocalDateTime value) {
            addCriterion("send_end >", value, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("send_end >=", value, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndLessThan(LocalDateTime value) {
            addCriterion("send_end <", value, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("send_end <=", value, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndIn(List<LocalDateTime> values) {
            addCriterion("send_end in", values, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndNotIn(List<LocalDateTime> values) {
            addCriterion("send_end not in", values, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("send_end between", value1, value2, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andSendEndNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("send_end not between", value1, value2, "sendEnd");
            return (Criteria) this;
        }

        public Criteria andUseStartIsNull() {
            addCriterion("use_start is null");
            return (Criteria) this;
        }

        public Criteria andUseStartIsNotNull() {
            addCriterion("use_start is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartEqualTo(LocalDateTime value) {
            addCriterion("use_start =", value, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartNotEqualTo(LocalDateTime value) {
            addCriterion("use_start <>", value, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartGreaterThan(LocalDateTime value) {
            addCriterion("use_start >", value, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("use_start >=", value, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartLessThan(LocalDateTime value) {
            addCriterion("use_start <", value, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("use_start <=", value, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartIn(List<LocalDateTime> values) {
            addCriterion("use_start in", values, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartNotIn(List<LocalDateTime> values) {
            addCriterion("use_start not in", values, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("use_start between", value1, value2, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseStartNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("use_start not between", value1, value2, "useStart");
            return (Criteria) this;
        }

        public Criteria andUseEndIsNull() {
            addCriterion("use_end is null");
            return (Criteria) this;
        }

        public Criteria andUseEndIsNotNull() {
            addCriterion("use_end is not null");
            return (Criteria) this;
        }

        public Criteria andUseEndEqualTo(LocalDateTime value) {
            addCriterion("use_end =", value, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndNotEqualTo(LocalDateTime value) {
            addCriterion("use_end <>", value, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndGreaterThan(LocalDateTime value) {
            addCriterion("use_end >", value, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("use_end >=", value, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndLessThan(LocalDateTime value) {
            addCriterion("use_end <", value, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("use_end <=", value, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndIn(List<LocalDateTime> values) {
            addCriterion("use_end in", values, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndNotIn(List<LocalDateTime> values) {
            addCriterion("use_end not in", values, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("use_end between", value1, value2, "useEnd");
            return (Criteria) this;
        }

        public Criteria andUseEndNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("use_end not between", value1, value2, "useEnd");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(LocalDateTime value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(LocalDateTime value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(LocalDateTime value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<LocalDateTime> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<LocalDateTime> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table litemall_coupon
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_coupon
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private LitemallCouponExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_coupon
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(LitemallCouponExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_coupon
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public LitemallCouponExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_coupon
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This interface was generated by MyBatis Generator.
         * This interface corresponds to the database table litemall_coupon
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table litemall_coupon
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
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