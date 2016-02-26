package com.teramint.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.teramint.cayenne.CayenneService;
import com.teramint.cayenne.entity.LevelInfo;

/**
 * 
 * @author mramos
 *
 */
@Entity(name="Department")
public class Department {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String deptName;
	private int levelId;
	private String groupDeptName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getLevelId() {
		return levelId;
	}
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	public String getGroupDeptName() {
		return groupDeptName;
	}
	public void setGroupDeptName(String groupDeptName) {
		this.groupDeptName = groupDeptName;
	}
	
	
	public LevelInfo levelInfo(int id){
		return CayenneService.instance().levelInfo(id);
	}
	
}
