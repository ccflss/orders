package orders.action;

import java.util.List;

import orders.dao.StaffDao;
import orders.vo.Staff;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;



public class AdminStaff extends ActionSupport implements ModelDriven<Staff>{
	Staff staff=new Staff();
	//ע��dao�������ļ�����ҲҪע��
	private StaffDao staffDao;
	
	public StaffDao getStaffDao() {
		return staffDao;
	}
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	@Override
	public Staff getModel() {
		// TODO Auto-generated method stub
		return staff;
	}
	//��ʾ���е�staff
	public String findAllStaff(){
	//��ѯ����
	List<Staff> stafflist= staffDao.findallstaff();
	//�鵽�ˣ��Ǿ���ʾ��ҳ��	
	if (stafflist!=null){
			ValueStack stack= ActionContext.getContext().getValueStack();
			stack.set("stafflist",stafflist);
		}else{
				
		}
		return "staffinfo";
	}
	//���Ա����Ϣ������д�����ݿ�ķ���
	public String addStaff(){
		staffDao.addstaff(staff);
		
		return "updatestaffok";
			
	}
	//����idɾ��Ա��
	public String deletcById(){
		//����ǰ̨��id��ѯ��staff�Ķ���st  Ȼ��ɾ��st������¼
	    Staff st=staffDao.findbystaffid(staff.getS_id());
		staffDao.deletebyid(st);
		return "deleteok";
			
	}
	//�������ݿ�ķ���
	public String updateStaff(){
		staffDao.updatestaff(staff);
		return "updateok";
		
		
	}

	
}
