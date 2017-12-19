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
	//д�뵼���ݿ�ķ���
	public void addstaff(Staff staff) {
		this.getHibernateTemplate().save(staff);
		
	}
	//�����ݿ��ж�ɾ��Ա����¼
	public void deletebyid(Staff staff) {
		this.getHibernateTemplate().delete(staff);
		
	}
	//����id��ѯ��ص�staff�û�
	public Staff findbystaffid(int s_id) {
		return this.getHibernateTemplate().get(Staff.class, s_id);
	}
	//��̨�������ݿ�ķ���
	public void updatestaff(Staff staff) {
		this.getHibernateTemplate().update(staff);
	}
}