package orders.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import orders.vo.Staff;
import orders.vo.Supplier;

public class SupplierDao extends HibernateDaoSupport{
	//���ݿ��ѯ���еļ���
	public List<Supplier> findallsupplier() {
		String hql="from Supplier";
	    List<Supplier> slist=	this.getHibernateTemplate().find(hql);
	       if (slist != null && slist.size() > 0) {
			return slist;
		}
		
		
		return null;
		
		
		
		
		
	
	}
	//��ҳ�������д�뵽���ݿ�add
	public void addsupplier(Supplier supplier) {
		this.getHibernateTemplate().save(supplier);
	}
	
	//����id��ѯ�û�
	public Supplier findbysupplierid(int sid) {
		return this.getHibernateTemplate().get(Supplier.class, sid);
	}
	//ɾ���û��߸�����
	public void deletebyid(Supplier supplier) {
		this.getHibernateTemplate().delete(supplier);
		
	}

}
