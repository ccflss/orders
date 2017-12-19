package orders.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import orders.vo.Staff;

public class StaffDao extends HibernateDaoSupport {
     
	public List<Staff> findallstaff() {
		String hql = "from Staff ";
		List<Staff> list = this.getHibernateTemplate().find(hql);
		if (list != null && list.size() > 0) {
			return list;
		
	}
		return null;
}
	//写入导数据库的方法
	public void addstaff(Staff staff) {
		this.getHibernateTemplate().save(staff);
		
	}
	//在数据库中都删除员工记录
	public void deletebyid(Staff staff) {
		this.getHibernateTemplate().delete(staff);
		
	}
	//根据id查询相关的staff用户
	public Staff findbystaffid(int s_id) {
		return this.getHibernateTemplate().get(Staff.class, s_id);
	}
	//后台更新数据库的方法
	public void updatestaff(Staff staff) {
		this.getHibernateTemplate().update(staff);
	}
}