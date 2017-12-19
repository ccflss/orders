package orders.action;



import java.util.List;

import orders.dao.ProductDao;
import orders.vo.Product;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminUser  extends ActionSupport implements ModelDriven<Product>{
	//使用模型驱动接收页面的参数
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	// 注入ProductService
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	//登录的action
	public String login(){
		return ("tohome");
	}
	
	//商品跳向商品统计的页面，并查询所有的商品





	
	

}
