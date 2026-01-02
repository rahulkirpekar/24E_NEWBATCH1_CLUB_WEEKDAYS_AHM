package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDaoPrep 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES(?,?,?)";

		System.out.println("insertQuery : " + insertQuery);
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---insertStudent() Db not connected");
		}
		return rowsAffected;
	}
	
	public int deleteStudentbyId(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = ?";
		
		System.out.println("deleteQuery : " + deleteQuery);
		
		Connection conn = DBConnection.getConnection();
		int rowsAffected = 0;
		PreparedStatement pstmt = null;
		if (conn!=null) 
		{
			try 
			{
				pstmt =  conn.prepareStatement(deleteQuery);
				
				pstmt.setInt(1, rno);
			
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("Db not connected : " + rowsAffected);
		}
		return rowsAffected;
	}
	
	public ArrayList<StudentBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM student";
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		StudentBean s = null;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
			
				rs = pstmt.executeQuery();// ResultSet---MultipleRows
				
				while(rs.next()) 
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
					
					s = new StudentBean(rno, name, std, marks);
					list.add(s);
				}
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---getAllRecords()--Db not connected");
		}
		return list;
	}
	
	public static void main(String[] args) 
	{
		StudentDaoPrep dao = new StudentDaoPrep();

		ArrayList<StudentBean> list = dao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = 	list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
/*		
		Scanner sc = new Scanner(System.in);
		
		StudentDaoPrep dao =   new StudentDaoPrep();
		
		System.out.println("Enter Student Id Which you want to Delete : ");
		int rno = sc.nextInt();
		
		int rowsAffected = dao.deleteStudentbyId(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
//		-----------INSERT Student------------
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/
	}
}
