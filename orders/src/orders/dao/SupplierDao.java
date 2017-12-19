package orders.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import orders.vo.Staff;
import orders.vo.Supplier;

public class SupplierDao extends HibernateDaoSupport{
	//数据库查询所有的集合
	public List<Supplier> findallsupplier() {
		String hql="from Supplier";
	    List<Supplier> slist=	this.getHibernateTemplate().find(hql);
	       if (slist != null && slist.size() > 0) {
			return slist;
		}
		
		
		return null;
		
		
		
		
		
	
	}
	//将页面的数据写入到数据库add
	public void addsupplier(Supplier supplier) {
		this.getHibernateTemplate().save(supplier);
	}
	
	//根据id查询用户
	public Supplier findbysupplierid(int sid) {
		return this.getHibernateTemplate().get(Supplier.class, sid);
	}
	//删除用户者个对象
	public void deletebyid(Supplier supplier) {
		this.getHibernateTemplate().delete(supplier);
		
	}

}
