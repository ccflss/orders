package test;

public class JsonAction  {
	private String name;
	private String cname;
	


public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


public String execute(){
	
	System.out.println(name);
	cname="ddd";
	System.out.println(cname);
	return "jsontest";
	
	
	
	
	
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}
}
