package orders.action;



import java.util.List;

import orders.dao.ProductDao;
import orders.vo.Product;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminUser  extends ActionSupport implements ModelDriven<Product>{
	//ʹ��ģ����������ҳ��Ĳ���
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	// ע��ProductService
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	//��¼��action
	public String login(){
		return ("tohome");
	}
	
	//��Ʒ������Ʒͳ�Ƶ�ҳ�棬����ѯ���е���Ʒ





	
	

}
