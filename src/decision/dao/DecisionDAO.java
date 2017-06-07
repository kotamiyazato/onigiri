/**
 *
 */
package decision.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	private ArrayList<DecisionDTO> decisionList = new  ArrayList<DecisionDTO>();





	/**
	 * ユーザーIDで情報を引き出すメソッド
	 * @param userId
	 * @return Decision
	 */
	public ArrayList<DecisionDTO> select(){

	DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","decision","root","mysql");
	Connection con = (Connection) db.getConnection();



	String sql = "select * from decision";



	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			DecisionDTO dto = new DecisionDTO();



			dto.setUserId(rs.getInt("user_id"));                //ユーザーID

			dto.setDecisionName(rs.getString("decision_name")); //案件名

			dto.setIDraftingId(rs.getString("i_drafting_id")); //実施起案番号

			dto.setIApprovalId(rs.getString("i_approval_id")); //実施決裁番号

			dto.setADraftingId(rs.getString("a_drafting_id")); //契約起案番号

			dto.setCdId(rs.getString("cd_id"));                //契約決裁番号

			dto.setIADId(rs.getString("i_a_d_id"));            //実施兼契約起案番号

			dto.setIAId(rs.getString("i_a_id"));               //実施兼契約番号

			dto.setHead(rs.getString("head"));                 //頭紙文章

			dto.setSummary(rs.getString("summary"));           //概要

			dto.setCause(rs.getString("cause"));               //理由・目的

			dto.setStartDay(rs.getString("start_day"));        //開始日

			dto.setEndDay(rs.getString("end_day"));            //終了日

			dto.setAmountAll(rs.getInt("amount_all"));         //合計金額

			dto.setBenefit(rs.getInt("benefit"));              //損益費用

			dto.setBildCost(rs.getInt("bild_cost"));           //建設費用




			decisionList.add(dto);

		}
	}catch (SQLException e) {
		e.printStackTrace();
	}finally{
		try{
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	return decisionList;
}












































}