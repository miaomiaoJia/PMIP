package cn.hhu.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andStudentnameIsNull() {
            addCriterion("studentname is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentname is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentname =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentname <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentname >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentname >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentname <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentname <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentname like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentname not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentname in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentname not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentname between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentname not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIsNull() {
            addCriterion("studentnumber is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIsNotNull() {
            addCriterion("studentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumberEqualTo(String value) {
            addCriterion("studentnumber =", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotEqualTo(String value) {
            addCriterion("studentnumber <>", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberGreaterThan(String value) {
            addCriterion("studentnumber >", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("studentnumber >=", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLessThan(String value) {
            addCriterion("studentnumber <", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLessThanOrEqualTo(String value) {
            addCriterion("studentnumber <=", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLike(String value) {
            addCriterion("studentnumber like", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotLike(String value) {
            addCriterion("studentnumber not like", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIn(List<String> values) {
            addCriterion("studentnumber in", values, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotIn(List<String> values) {
            addCriterion("studentnumber not in", values, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberBetween(String value1, String value2) {
            addCriterion("studentnumber between", value1, value2, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotBetween(String value1, String value2) {
            addCriterion("studentnumber not between", value1, value2, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStudentclassIsNull() {
            addCriterion("studentclass is null");
            return (Criteria) this;
        }

        public Criteria andStudentclassIsNotNull() {
            addCriterion("studentclass is not null");
            return (Criteria) this;
        }

        public Criteria andStudentclassEqualTo(String value) {
            addCriterion("studentclass =", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotEqualTo(String value) {
            addCriterion("studentclass <>", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassGreaterThan(String value) {
            addCriterion("studentclass >", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassGreaterThanOrEqualTo(String value) {
            addCriterion("studentclass >=", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassLessThan(String value) {
            addCriterion("studentclass <", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassLessThanOrEqualTo(String value) {
            addCriterion("studentclass <=", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassLike(String value) {
            addCriterion("studentclass like", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotLike(String value) {
            addCriterion("studentclass not like", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassIn(List<String> values) {
            addCriterion("studentclass in", values, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotIn(List<String> values) {
            addCriterion("studentclass not in", values, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassBetween(String value1, String value2) {
            addCriterion("studentclass between", value1, value2, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotBetween(String value1, String value2) {
            addCriterion("studentclass not between", value1, value2, "studentclass");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeIsNull() {
            addCriterion("indirectingtime is null");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeIsNotNull() {
            addCriterion("indirectingtime is not null");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("indirectingtime =", value, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("indirectingtime <>", value, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("indirectingtime >", value, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("indirectingtime >=", value, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeLessThan(Date value) {
            addCriterionForJDBCDate("indirectingtime <", value, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("indirectingtime <=", value, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("indirectingtime in", values, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("indirectingtime not in", values, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("indirectingtime between", value1, value2, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andIndirectingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("indirectingtime not between", value1, value2, "indirectingtime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeIsNull() {
            addCriterion("activisttime is null");
            return (Criteria) this;
        }

        public Criteria andActivisttimeIsNotNull() {
            addCriterion("activisttime is not null");
            return (Criteria) this;
        }

        public Criteria andActivisttimeEqualTo(Date value) {
            addCriterionForJDBCDate("activisttime =", value, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("activisttime <>", value, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("activisttime >", value, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activisttime >=", value, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeLessThan(Date value) {
            addCriterionForJDBCDate("activisttime <", value, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activisttime <=", value, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeIn(List<Date> values) {
            addCriterionForJDBCDate("activisttime in", values, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("activisttime not in", values, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activisttime between", value1, value2, "activisttime");
            return (Criteria) this;
        }

        public Criteria andActivisttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activisttime not between", value1, value2, "activisttime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeIsNull() {
            addCriterion("developementtime is null");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeIsNotNull() {
            addCriterion("developementtime is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeEqualTo(Date value) {
            addCriterionForJDBCDate("developementtime =", value, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("developementtime <>", value, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("developementtime >", value, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("developementtime >=", value, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeLessThan(Date value) {
            addCriterionForJDBCDate("developementtime <", value, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("developementtime <=", value, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeIn(List<Date> values) {
            addCriterionForJDBCDate("developementtime in", values, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("developementtime not in", values, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("developementtime between", value1, value2, "developementtime");
            return (Criteria) this;
        }

        public Criteria andDevelopementtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("developementtime not between", value1, value2, "developementtime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeIsNull() {
            addCriterion("probationarytime is null");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeIsNotNull() {
            addCriterion("probationarytime is not null");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeEqualTo(Date value) {
            addCriterionForJDBCDate("probationarytime =", value, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("probationarytime <>", value, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("probationarytime >", value, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("probationarytime >=", value, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeLessThan(Date value) {
            addCriterionForJDBCDate("probationarytime <", value, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("probationarytime <=", value, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeIn(List<Date> values) {
            addCriterionForJDBCDate("probationarytime in", values, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("probationarytime not in", values, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("probationarytime between", value1, value2, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andProbationarytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("probationarytime not between", value1, value2, "probationarytime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeIsNull() {
            addCriterion("fullmembertime is null");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeIsNotNull() {
            addCriterion("fullmembertime is not null");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeEqualTo(Date value) {
            addCriterionForJDBCDate("fullmembertime =", value, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fullmembertime <>", value, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fullmembertime >", value, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fullmembertime >=", value, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeLessThan(Date value) {
            addCriterionForJDBCDate("fullmembertime <", value, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fullmembertime <=", value, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeIn(List<Date> values) {
            addCriterionForJDBCDate("fullmembertime in", values, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fullmembertime not in", values, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fullmembertime between", value1, value2, "fullmembertime");
            return (Criteria) this;
        }

        public Criteria andFullmembertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fullmembertime not between", value1, value2, "fullmembertime");
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