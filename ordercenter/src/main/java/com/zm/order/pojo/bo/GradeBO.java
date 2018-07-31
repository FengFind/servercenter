package com.zm.order.pojo.bo;

import java.util.List;

public class GradeBO implements Comparable<GradeBO>{

	private Integer id;
	private Integer parentId;
	private Integer gradeType;
	private List<GradeBO> children;
	public List<GradeBO> getChildren() {
		return children;
	}
	public void setChildren(List<GradeBO> children) {
		this.children = children;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getGradeType() {
		return gradeType;
	}
	public void setGradeType(Integer gradeType) {
		this.gradeType = gradeType;
	}
	@Override
	public int compareTo(GradeBO o) {
		if(id > o.getId()){
			return 1;
		}
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GradeBO other = (GradeBO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GradeBO [id=" + id + ", parentId=" + parentId + ", gradeType=" + gradeType + "]";
	}
	
}
