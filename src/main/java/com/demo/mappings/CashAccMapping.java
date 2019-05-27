package com.demo.mappings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CashAccMapping {
	
	@Id	
	
	private String cptyShortName;
private Long systemType;

private String cptyName;



public Long getSystemType() {
	return systemType;
}
public void setSystemType(Long systemType) {
	this.systemType = systemType;
}
public String getCptyName() {
	return cptyName;
}
public void setCptyName(String cptyName) {
	this.cptyName = cptyName;
}
public String getCptyShortName() {
	return cptyShortName;
}
public void setCptyShortName(String cptyShortName) {
	this.cptyShortName = cptyShortName;
}

}
