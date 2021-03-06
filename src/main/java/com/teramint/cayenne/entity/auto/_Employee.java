package com.teramint.cayenne.entity.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.teramint.cayenne.entity.Department;

/**
 * Class _Employee was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Employee extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    @Deprecated
    public static final String ADDRESS_PROPERTY = "address";
    @Deprecated
    public static final String DRIVER_LICENSE_ID_PROPERTY = "driverLicenseId";
    @Deprecated
    public static final String ID_PROPERTY = "id";
    @Deprecated
    public static final String NAME_PROPERTY = "name";
    @Deprecated
    public static final String TAXID_PROPERTY = "taxid";
    @Deprecated
    public static final String DEPARTMENT_PROPERTY = "department";

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> ADDRESS = new Property<String>("address");
    public static final Property<String> DRIVER_LICENSE_ID = new Property<String>("driverLicenseId");
    public static final Property<Integer> ID = new Property<Integer>("id");
    public static final Property<String> NAME = new Property<String>("name");
    public static final Property<String> TAXID = new Property<String>("taxid");
    public static final Property<Department> DEPARTMENT = new Property<Department>("department");

    public void setAddress(String address) {
        writeProperty("address", address);
    }
    public String getAddress() {
        return (String)readProperty("address");
    }

    public void setDriverLicenseId(String driverLicenseId) {
        writeProperty("driverLicenseId", driverLicenseId);
    }
    public String getDriverLicenseId() {
        return (String)readProperty("driverLicenseId");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setTaxid(String taxid) {
        writeProperty("taxid", taxid);
    }
    public String getTaxid() {
        return (String)readProperty("taxid");
    }

    public void setDepartment(Department department) {
        setToOneTarget("department", department, true);
    }

    public Department getDepartment() {
        return (Department)readProperty("department");
    }


}
