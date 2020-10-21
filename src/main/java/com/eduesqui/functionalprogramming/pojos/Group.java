package com.eduesqui.functionalprogramming.pojos;

import java.util.List;

public class Group {
	
	private String groupName;
	private List<Student> students;
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + students.toString() + "]";
	}
	
	
	

}
