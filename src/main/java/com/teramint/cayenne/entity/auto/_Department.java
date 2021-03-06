package com.teramint.cayenne.entity.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.teramint.cayenne.entity.Employee;

/**
 * Class _Department was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Department extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    @Deprecated
    public static final String DEPT_NAME_PROPERTY = "deptName";
    @Deprecated
    public static final String GROUP_DEPT_NAME_PROPERTY = "groupDeptName";
    @Deprecated
    public static final String ID_PROPERTY = "id";
    @Deprecated
    public static final String LEVEL_ID_PROPERTY = "levelId";
    @Deprecated
    public static final String EMP_DEPARTMENT_PROPERTY = "empDepartment";

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> DEPT_NAME = new Property<String>("deptName");
    public static final Property<String> GROUP_DEPT_NAME = new Property<String>("groupDeptName");
    public static final Property<Integer> ID = new Property<Integer>("id");
    public static final Property<Integer> LEVEL_ID = new Property<Integer>("levelId");
    public static final Property<List<Employee>> EMP_DEPARTMENT = new Property<List<Employee>>("empDepartment");

    public void setDeptName(String deptName) {
        writeProperty("deptName", deptName);
    }
    public String getDeptName() {
        return (String)readProperty("deptName");
    }

    public void setGroupDeptName(String groupDeptName) {
        writeProperty("groupDeptName", groupDeptName);
    }
    public String getGroupDeptName() {
        return (String)readProperty("groupDeptName");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setLevelId(Integer levelId) {
        writeProperty("levelId", levelId);
    }
    public Integer getLevelId() {
        return (Integer)readProperty("levelId");
    }

    public void addToEmpDepartment(Employee obj) {
        addToManyTarget("empDepartment", obj, true);
    }
    public void removeFromEmpDepartment(Employee obj) {
        removeToManyTarget("empDepartment", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Employee> getEmpDepartment() {
        return (List<Employee>)readProperty("empDepartment");
    }


}
