package org.my.core.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.my.core.common.model.SysRoles;
import org.my.core.common.model.SysRolesExample;

public interface SysRolesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int countByExample(SysRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int deleteByExample(SysRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int insert(SysRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int insertSelective(SysRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    List<SysRoles> selectByExample(SysRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    SysRoles selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int updateByExampleSelective(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int updateByExample(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int updateByPrimaryKeySelective(SysRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles
     *
     * @mbggenerated Fri Mar 20 13:12:41 CST 2015
     */
    int updateByPrimaryKey(SysRoles record);
}