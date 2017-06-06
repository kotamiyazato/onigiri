/**
 *
 */
package decision.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;

import decision.dto.DecisionDTO;

/**
 *
 * @author KOTA MIYAZATO
 *
 */

public class DecisionDAO {


	/**
	 * 決裁手続きの情報をリスト化
	 *
	 */
	private ArrayList<DecisionDTO> DecisionList = new  ArrayList<DecisionDTO>();





	/**
	 * ユーザーIDで情報を引き出すメソッド
	 * @param userId
	 * @return Decision
	 */
	public ArrayList<DecisionDTO> select(int userId){

	DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
	Connection conn = (Connection) db.getConnection();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

	String sql = "select * from decision inner join users on decision.user_id = users."
			+ "user_id inner join projects on decision.project_id = projects.project_id";

	try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			DecisionDTO dto = new DecisionDTO();
			dto.setRegistration(sdf.format( rs.getDate("registration") ).toString());
			dto.setUserId(rs.getInt("user_id"));



			dto.setDecisionName(rs.getString("decision_name"));

			dto.setIDraftingId(rs.getString("i_drafting_id"));
			dto.setIApprovalId(rs.getString("i_approval_id"));
			dto.setADraftingId(rs.getString("a_drafting_id"));
			dto.setCdId(rs.getString("cd_id"));
			dto.setIADId(rs.getString("i_a_d_id"));
			dto.setIAId(rs.getString("i_a_id"));
			dto.setHead(rs.getString("head"));



			DecisionList.add(dto);

		}
	}catch (SQLException e) {
		e.printStackTrace();
	}finally{
		try{
			conn.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	return DecisionList;
}












































}