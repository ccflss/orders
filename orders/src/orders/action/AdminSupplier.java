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
	//��ѯ���е�supplier��������ת����Ӧ��ҳ��
	public String findAllSupplier(){
		
		List<Supplier> supplierlist= supplierDao.findallsupplier();
		if(supplierlist!=null){
			//�鵽���ݷ���ֵվ
			ValueStack stack=ActionContext.getContext().getValueStack();
			stack.set("supplierlist",supplierlist);
		}

		return "supplierList";
	}
	//��ӹ�Ӧ��
	public String addSupplier(){
		supplierDao.addsupplier(supplier);
		return "addsupplier";
	}
	//����idɾ����Ӧ��
	public String delectById(){
	//�Ȳ�ѯ������û���Ȼ���ڽ���ɾ��
	Supplier su=supplierDao.findbysupplierid(supplier.getSid());
	supplierDao.deletebyid(su);
	return "deleteok";
		
		
		
		
	}
	
	
}
