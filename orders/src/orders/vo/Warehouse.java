package orders.vo;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
	private int wid;
	private String wname;
	private String wnum;
	private String waddr;
	private String wsize;
	//多对一的关系的体现 ，一方是staff
	private Staff staff;
	//多对多的关系
	private Set<Product> product=new HashSet<Product>();
	
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWnum() {
		return wnum;
	}
	public void setWnum(String wnum) {
		this.wnum = wnum;
	}
	public String getWaddr() {
		return waddr;
	}
	public void setWaddr(String waddr) {
		this.waddr = waddr;
	}
	public String getWsize() {
		return wsize;
	}
	public void setWsize(String wsize) {
		this.wsize = wsize;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
}
