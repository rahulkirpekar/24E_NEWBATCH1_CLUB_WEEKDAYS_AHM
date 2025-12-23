package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

// StudentDao ----Student Table
public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";

		System.out.println("insertQuery : " + insertQuery);
		
		Statement stmt = null;
		
		// 2. get DB Connection Object
		Connection conn = DBConnection.getConnection();

		int rowsAffected = 0;
		
		// 3. validate conn object
		if (conn != null)
		{
			try 
			{
				// 4. create Statement object
				stmt = conn.createStatement();
			
				// 5. execute query
				rowsAffected = stmt.executeUpdate(insertQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao--InsertStudent()---Db not connected");
		}
		return rowsAffected;
	}
	public void updateStudent() 
	{

	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE from student WHERE rno = "+rno;
		
		System.out.println("deleteQuery : "  + deleteQuery);
		
		int rowsAffected = 0;
		Statement stmt = null;
		
		// 1. get DB Connection object
		Connection conn = DBConnection.getConnection();
		
		// 2. validate connection object
		if (conn != null) 
		{
			try 
			{
				// 3. create statement object
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---deleteStudent() Db not connected");
		}
		return rowsAffected;
	}
	public void getAllRecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno which you want to delete Student record : ");
		int rno = sc.nextInt();

		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}

		
		
/*		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/	}
}
