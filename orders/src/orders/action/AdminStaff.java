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
	//注入dao，配置文件里面也要注入
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
	//显示所有的staff
	public String findAllStaff(){
	//查询所有
	List<Staff> stafflist= staffDao.findallstaff();
	//查到了，那就显示给页面	
	if (stafflist!=null){
			ValueStack stack= ActionContext.getContext().getValueStack();
			stack.set("stafflist",stafflist);
		}else{
				
		}
		return "staffinfo";
	}
	//添加员工信息，调用写入数据库的方法
	public String addStaff(){
		staffDao.addstaff(staff);
		
		return "updatestaffok";
			
	}
	//根据id删除员工
	public String deletcById(){
		//根据前台的id查询出staff的对象st  然后删除st这条记录
	    Staff st=staffDao.findbystaffid(staff.getS_id());
		staffDao.deletebyid(st);
		return "deleteok";
			
	}
	//更新数据库的方法
	public String updateStaff(){
		staffDao.updatestaff(staff);
		return "updateok";
		
		
	}

	
}
