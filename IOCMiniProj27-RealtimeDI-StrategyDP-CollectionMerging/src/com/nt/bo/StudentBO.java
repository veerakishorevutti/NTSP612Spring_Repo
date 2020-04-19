package com.nt.bo;

public class StudentBO {                   //This class holds persistable data(to be inserted to db table as record) or persistent data(collected from DB table record)
                                                                  //It will be taken on 1 per DB table basis
	private String sname;
	private String sadd;
	private int total;
	private float avg;
	private String result;
 	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
