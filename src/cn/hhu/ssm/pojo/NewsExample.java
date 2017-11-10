package cn.hhu.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewstitleIsNull() {
            addCriterion("newstitle is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNotNull() {
            addCriterion("newstitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleEqualTo(String value) {
            addCriterion("newstitle =", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotEqualTo(String value) {
            addCriterion("newstitle <>", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThan(String value) {
            addCriterion("newstitle >", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("newstitle >=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThan(String value) {
            addCriterion("newstitle <", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThanOrEqualTo(String value) {
            addCriterion("newstitle <=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLike(String value) {
            addCriterion("newstitle like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotLike(String value) {
            addCriterion("newstitle not like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleIn(List<String> values) {
            addCriterion("newstitle in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotIn(List<String> values) {
            addCriterion("newstitle not in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleBetween(String value1, String value2) {
            addCriterion("newstitle between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotBetween(String value1, String value2) {
            addCriterion("newstitle not between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewscontentIsNull() {
            addCriterion("newscontent is null");
            return (Criteria) this;
        }

        public Criteria andNewscontentIsNotNull() {
            addCriterion("newscontent is not null");
            return (Criteria) this;
        }

        public Criteria andNewscontentEqualTo(String value) {
            addCriterion("newscontent =", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotEqualTo(String value) {
            addCriterion("newscontent <>", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentGreaterThan(String value) {
            addCriterion("newscontent >", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentGreaterThanOrEqualTo(String value) {
            addCriterion("newscontent >=", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLessThan(String value) {
            addCriterion("newscontent <", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLessThanOrEqualTo(String value) {
            addCriterion("newscontent <=", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLike(String value) {
            addCriterion("newscontent like", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotLike(String value) {
            addCriterion("newscontent not like", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentIn(List<String> values) {
            addCriterion("newscontent in", values, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotIn(List<String> values) {
            addCriterion("newscontent not in", values, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentBetween(String value1, String value2) {
            addCriterion("newscontent between", value1, value2, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotBetween(String value1, String value2) {
            addCriterion("newscontent not between", value1, value2, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNull() {
            addCriterion("newstime is null");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNotNull() {
            addCriterion("newstime is not null");
            return (Criteria) this;
        }

        public Criteria andNewstimeEqualTo(Date value) {
            addCriterion("newstime =", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotEqualTo(Date value) {
            addCriterion("newstime <>", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThan(Date value) {
            addCriterion("newstime >", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("newstime >=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThan(Date value) {
            addCriterion("newstime <", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThanOrEqualTo(Date value) {
            addCriterion("newstime <=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeIn(List<Date> values) {
            addCriterion("newstime in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotIn(List<Date> values) {
            addCriterion("newstime not in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeBetween(Date value1, Date value2) {
            addCriterion("newstime between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotBetween(Date value1, Date value2) {
            addCriterion("newstime not between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewsstateIsNull() {
            addCriterion("newsstate is null");
            return (Criteria) this;
        }

        public Criteria andNewsstateIsNotNull() {
            addCriterion("newsstate is not null");
            return (Criteria) this;
        }

        public Criteria andNewsstateEqualTo(Integer value) {
            addCriterion("newsstate =", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateNotEqualTo(Integer value) {
            addCriterion("newsstate <>", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateGreaterThan(Integer value) {
            addCriterion("newsstate >", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsstate >=", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateLessThan(Integer value) {
            addCriterion("newsstate <", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateLessThanOrEqualTo(Integer value) {
            addCriterion("newsstate <=", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateIn(List<Integer> values) {
            addCriterion("newsstate in", values, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateNotIn(List<Integer> values) {
            addCriterion("newsstate not in", values, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateBetween(Integer value1, Integer value2) {
            addCriterion("newsstate between", value1, value2, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateNotBetween(Integer value1, Integer value2) {
            addCriterion("newsstate not between", value1, value2, "newsstate");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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