package test;

import java.sql.*;

public class TestConn {
 public static void main(String [] args)
 {
  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
  String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=orders";
  String userName="sa";
  String userPwd="123456";
  try
  { 
   Class.forName(driverName);
   Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
   System.out.println("�������ݿ�ɹ�");
  }
  catch(Exception e)
  {
   e.printStackTrace();
   System.out.print("����ʧ��");
  }    
 }
}