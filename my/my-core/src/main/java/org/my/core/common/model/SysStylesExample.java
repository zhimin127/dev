package org.my.core.common.model;

import java.util.ArrayList;
import java.util.List;

public class SysStylesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public SysStylesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
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
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
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

        public Criteria andStyleIdIsNull() {
            addCriterion("STYLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStyleIdIsNotNull() {
            addCriterion("STYLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStyleIdEqualTo(String value) {
            addCriterion("STYLE_ID =", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotEqualTo(String value) {
            addCriterion("STYLE_ID <>", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdGreaterThan(String value) {
            addCriterion("STYLE_ID >", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE_ID >=", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdLessThan(String value) {
            addCriterion("STYLE_ID <", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdLessThanOrEqualTo(String value) {
            addCriterion("STYLE_ID <=", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdLike(String value) {
            addCriterion("STYLE_ID like", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotLike(String value) {
            addCriterion("STYLE_ID not like", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdIn(List<String> values) {
            addCriterion("STYLE_ID in", values, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotIn(List<String> values) {
            addCriterion("STYLE_ID not in", values, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdBetween(String value1, String value2) {
            addCriterion("STYLE_ID between", value1, value2, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotBetween(String value1, String value2) {
            addCriterion("STYLE_ID not between", value1, value2, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNull() {
            addCriterion("STYLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNotNull() {
            addCriterion("STYLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStyleNameEqualTo(String value) {
            addCriterion("STYLE_NAME =", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotEqualTo(String value) {
            addCriterion("STYLE_NAME <>", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThan(String value) {
            addCriterion("STYLE_NAME >", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE_NAME >=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThan(String value) {
            addCriterion("STYLE_NAME <", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThanOrEqualTo(String value) {
            addCriterion("STYLE_NAME <=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLike(String value) {
            addCriterion("STYLE_NAME like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotLike(String value) {
            addCriterion("STYLE_NAME not like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameIn(List<String> values) {
            addCriterion("STYLE_NAME in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotIn(List<String> values) {
            addCriterion("STYLE_NAME not in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameBetween(String value1, String value2) {
            addCriterion("STYLE_NAME between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotBetween(String value1, String value2) {
            addCriterion("STYLE_NAME not between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleClassIsNull() {
            addCriterion("STYLE_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andStyleClassIsNotNull() {
            addCriterion("STYLE_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andStyleClassEqualTo(String value) {
            addCriterion("STYLE_CLASS =", value, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassNotEqualTo(String value) {
            addCriterion("STYLE_CLASS <>", value, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassGreaterThan(String value) {
            addCriterion("STYLE_CLASS >", value, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE_CLASS >=", value, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassLessThan(String value) {
            addCriterion("STYLE_CLASS <", value, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassLessThanOrEqualTo(String value) {
            addCriterion("STYLE_CLASS <=", value, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassLike(String value) {
            addCriterion("STYLE_CLASS like", value, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassNotLike(String value) {
            addCriterion("STYLE_CLASS not like", value, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassIn(List<String> values) {
            addCriterion("STYLE_CLASS in", values, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassNotIn(List<String> values) {
            addCriterion("STYLE_CLASS not in", values, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassBetween(String value1, String value2) {
            addCriterion("STYLE_CLASS between", value1, value2, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleClassNotBetween(String value1, String value2) {
            addCriterion("STYLE_CLASS not between", value1, value2, "styleClass");
            return (Criteria) this;
        }

        public Criteria andStyleCssIsNull() {
            addCriterion("STYLE_CSS is null");
            return (Criteria) this;
        }

        public Criteria andStyleCssIsNotNull() {
            addCriterion("STYLE_CSS is not null");
            return (Criteria) this;
        }

        public Criteria andStyleCssEqualTo(String value) {
            addCriterion("STYLE_CSS =", value, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssNotEqualTo(String value) {
            addCriterion("STYLE_CSS <>", value, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssGreaterThan(String value) {
            addCriterion("STYLE_CSS >", value, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE_CSS >=", value, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssLessThan(String value) {
            addCriterion("STYLE_CSS <", value, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssLessThanOrEqualTo(String value) {
            addCriterion("STYLE_CSS <=", value, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssLike(String value) {
            addCriterion("STYLE_CSS like", value, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssNotLike(String value) {
            addCriterion("STYLE_CSS not like", value, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssIn(List<String> values) {
            addCriterion("STYLE_CSS in", values, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssNotIn(List<String> values) {
            addCriterion("STYLE_CSS not in", values, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssBetween(String value1, String value2) {
            addCriterion("STYLE_CSS between", value1, value2, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleCssNotBetween(String value1, String value2) {
            addCriterion("STYLE_CSS not between", value1, value2, "styleCss");
            return (Criteria) this;
        }

        public Criteria andStyleDescIsNull() {
            addCriterion("STYLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andStyleDescIsNotNull() {
            addCriterion("STYLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andStyleDescEqualTo(String value) {
            addCriterion("STYLE_DESC =", value, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescNotEqualTo(String value) {
            addCriterion("STYLE_DESC <>", value, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescGreaterThan(String value) {
            addCriterion("STYLE_DESC >", value, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE_DESC >=", value, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescLessThan(String value) {
            addCriterion("STYLE_DESC <", value, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescLessThanOrEqualTo(String value) {
            addCriterion("STYLE_DESC <=", value, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescLike(String value) {
            addCriterion("STYLE_DESC like", value, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescNotLike(String value) {
            addCriterion("STYLE_DESC not like", value, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescIn(List<String> values) {
            addCriterion("STYLE_DESC in", values, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescNotIn(List<String> values) {
            addCriterion("STYLE_DESC not in", values, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescBetween(String value1, String value2) {
            addCriterion("STYLE_DESC between", value1, value2, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andStyleDescNotBetween(String value1, String value2) {
            addCriterion("STYLE_DESC not between", value1, value2, "styleDesc");
            return (Criteria) this;
        }

        public Criteria andIconNameIsNull() {
            addCriterion("ICON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIconNameIsNotNull() {
            addCriterion("ICON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIconNameEqualTo(String value) {
            addCriterion("ICON_NAME =", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameNotEqualTo(String value) {
            addCriterion("ICON_NAME <>", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameGreaterThan(String value) {
            addCriterion("ICON_NAME >", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_NAME >=", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameLessThan(String value) {
            addCriterion("ICON_NAME <", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameLessThanOrEqualTo(String value) {
            addCriterion("ICON_NAME <=", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameLike(String value) {
            addCriterion("ICON_NAME like", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameNotLike(String value) {
            addCriterion("ICON_NAME not like", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameIn(List<String> values) {
            addCriterion("ICON_NAME in", values, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameNotIn(List<String> values) {
            addCriterion("ICON_NAME not in", values, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameBetween(String value1, String value2) {
            addCriterion("ICON_NAME between", value1, value2, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameNotBetween(String value1, String value2) {
            addCriterion("ICON_NAME not between", value1, value2, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconCssIsNull() {
            addCriterion("ICON_CSS is null");
            return (Criteria) this;
        }

        public Criteria andIconCssIsNotNull() {
            addCriterion("ICON_CSS is not null");
            return (Criteria) this;
        }

        public Criteria andIconCssEqualTo(String value) {
            addCriterion("ICON_CSS =", value, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssNotEqualTo(String value) {
            addCriterion("ICON_CSS <>", value, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssGreaterThan(String value) {
            addCriterion("ICON_CSS >", value, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_CSS >=", value, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssLessThan(String value) {
            addCriterion("ICON_CSS <", value, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssLessThanOrEqualTo(String value) {
            addCriterion("ICON_CSS <=", value, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssLike(String value) {
            addCriterion("ICON_CSS like", value, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssNotLike(String value) {
            addCriterion("ICON_CSS not like", value, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssIn(List<String> values) {
            addCriterion("ICON_CSS in", values, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssNotIn(List<String> values) {
            addCriterion("ICON_CSS not in", values, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssBetween(String value1, String value2) {
            addCriterion("ICON_CSS between", value1, value2, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconCssNotBetween(String value1, String value2) {
            addCriterion("ICON_CSS not between", value1, value2, "iconCss");
            return (Criteria) this;
        }

        public Criteria andIconDescIsNull() {
            addCriterion("ICON_DESC is null");
            return (Criteria) this;
        }

        public Criteria andIconDescIsNotNull() {
            addCriterion("ICON_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andIconDescEqualTo(String value) {
            addCriterion("ICON_DESC =", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescNotEqualTo(String value) {
            addCriterion("ICON_DESC <>", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescGreaterThan(String value) {
            addCriterion("ICON_DESC >", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_DESC >=", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescLessThan(String value) {
            addCriterion("ICON_DESC <", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescLessThanOrEqualTo(String value) {
            addCriterion("ICON_DESC <=", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescLike(String value) {
            addCriterion("ICON_DESC like", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescNotLike(String value) {
            addCriterion("ICON_DESC not like", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescIn(List<String> values) {
            addCriterion("ICON_DESC in", values, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescNotIn(List<String> values) {
            addCriterion("ICON_DESC not in", values, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescBetween(String value1, String value2) {
            addCriterion("ICON_DESC between", value1, value2, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescNotBetween(String value1, String value2) {
            addCriterion("ICON_DESC not between", value1, value2, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_styles
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 15 14:28:04 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_styles
     *
     * @mbggenerated Sun Mar 15 14:28:04 CST 2015
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