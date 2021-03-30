package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Equipment")
public class Equipment {
@Id
private int eid;
private String ename;
private String model;
private String info;
public Equipment(int eid, String ename, String model, String info) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.model = model;
	this.info = info;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
@Override
public String toString() {
	return "Equipment [eid=" + eid + ", ename=" + ename + ", model=" + model + ", info=" + info + "]";
}

}
