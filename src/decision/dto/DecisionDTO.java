package decision.dto;

/**
 * 決裁手続クラス
 * @author KOTA MIYAZATO
 * @since 2017/06/05
 */
public class DecisionDTO {
	/**
	 * 登録日
	 *
	 */
	private String registration;
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
	 * 	頭紙文章
	 */
	private String head;

	/**
	 * 建設費用
	 */
	private int bildcost;





	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getRegistration() {
		return registration;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public int getUserId() {
		return userId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getDecisionName() {
		return decisionName;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}

	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getIDraftingId() {
		return iDraftingId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setIDraftingId(String iDraftingId) {
		this.iDraftingId = iDraftingId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getIApprovalId() {
		return iApprovalId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setIApprovalId(String iApprovalId) {
		this.iApprovalId = iApprovalId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getADraftingId() {
		return aDraftingId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setADraftingId(String aDraftingId) {
		this.aDraftingId = aDraftingId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getCdId() {
		return cdId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setCdId(String cdId) {
		this.cdId = cdId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getIADId() {
		return iADId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setIADId(String iADId) {
		this.iADId = iADId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getIAId() {
		return iAId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setIAId(String iAId) {
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
	 * @return bildcost
	 */
	public int getBildcost() {
		return bildcost;
	}
	/**
	 * @param bildcost セットする bildcost
	 */
	public void setBildcost(int bildcost) {
		this.bildcost = bildcost;
	}



}
