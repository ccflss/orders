package orders.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;




import orders.vo.Product;
import orders.vo.Staff;

public class ProductDao extends HibernateDaoSupport{

	//查询所有的商品
	public List<Product> findallstaff() {
		String hql = "from Product ";
		List<Product> list = this.getHibernateTemplate().find(hql);
		if (list != null && list.size() > 0) {
			return list;
		
	}
		return null;
}
	//根据用户名去查

	public List<Product> findbyproductname(String pname) {
		
		return this.getHibernateTemplate().find("from Product p where p.pname like'%"+pname+"%' "); 
	}

}