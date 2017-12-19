package orders.action;

import java.util.List;

import orders.dao.SupplierDao;
import orders.vo.Staff;
import orders.vo.Supplier;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class AdminSupplier extends ActionSupport implements ModelDriven<Supplier> {
		Supplier supplier =new Supplier();
		private SupplierDao supplierDao;
			
	public SupplierDao getSupplierDao() {
			return supplierDao;
		}
		public void setSupplierDao(SupplierDao supplierDao) {
			this.supplierDao = supplierDao;
		}
	@Override
	public Supplier getModel() {
	
		return supplier;
	}
	//查询所有的supplier，并且跳转到相应的页面
	public String findAllSupplier(){
		
		List<Supplier> supplierlist= supplierDao.findallsupplier();
		if(supplierlist!=null){
			//查到数据放入值站
			ValueStack stack=ActionContext.getContext().getValueStack();
			stack.set("supplierlist",supplierlist);
		}

		return "supplierList";
	}
	//添加供应商
	public String addSupplier(){
		supplierDao.addsupplier(supplier);
		return "addsupplier";
	}
	//根据id删除供应商
	public String delectById(){
	//先查询到这个用户，然后在进行删除
	Supplier su=supplierDao.findbysupplierid(supplier.getSid());
	supplierDao.deletebyid(su);
	return "deleteok";
		
		
		
		
	}
	
	
}
