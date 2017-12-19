package orders.vo;

import java.util.HashSet;
import java.util.Set;

public class Staff {
	private int s_id;
	private String s_name;
	private String s_phone;
	private String s_job;
	private String s_leavetime;
	private String s_cometime;
	private String s_power;
	//一对多的关系的体现对于supplier实体类
	private Set<Supplier> supplier=new HashSet<Supplier>();
	//一对多相对于warehouse实体类
	private Set<Warehouse> warehouse=new HashSet<Warehouse>();
	
	public Set<Warehouse> getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Set<Warehouse> warehouse) {
		this.warehouse = warehouse;
	}
	public Set<Supplier> getSupplier() {
		return supplier;
	}
	public void setSupplier(Set<Supplier> supplier) {
		this.supplier = supplier;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public String getS_job() {
		return s_job;
	}
	public void setS_job(String s_job) {
		this.s_job = s_job;
	}
	public String getS_leavetime() {
		return s_leavetime;
	}
	public void setS_leavetime(String s_leavetime) {
		this.s_leavetime = s_leavetime;
	}
	public String getS_cometime() {
		return s_cometime;
	}
	public void setS_cometime(String s_cometime) {
		this.s_cometime = s_cometime;
	}
	public String getS_power() {
		return s_power;
	}
	public void setS_power(String s_power) {
		this.s_power = s_power;
	}
	
	
}
