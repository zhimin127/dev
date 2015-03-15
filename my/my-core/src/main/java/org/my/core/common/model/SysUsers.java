package org.my.core.common.model;

import java.util.Date;

public class SysUsers {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.USER_ID
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.USERNAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.NAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.PASSWORD
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.CREATE_TIME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.LAST_LOGIN_TIME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.DEADLINE
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private Date deadline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.LOGIN_IP
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String loginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.DEPARTMENT_ID
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.DEPARTMENT_NAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String departmentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.ENABLED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.ACCOUNT_NON_EXPIRED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String accountNonExpired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.ACCOUNT_NON_LOCKED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String accountNonLocked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_users.CREDENTIALS_NON_EXPIRED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    private String credentialsNonExpired;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.USER_ID
     *
     * @return the value of sys_users.USER_ID
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.USER_ID
     *
     * @param userId the value for sys_users.USER_ID
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.USERNAME
     *
     * @return the value of sys_users.USERNAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.USERNAME
     *
     * @param username the value for sys_users.USERNAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.NAME
     *
     * @return the value of sys_users.NAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.NAME
     *
     * @param name the value for sys_users.NAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.PASSWORD
     *
     * @return the value of sys_users.PASSWORD
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.PASSWORD
     *
     * @param password the value for sys_users.PASSWORD
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.CREATE_TIME
     *
     * @return the value of sys_users.CREATE_TIME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.CREATE_TIME
     *
     * @param createTime the value for sys_users.CREATE_TIME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.LAST_LOGIN_TIME
     *
     * @return the value of sys_users.LAST_LOGIN_TIME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.LAST_LOGIN_TIME
     *
     * @param lastLoginTime the value for sys_users.LAST_LOGIN_TIME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.DEADLINE
     *
     * @return the value of sys_users.DEADLINE
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.DEADLINE
     *
     * @param deadline the value for sys_users.DEADLINE
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.LOGIN_IP
     *
     * @return the value of sys_users.LOGIN_IP
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.LOGIN_IP
     *
     * @param loginIp the value for sys_users.LOGIN_IP
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.DEPARTMENT_ID
     *
     * @return the value of sys_users.DEPARTMENT_ID
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.DEPARTMENT_ID
     *
     * @param departmentId the value for sys_users.DEPARTMENT_ID
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.DEPARTMENT_NAME
     *
     * @return the value of sys_users.DEPARTMENT_NAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.DEPARTMENT_NAME
     *
     * @param departmentName the value for sys_users.DEPARTMENT_NAME
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.ENABLED
     *
     * @return the value of sys_users.ENABLED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.ENABLED
     *
     * @param enabled the value for sys_users.ENABLED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.ACCOUNT_NON_EXPIRED
     *
     * @return the value of sys_users.ACCOUNT_NON_EXPIRED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getAccountNonExpired() {
        return accountNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.ACCOUNT_NON_EXPIRED
     *
     * @param accountNonExpired the value for sys_users.ACCOUNT_NON_EXPIRED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setAccountNonExpired(String accountNonExpired) {
        this.accountNonExpired = accountNonExpired == null ? null : accountNonExpired.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.ACCOUNT_NON_LOCKED
     *
     * @return the value of sys_users.ACCOUNT_NON_LOCKED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getAccountNonLocked() {
        return accountNonLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.ACCOUNT_NON_LOCKED
     *
     * @param accountNonLocked the value for sys_users.ACCOUNT_NON_LOCKED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setAccountNonLocked(String accountNonLocked) {
        this.accountNonLocked = accountNonLocked == null ? null : accountNonLocked.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_users.CREDENTIALS_NON_EXPIRED
     *
     * @return the value of sys_users.CREDENTIALS_NON_EXPIRED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public String getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_users.CREDENTIALS_NON_EXPIRED
     *
     * @param credentialsNonExpired the value for sys_users.CREDENTIALS_NON_EXPIRED
     *
     * @mbggenerated Sun Mar 15 13:10:43 CST 2015
     */
    public void setCredentialsNonExpired(String credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired == null ? null : credentialsNonExpired.trim();
    }
}