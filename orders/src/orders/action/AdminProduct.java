package orders.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import orders.dao.ProductDao;
import orders.vo.Product;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class AdminProduct extends ActionSupport implements ModelDriven<Product> {
	Product product =new Product();
	private ProductDao productDao;
	private String pname;
	private JSONArray jsonArray;
	

	public JSONArray getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Product getModel() {
		
		return product;
	}

	public String findAllProduct() {
		List<Product> productlist= productDao.findallstaff();
		//查到了，那就显示给页面	
		if (productlist!=null){
				ValueStack stack= ActionContext.getContext().getValueStack();
				stack.set("productlist",productlist);
			}
	
	return "productList";
}
	//根据商品名称查询，商品的数量
	public String findByProductName(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String pname = request.getParameter("pname");
		System.out.println(pname);
		List<Product> querylist= productDao.findbyproductname(pname);
		jsonArray = JSONArray.fromObject(querylist); 
		
	    System.out.println(jsonArray);
		return "querylist";
	
		
		
	}
	
}
