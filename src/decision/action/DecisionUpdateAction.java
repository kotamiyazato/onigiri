/**
 *
 */
package decision.action;

import java.util.ArrayList;
import java.util.Map;
import java.util.UnknownFormatConversionException;

import com.opensymphony.xwork2.ActionSupport;

import decision.dao.DecisionDAO;
import decision.dto.DecisionDTO;

/**
 * @author KOTA MIYAZATO
 *
 */
public class DecisionUpdateAction extends ActionSupport{





	/**
	 * ユーザーID
	 *
	 */
	private int userId;

	/**
	 * 案件名
	 *
	 */
	private String decisionName;

	/**
	 * 実施起案番号
	 *
	 */
	private String iDraftingId;
	/**
	 * 実施決裁番号
	 *
	 */
	private String iApprovalId;
	/**
	 * 契約起案番号
	 *
	 */
	private String aDraftingId;
	/**
	 * 契約決裁番号
	 *
	 */
	private String cdId;
	/**
	 * 実施兼契約起案番号
	 *
	 */
	private String iADId;
	/**
	 * 実施兼契約番号
	 *
	 */

	private String iAId;

	/**
	 * 承認番号
	 */
	private String adminNum;

	/**
	 * 理由・目的
	 */
	public String cause;


	/**
	 * @return cause
	 */
	public String getCause() {
		return cause;
	}




	/**
	 * @param cause セットする cause
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}



	/**
	 * @return summary
	 */
	public String getSummary() {
		return summary;
	}


	/**
	 * @param summary セットする summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}


	/**
	 * @return startDay
	 */
	public String getStartDay() {
		return startDay;
	}

	/**
	 * @param startDay セットする startDay
	 */
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}


	/**
	 * @return endDay
	 */
	public String getEndDay() {
		return endDay;
	}



	/**
	 * @param endDay セットする endDay
	 */
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	/**
	 * 	頭紙文章
	 */
	private String head;

	/**
	 * 建設費用
	 */
	private Float bildCost;

	/**
	 * 損益費用
	 */
	private Float benefit;

	/**
	 * 合計金額
	 */
	private Float amountAll;

	/**
	 * 概要
	 */
	public String summary;

	/**
	 * 開始日
	 */
	public String startDay;

	/**
	 * 終了日
	 */
	public String endDay;



	/*
	 * decisionList コレクションクラスのオブジェクト宣言
	 * @author kota.miyazato
     * @since 2017/06/07
     * @version 1.0
     */

	/**
	 * 決裁手続きの情報をリスト化
	 */
	private ArrayList<DecisionDTO> decisionList = new  ArrayList<DecisionDTO>();

	/**
	 * セッション情報
	 */
	private Map<String,Object> session;



	/**
     * 決裁手続きの情報をリストを更新する
     * @author kota.miyazato
     * @since 2017/06/07
     * @version 1.0
     */

	public String execute(){
		String result = ERROR;
		DecisionDAO dao = new DecisionDAO();
		try {
		decisionList=dao.select();
		} catch (UnknownFormatConversionException e) {
		e.printStackTrace();
		}

		result=SUCCESS;
		return result;
		}




	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return decisionName
	 */
	public String getDecisionName() {
		return decisionName;
	}

	/**
	 * @param decisionName セットする decisionName
	 */
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}

	/**
	 * @return iDraftingId
	 */
	public String getiDraftingId() {
		return iDraftingId;
	}

	/**
	 * @param iDraftingId セットする iDraftingId
	 */
	public void setiDraftingId(String iDraftingId) {
		this.iDraftingId = iDraftingId;
	}

	/**
	 * @return iApprovalId
	 */
	public String getiApprovalId() {
		return iApprovalId;
	}

	/**
	 * @param iApprovalId セットする iApprovalId
	 */
	public void setiApprovalId(String iApprovalId) {
		this.iApprovalId = iApprovalId;
	}

	/**
	 * @return aDraftingId
	 */
	public String getaDraftingId() {
		return aDraftingId;
	}

	/**
	 * @param aDraftingId セットする aDraftingId
	 */
	public void setaDraftingId(String aDraftingId) {
		this.aDraftingId = aDraftingId;
	}

	/**
	 * @return cdId
	 */
	public String getCdId() {
		return cdId;
	}

	/**
	 * @param cdId セットする cdId
	 */
	public void setCdId(String cdId) {
		this.cdId = cdId;
	}

	/**
	 * @return iADId
	 */
	public String getiADId() {
		return iADId;
	}

	/**
	 * @param iADId セットする iADId
	 */
	public void setiADId(String iADId) {
		this.iADId = iADId;
	}

	/**
	 * @return iAId
	 */
	public String getiAId() {
		return iAId;
	}

	/**
	 * @param iAId セットする iAId
	 */
	public void setiAId(String iAId) {
		this.iAId = iAId;
	}

	/**
	 * @return adminNum
	 */
	public String getAdminNum() {
		return adminNum;
	}

	/**
	 * @param adminNum セットする adminNum
	 */
	public void setAdminNum(String adminNum) {
		this.adminNum = adminNum;
	}

	/**
	 * @return head
	 */
	public String getHead() {
		return head;
	}

	/**
	 * @param head セットする head
	 */
	public void setHead(String head) {
		this.head = head;
	}

	/**
	 * @return bildCost
	 */
	public float getBildCost() {
		return bildCost;
	}

	/**
	 * @param bildCost セットする bildCost
	 */
	public void setBildCost(float bildCost) {
		this.bildCost = bildCost;
	}

	/**
	 * @return benefit
	 */
	public float getBenefit() {
		return benefit;
	}

	/**
	 * @param benefit セットする benefit
	 */
	public void setBenefit(float benefit) {
		this.benefit = benefit;
	}

	/**
	 * @return amountAll
	 */
	public float getAmountAll() {
		return amountAll;
	}

	/**
	 * @param amountAll セットする amountAll
	 */
	public void setAmountAll(float amountAll) {
		this.amountAll = amountAll;
	}

	/**
	 * @return session
	 */
	public Map<String,Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	/**
	 * @return decisionList
	 */
	public ArrayList<DecisionDTO> getDecisionList() {
		return decisionList;
	}

	/**
	 * @param decisionList セットする decisionList
	 */
	public void setDecisionList(ArrayList<DecisionDTO> decisionList) {
		this.decisionList = decisionList;
	}





}








