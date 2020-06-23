package com.gqgx.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandDycTypeItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandDycTypeItemExample() {
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
            addCriterion("A.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("A.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("A.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("A.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("A.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("A.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("A.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("A.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("A.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("A.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("A.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("A.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNavItemIdIsNull() {
            addCriterion("A.nav_item_id is null");
            return (Criteria) this;
        }

        public Criteria andNavItemIdIsNotNull() {
            addCriterion("A.nav_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andNavItemIdEqualTo(Long value) {
            addCriterion("A.nav_item_id =", value, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdNotEqualTo(Long value) {
            addCriterion("A.nav_item_id <>", value, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdGreaterThan(Long value) {
            addCriterion("A.nav_item_id >", value, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("A.nav_item_id >=", value, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdLessThan(Long value) {
            addCriterion("A.nav_item_id <", value, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdLessThanOrEqualTo(Long value) {
            addCriterion("A.nav_item_id <=", value, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdIn(List<Long> values) {
            addCriterion("A.nav_item_id in", values, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdNotIn(List<Long> values) {
            addCriterion("A.nav_item_id not in", values, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdBetween(Long value1, Long value2) {
            addCriterion("A.nav_item_id between", value1, value2, "navItemId");
            return (Criteria) this;
        }

        public Criteria andNavItemIdNotBetween(Long value1, Long value2) {
            addCriterion("A.nav_item_id not between", value1, value2, "navItemId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdIsNull() {
            addCriterion("A.large_type_id is null");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdIsNotNull() {
            addCriterion("A.large_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdEqualTo(Long value) {
            addCriterion("A.large_type_id =", value, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdNotEqualTo(Long value) {
            addCriterion("A.large_type_id <>", value, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdGreaterThan(Long value) {
            addCriterion("A.large_type_id >", value, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("A.large_type_id >=", value, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdLessThan(Long value) {
            addCriterion("A.large_type_id <", value, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("A.large_type_id <=", value, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdIn(List<Long> values) {
            addCriterion("A.large_type_id in", values, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdNotIn(List<Long> values) {
            addCriterion("A.large_type_id not in", values, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdBetween(Long value1, Long value2) {
            addCriterion("A.large_type_id between", value1, value2, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andLargeTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("A.large_type_id not between", value1, value2, "largeTypeId");
            return (Criteria) this;
        }

        public Criteria andTypeNoIsNull() {
            addCriterion("A.type_no is null");
            return (Criteria) this;
        }

        public Criteria andTypeNoIsNotNull() {
            addCriterion("A.type_no is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNoEqualTo(String value) {
            addCriterion("A.type_no =", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotEqualTo(String value) {
            addCriterion("A.type_no <>", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoGreaterThan(String value) {
            addCriterion("A.type_no >", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("A.type_no >=", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoLessThan(String value) {
            addCriterion("A.type_no <", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoLessThanOrEqualTo(String value) {
            addCriterion("A.type_no <=", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoLike(String value) {
            addCriterion("A.type_no like", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotLike(String value) {
            addCriterion("A.type_no not like", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoIn(List<String> values) {
            addCriterion("A.type_no in", values, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotIn(List<String> values) {
            addCriterion("A.type_no not in", values, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoBetween(String value1, String value2) {
            addCriterion("A.type_no between", value1, value2, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotBetween(String value1, String value2) {
            addCriterion("A.type_no not between", value1, value2, "typeNo");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("A.project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("A.project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("A.project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("A.project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("A.project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("A.project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("A.project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("A.project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("A.project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("A.project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("A.project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("A.project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("A.project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationIsNull() {
            addCriterion("A.project_translation is null");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationIsNotNull() {
            addCriterion("A.project_translation is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationEqualTo(String value) {
            addCriterion("A.project_translation =", value, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationNotEqualTo(String value) {
            addCriterion("A.project_translation <>", value, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationGreaterThan(String value) {
            addCriterion("A.project_translation >", value, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_translation >=", value, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationLessThan(String value) {
            addCriterion("A.project_translation <", value, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationLessThanOrEqualTo(String value) {
            addCriterion("A.project_translation <=", value, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationLike(String value) {
            addCriterion("A.project_translation like", value, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationNotLike(String value) {
            addCriterion("A.project_translation not like", value, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationIn(List<String> values) {
            addCriterion("A.project_translation in", values, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationNotIn(List<String> values) {
            addCriterion("A.project_translation not in", values, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationBetween(String value1, String value2) {
            addCriterion("A.project_translation between", value1, value2, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectTranslationNotBetween(String value1, String value2) {
            addCriterion("A.project_translation not between", value1, value2, "projectTranslation");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("A.project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("A.project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(String value) {
            addCriterion("A.project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(String value) {
            addCriterion("A.project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(String value) {
            addCriterion("A.project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(String value) {
            addCriterion("A.project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(String value) {
            addCriterion("A.project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLike(String value) {
            addCriterion("A.project_status like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotLike(String value) {
            addCriterion("A.project_status not like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<String> values) {
            addCriterion("A.project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<String> values) {
            addCriterion("A.project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(String value1, String value2) {
            addCriterion("A.project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(String value1, String value2) {
            addCriterion("A.project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateIsNull() {
            addCriterion("A.project_invalid_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateIsNotNull() {
            addCriterion("A.project_invalid_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateEqualTo(String value) {
            addCriterion("A.project_invalid_date =", value, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateNotEqualTo(String value) {
            addCriterion("A.project_invalid_date <>", value, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateGreaterThan(String value) {
            addCriterion("A.project_invalid_date >", value, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_invalid_date >=", value, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateLessThan(String value) {
            addCriterion("A.project_invalid_date <", value, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateLessThanOrEqualTo(String value) {
            addCriterion("A.project_invalid_date <=", value, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateLike(String value) {
            addCriterion("A.project_invalid_date like", value, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateNotLike(String value) {
            addCriterion("A.project_invalid_date not like", value, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateIn(List<String> values) {
            addCriterion("A.project_invalid_date in", values, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateNotIn(List<String> values) {
            addCriterion("A.project_invalid_date not in", values, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateBetween(String value1, String value2) {
            addCriterion("A.project_invalid_date between", value1, value2, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectInvalidDateNotBetween(String value1, String value2) {
            addCriterion("A.project_invalid_date not between", value1, value2, "projectInvalidDate");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("A.project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("A.project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("A.project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("A.project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("A.project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("A.project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("A.project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("A.project_type like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("A.project_type not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("A.project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("A.project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("A.project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("A.project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectVersionIsNull() {
            addCriterion("A.project_version is null");
            return (Criteria) this;
        }

        public Criteria andProjectVersionIsNotNull() {
            addCriterion("A.project_version is not null");
            return (Criteria) this;
        }

        public Criteria andProjectVersionEqualTo(String value) {
            addCriterion("A.project_version =", value, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionNotEqualTo(String value) {
            addCriterion("A.project_version <>", value, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionGreaterThan(String value) {
            addCriterion("A.project_version >", value, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_version >=", value, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionLessThan(String value) {
            addCriterion("A.project_version <", value, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionLessThanOrEqualTo(String value) {
            addCriterion("A.project_version <=", value, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionLike(String value) {
            addCriterion("A.project_version like", value, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionNotLike(String value) {
            addCriterion("A.project_version not like", value, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionIn(List<String> values) {
            addCriterion("A.project_version in", values, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionNotIn(List<String> values) {
            addCriterion("A.project_version not in", values, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionBetween(String value1, String value2) {
            addCriterion("A.project_version between", value1, value2, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andProjectVersionNotBetween(String value1, String value2) {
            addCriterion("A.project_version not between", value1, value2, "projectVersion");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("A.record_status is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("A.record_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(String value) {
            addCriterion("A.record_status =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(String value) {
            addCriterion("A.record_status <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(String value) {
            addCriterion("A.record_status >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(String value) {
            addCriterion("A.record_status >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(String value) {
            addCriterion("A.record_status <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(String value) {
            addCriterion("A.record_status <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLike(String value) {
            addCriterion("A.record_status like", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotLike(String value) {
            addCriterion("A.record_status not like", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<String> values) {
            addCriterion("A.record_status in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<String> values) {
            addCriterion("A.record_status not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(String value1, String value2) {
            addCriterion("A.record_status between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(String value1, String value2) {
            addCriterion("A.record_status not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNull() {
            addCriterion("A.update_count is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNotNull() {
            addCriterion("A.update_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountEqualTo(Integer value) {
            addCriterion("A.update_count =", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotEqualTo(Integer value) {
            addCriterion("A.update_count <>", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThan(Integer value) {
            addCriterion("A.update_count >", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("A.update_count >=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThan(Integer value) {
            addCriterion("A.update_count <", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThanOrEqualTo(Integer value) {
            addCriterion("A.update_count <=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIn(List<Integer> values) {
            addCriterion("A.update_count in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotIn(List<Integer> values) {
            addCriterion("A.update_count not in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountBetween(Integer value1, Integer value2) {
            addCriterion("A.update_count between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotBetween(Integer value1, Integer value2) {
            addCriterion("A.update_count not between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("A.create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("A.create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("A.create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("A.create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("A.create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("A.create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("A.create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("A.create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("A.create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("A.create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("A.create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("A.create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("A.creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("A.creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("A.creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("A.creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("A.creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("A.creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("A.creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("A.creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("A.creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("A.creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("A.creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("A.creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("A.update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("A.update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("A.update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("A.update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("A.update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("A.update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("A.update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("A.update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("A.update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("A.update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("A.update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("A.update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("A.updater_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("A.updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(Long value) {
            addCriterion("A.updater_id =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(Long value) {
            addCriterion("A.updater_id <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(Long value) {
            addCriterion("A.updater_id >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("A.updater_id >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(Long value) {
            addCriterion("A.updater_id <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(Long value) {
            addCriterion("A.updater_id <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<Long> values) {
            addCriterion("A.updater_id in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<Long> values) {
            addCriterion("A.updater_id not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(Long value1, Long value2) {
            addCriterion("A.updater_id between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(Long value1, Long value2) {
            addCriterion("A.updater_id not between", value1, value2, "updaterId");
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