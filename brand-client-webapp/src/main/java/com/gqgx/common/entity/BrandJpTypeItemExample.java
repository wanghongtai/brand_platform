package com.gqgx.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandJpTypeItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandJpTypeItemExample() {
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

        public Criteria andProjectCoorIsNull() {
            addCriterion("A.project_coor is null");
            return (Criteria) this;
        }

        public Criteria andProjectCoorIsNotNull() {
            addCriterion("A.project_coor is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCoorEqualTo(String value) {
            addCriterion("A.project_coor =", value, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorNotEqualTo(String value) {
            addCriterion("A.project_coor <>", value, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorGreaterThan(String value) {
            addCriterion("A.project_coor >", value, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_coor >=", value, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorLessThan(String value) {
            addCriterion("A.project_coor <", value, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorLessThanOrEqualTo(String value) {
            addCriterion("A.project_coor <=", value, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorLike(String value) {
            addCriterion("A.project_coor like", value, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorNotLike(String value) {
            addCriterion("A.project_coor not like", value, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorIn(List<String> values) {
            addCriterion("A.project_coor in", values, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorNotIn(List<String> values) {
            addCriterion("A.project_coor not in", values, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorBetween(String value1, String value2) {
            addCriterion("A.project_coor between", value1, value2, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectCoorNotBetween(String value1, String value2) {
            addCriterion("A.project_coor not between", value1, value2, "projectCoor");
            return (Criteria) this;
        }

        public Criteria andProjectHarmIsNull() {
            addCriterion("A.project_harm is null");
            return (Criteria) this;
        }

        public Criteria andProjectHarmIsNotNull() {
            addCriterion("A.project_harm is not null");
            return (Criteria) this;
        }

        public Criteria andProjectHarmEqualTo(String value) {
            addCriterion("A.project_harm =", value, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmNotEqualTo(String value) {
            addCriterion("A.project_harm <>", value, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmGreaterThan(String value) {
            addCriterion("A.project_harm >", value, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_harm >=", value, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmLessThan(String value) {
            addCriterion("A.project_harm <", value, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmLessThanOrEqualTo(String value) {
            addCriterion("A.project_harm <=", value, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmLike(String value) {
            addCriterion("A.project_harm like", value, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmNotLike(String value) {
            addCriterion("A.project_harm not like", value, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmIn(List<String> values) {
            addCriterion("A.project_harm in", values, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmNotIn(List<String> values) {
            addCriterion("A.project_harm not in", values, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmBetween(String value1, String value2) {
            addCriterion("A.project_harm between", value1, value2, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectHarmNotBetween(String value1, String value2) {
            addCriterion("A.project_harm not between", value1, value2, "projectHarm");
            return (Criteria) this;
        }

        public Criteria andProjectNiceIsNull() {
            addCriterion("A.project_nice is null");
            return (Criteria) this;
        }

        public Criteria andProjectNiceIsNotNull() {
            addCriterion("A.project_nice is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNiceEqualTo(String value) {
            addCriterion("A.project_nice =", value, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceNotEqualTo(String value) {
            addCriterion("A.project_nice <>", value, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceGreaterThan(String value) {
            addCriterion("A.project_nice >", value, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_nice >=", value, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceLessThan(String value) {
            addCriterion("A.project_nice <", value, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceLessThanOrEqualTo(String value) {
            addCriterion("A.project_nice <=", value, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceLike(String value) {
            addCriterion("A.project_nice like", value, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceNotLike(String value) {
            addCriterion("A.project_nice not like", value, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceIn(List<String> values) {
            addCriterion("A.project_nice in", values, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceNotIn(List<String> values) {
            addCriterion("A.project_nice not in", values, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceBetween(String value1, String value2) {
            addCriterion("A.project_nice between", value1, value2, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectNiceNotBetween(String value1, String value2) {
            addCriterion("A.project_nice not between", value1, value2, "projectNice");
            return (Criteria) this;
        }

        public Criteria andProjectIdliIsNull() {
            addCriterion("A.project_idli is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdliIsNotNull() {
            addCriterion("A.project_idli is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdliEqualTo(String value) {
            addCriterion("A.project_idli =", value, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliNotEqualTo(String value) {
            addCriterion("A.project_idli <>", value, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliGreaterThan(String value) {
            addCriterion("A.project_idli >", value, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_idli >=", value, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliLessThan(String value) {
            addCriterion("A.project_idli <", value, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliLessThanOrEqualTo(String value) {
            addCriterion("A.project_idli <=", value, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliLike(String value) {
            addCriterion("A.project_idli like", value, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliNotLike(String value) {
            addCriterion("A.project_idli not like", value, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliIn(List<String> values) {
            addCriterion("A.project_idli in", values, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliNotIn(List<String> values) {
            addCriterion("A.project_idli not in", values, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliBetween(String value1, String value2) {
            addCriterion("A.project_idli between", value1, value2, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectIdliNotBetween(String value1, String value2) {
            addCriterion("A.project_idli not between", value1, value2, "projectIdli");
            return (Criteria) this;
        }

        public Criteria andProjectMgsIsNull() {
            addCriterion("A.project_mgs is null");
            return (Criteria) this;
        }

        public Criteria andProjectMgsIsNotNull() {
            addCriterion("A.project_mgs is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMgsEqualTo(String value) {
            addCriterion("A.project_mgs =", value, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsNotEqualTo(String value) {
            addCriterion("A.project_mgs <>", value, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsGreaterThan(String value) {
            addCriterion("A.project_mgs >", value, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsGreaterThanOrEqualTo(String value) {
            addCriterion("A.project_mgs >=", value, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsLessThan(String value) {
            addCriterion("A.project_mgs <", value, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsLessThanOrEqualTo(String value) {
            addCriterion("A.project_mgs <=", value, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsLike(String value) {
            addCriterion("A.project_mgs like", value, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsNotLike(String value) {
            addCriterion("A.project_mgs not like", value, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsIn(List<String> values) {
            addCriterion("A.project_mgs in", values, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsNotIn(List<String> values) {
            addCriterion("A.project_mgs not in", values, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsBetween(String value1, String value2) {
            addCriterion("A.project_mgs between", value1, value2, "projectMgs");
            return (Criteria) this;
        }

        public Criteria andProjectMgsNotBetween(String value1, String value2) {
            addCriterion("A.project_mgs not between", value1, value2, "projectMgs");
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