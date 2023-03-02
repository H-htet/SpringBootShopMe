package studentregistration.persistant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import studentregistration.persistant.dto.UserRequestDTO;
import studentregistration.persistant.dto.UserResponseDTO;

@Service("userDAO")
public class UserDAO {
	public static Connection con=null;
	static {
		con=MyConnection.getConnection();
	}
	
	public int insertData(UserRequestDTO dto) {
		int result=0;
		String sql="insert into user(id,name,password) "
				+ "values(?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, dto.getUserId());
			ps.setString(2, dto.getUserName());
			ps.setString(3, dto.getUserPassword());
			result=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Database error");
		}
		return result;
	}
	
	//public UserResponseDTO selectOne(UserRequestDTO dto) {
	public ArrayList<UserResponseDTO> validateUser(UserRequestDTO dto) {
		ArrayList<UserResponseDTO> list=new ArrayList();
//		String sql="select * from user where id='"+dto.getUserId()+"' and password='"+dto.getUserPassword()
//		+"'";
		
		String sql="select * from user where id=? and password=?";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, dto.getUserId());
			ps.setString(2, dto.getUserPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				UserResponseDTO res=new UserResponseDTO();
				res.setUserId(rs.getString("id"));
				res.setUserName(rs.getString("name"));
				res.setUserPassword(rs.getString("password"));
				System.out.println("Response Successful UserID: "+res.getUserId()+"Password: "+res.getUserPassword());
				list.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public ArrayList<UserResponseDTO> selectALL() {
		ArrayList<UserResponseDTO> list=new ArrayList();
		String sql="select * from user";
		try {
			PreparedStatement ps=con.prepareStatement(sql);			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				UserResponseDTO res=new UserResponseDTO();
				res.setUserId(rs.getString("id"));
				res.setUserName(rs.getString("name"));
				res.setUserPassword(rs.getString("password"));
				list.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;		
	}
	
	public ArrayList<UserResponseDTO> userSearch(UserRequestDTO dto) {
		ArrayList<UserResponseDTO> list=new ArrayList();
		String sql="select * from user where ('"+dto.getUserId()+"' is null or id= '"+dto.getUserId()+"') and ('"+dto.getUserName()+"' is null or name='"+dto.getUserName()+"' ) ";		  
		try {
			PreparedStatement ps=con.prepareStatement(sql);	
//			ps.setString(1, dto.getUserId());
//			ps.setString(2, dto.getUserId());
//			ps.setString(3, dto.getUserName());
//			ps.setString(4, dto.getUserName());		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				UserResponseDTO res=new UserResponseDTO();
				res.setUserId(rs.getString("id"));
				res.setUserName(rs.getString("name"));	
				System.out.println("Response Successful UserID: "+res.getUserId()+"User Name: "+res.getUserName());
				list.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;		
	}
}
