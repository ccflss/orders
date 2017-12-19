package orders.vo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Product {
	
		private int pid;
		private String pname;
		private String pprice;
		private String pnum;
		private String pdate;
		private String pfrom;
		//两个多对多的关系
		private Set<Supplier> supplier=new HashSet<Supplier>();
		private Set<Warehouse> warehouse=new HashSet<Warehouse>();
		
		
		
		public Set<Supplier> getSupplier() {
			return supplier;
		}
		public void setSupplier(Set<Supplier> supplier) {
			this.supplier = supplier;
		}
		public Set<Warehouse> getWarehouse() {
			return warehouse;
		}
		public void setWarehouse(Set<Warehouse> warehouse) {
			this.warehouse = warehouse;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getPprice() {
			return pprice;
		}
		public void setPprice(String pprice) {
			this.pprice = pprice;
		}
		public String getPnum() {
			return pnum;
		}
		public void setPnum(String pnum) {
			this.pnum = pnum;
		}
	
		public String getPdate() {
			return pdate;
		}
		public void setPdate(String pdate) {
			this.pdate = pdate;
		}
		public String getPfrom() {
			return pfrom;
		}
		public void setPfrom(String pfrom) {
			this.pfrom = pfrom;
		}
		

}
