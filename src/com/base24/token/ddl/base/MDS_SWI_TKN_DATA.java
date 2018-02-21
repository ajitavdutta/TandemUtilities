package com.base24.token.ddl.base;

/**
 * The <b>{@code MDS_SWI_TKN_DATA}</b> class represents the structure for B0 and
 * B1 token which is used by the MDS interface.
 * 
 * @author duttaaji
 * @version 1.0
 * @see TOKEN_B0
 *
 */
public class MDS_SWI_TKN_DATA {
	/**
	 * The switch token version ID.
	 */
	private String ver_id;
	/**
	 * The network ID code.
	 */
	private String ntwk_id_cde;
	/**
	 * The transaction reference number.
	 */
	private String ref_num;
	/**
	 * The response code.
	 */
	private String resp_cde;
	/**
	 * The point-of-service entry mode.<br>
	 * The field contains two codes. The first code is two digits in length and
	 * indicates the method by which Track 2 data or the primary account number
	 * (PAN) was entered into the system. The second code is one digit in length and
	 * indicates the entry capabilities available at the point of service.
	 */
	private String pos_entry_mode;
	/**
	 * The terminal location.
	 */
	private String term_loc;
	/**
	 * The switch reference number.
	 */
	private String switch_ref_num;
	/**
	 * Airline Ticket number.
	 */
	private String airline_tckt_num;
	/**
	 * The transaction processing code.
	 */
	private String proc_cde;
	/**
	 * The MDS Settlement Service indicator.
	 */
	private String setl_srvc_data;
	/**
	 * The MDS Advice Detail Code.
	 */
	private String advc_detl_cde;
	/**
	 * A code containing the MDS On-Behalf Services data. Valid values are as
	 * follows:
	 * <ul>
	 * <li>01 = M/Chip to Magnetic Stripe Conversion
	 * <li>02 = M/Chip Cryptogram Pre-Validation/Post-Generation
	 * <li>03 = Dynamic M/Chip Stand-In
	 * <li>04 = Reserved
	 * <li>05 = Accountholder Authentication Verification Service
	 * <li>06 = Dynamic Accountholder Authentication Verification Service
	 * </ul>
	 */
	private String on_behalf_svc;
	/**
	 * A code indicating the MDS On-Behalf Result 1 value. Valid values are as
	 * follows:
	 * <ul>
	 * <li>C = Conversion of the M/Chip transaction to a magnetic stripe transaction
	 * completed.
	 * <li>G = Application Cryptogram is valid, but it is not an ARQC. Status of
	 * TVR/CVR unknown.
	 * <li>I = Application Cryptogram (AC) is incorrect or invalid. Status of
	 * TVR/CVR unknown.
	 * <li>T = Valid ARQC, TVR/CVR invalid.
	 * <li>U = Unable to process. No check on cryptogram. Status of TVR/CVR unknown.
	 * <li>V = Valid ARQC, valid TVR/CVR.
	 * <li>" " = No value present (where " " indicates a blank space).
	 * </ul>
	 */
	private String on_behalf_rslt_1;
	/**
	 * The MDS cardholder billing amount.
	 */
	private String crdhld_billing_amt;
	/**
	 * The MDS MCCR amount.
	 */
	private String mccr_amt;
	/**
	 * The MDS ICCR amount.
	 */
	private String iccr_amt;
	/**
	 * The MDS Tiered Merchant identification code.
	 */
	private String tired_merch_id;
	/**
	 * The MDS Quick Payment services indicator.
	 */
	private String qck_pymnt_srv_ind;
	/**
	 * The GCMS Settlement Date and Settlement Cycle number. Identifies when the
	 * settlement date and cycle are different from the reconciliation date and
	 * cycle.
	 */
	private String gcms_proc_dat_cyc;
	/**
	 * A code containing additional POS data. This code gives issuers additional
	 * information about the conditions surrounding the transaction.
	 */
	private String gcms_adnl_pos_data;
	/**
	 * A code indicating the type of business activity. This code identifies the
	 * type of business arrangement applied to this transaction.
	 */
	private String gcms_bus_activity;
	/**
	 * A code containing settlement data. This code gives the issuer additional
	 * information about the settlement of the transaction.
	 */
	private String gcms_setl_date;
	/**
	 * A code containing M/Chip processing information. This code gives acquirers
	 * more information about cryptogram validation.
	 * <ul>
	 * <li>02 = MasterCard On-Behalf Service – M/Chip Cryptogram pre-validation
	 * <li>03 = MasterCard On-Behalf Service – M/Chip Cryptogram validation in
	 * stand-in processing
	 * <li>50 = Issuer chip validation
	 * </ul>
	 */
	private String mchip_proc_ind;
	/**
	 * A code containing M/Chip processing information. This code gives acquirers
	 * more information about cryptogram validation.
	 * <ul>
	 * <li>I = Application Cryptogram invalid
	 * <li>U = Application Cryptogram not validated due to technical error
	 * <li>F = Format error in DE 55
	 * <li>G = Cryptogram in application is valid but is not an ARQC
	 * <li>T = Application Cryptogram is valid but TVR/CVR is invalid
	 * <li>X = Issuer provided incorrect value in subfield 2
	 * </ul>
	 */
	private String mchip_proc_info;
	/**
	 * The original witch serial number.
	 */
	private String orig_swi_serl_num;
	
	public MDS_SWI_TKN_DATA() {
		ver_id = new String();
		ntwk_id_cde = new String();
		ref_num = new String();
		resp_cde = new String();
		pos_entry_mode = new String();
		term_loc = new String();
		switch_ref_num = new String();
		airline_tckt_num = new String();
		proc_cde = new String();
		setl_srvc_data = new String();
		advc_detl_cde = new String();
		on_behalf_svc = new String();
		on_behalf_rslt_1 = new String();
		crdhld_billing_amt = new String();
		mccr_amt = new String();
		iccr_amt = new String();
		tired_merch_id = new String();
		qck_pymnt_srv_ind = new String();
		gcms_proc_dat_cyc = new String();
		gcms_adnl_pos_data = new String();
		gcms_bus_activity = new String();
		gcms_setl_date = new String();
		mchip_proc_ind = new String();
		mchip_proc_info = new String();
		orig_swi_serl_num = new String();
	}
	
	public MDS_SWI_TKN_DATA(String data) {
		super();
		byte []bytes = data.getBytes();
		int idx = 0;
		
	}

	/**
	 * @return the ver_id
	 */
	public String getVer_id() {
		return ver_id;
	}

	/**
	 * @param ver_id
	 *            the ver_id to set
	 */
	public void setVer_id(String ver_id) {
		this.ver_id = ver_id;
	}

	/**
	 * @return the ntwk_id_cde
	 */
	public String getNtwk_id_cde() {
		return ntwk_id_cde;
	}

	/**
	 * @param ntwk_id_cde
	 *            the ntwk_id_cde to set
	 */
	public void setNtwk_id_cde(String ntwk_id_cde) {
		this.ntwk_id_cde = ntwk_id_cde;
	}

	/**
	 * @return the ref_num
	 */
	public String getRef_num() {
		return ref_num;
	}

	/**
	 * @param ref_num
	 *            the ref_num to set
	 */
	public void setRef_num(String ref_num) {
		this.ref_num = ref_num;
	}

	/**
	 * @return the resp_cde
	 */
	public String getResp_cde() {
		return resp_cde;
	}

	/**
	 * @param resp_cde
	 *            the resp_cde to set
	 */
	public void setResp_cde(String resp_cde) {
		this.resp_cde = resp_cde;
	}

	/**
	 * @return the pos_entry_mode
	 */
	public String getPos_entry_mode() {
		return pos_entry_mode;
	}

	/**
	 * @param pos_entry_mode
	 *            the pos_entry_mode to set
	 */
	public void setPos_entry_mode(String pos_entry_mode) {
		this.pos_entry_mode = pos_entry_mode;
	}

	/**
	 * @return the term_loc
	 */
	public String getTerm_loc() {
		return term_loc;
	}

	/**
	 * @param term_loc
	 *            the term_loc to set
	 */
	public void setTerm_loc(String term_loc) {
		this.term_loc = term_loc;
	}

	/**
	 * @return the switch_ref_num
	 */
	public String getSwitch_ref_num() {
		return switch_ref_num;
	}

	/**
	 * @param switch_ref_num
	 *            the switch_ref_num to set
	 */
	public void setSwitch_ref_num(String switch_ref_num) {
		this.switch_ref_num = switch_ref_num;
	}

	/**
	 * @return the airline_tckt_num
	 */
	public String getAirline_tckt_num() {
		return airline_tckt_num;
	}

	/**
	 * @param airline_tckt_num
	 *            the airline_tckt_num to set
	 */
	public void setAirline_tckt_num(String airline_tckt_num) {
		this.airline_tckt_num = airline_tckt_num;
	}

	/**
	 * @return the proc_cde
	 */
	public String getProc_cde() {
		return proc_cde;
	}

	/**
	 * @param proc_cde
	 *            the proc_cde to set
	 */
	public void setProc_cde(String proc_cde) {
		this.proc_cde = proc_cde;
	}

	/**
	 * @return the setl_srvc_data
	 */
	public String getSetl_srvc_data() {
		return setl_srvc_data;
	}

	/**
	 * @param setl_srvc_data
	 *            the setl_srvc_data to set
	 */
	public void setSetl_srvc_data(String setl_srvc_data) {
		this.setl_srvc_data = setl_srvc_data;
	}

	/**
	 * @return the advc_detl_cde
	 */
	public String getAdvc_detl_cde() {
		return advc_detl_cde;
	}

	/**
	 * @param advc_detl_cde
	 *            the advc_detl_cde to set
	 */
	public void setAdvc_detl_cde(String advc_detl_cde) {
		this.advc_detl_cde = advc_detl_cde;
	}

	/**
	 * @return the on_behalf_svc
	 */
	public String getOn_behalf_svc() {
		return on_behalf_svc;
	}

	/**
	 * @param on_behalf_svc
	 *            the on_behalf_svc to set
	 */
	public void setOn_behalf_svc(String on_behalf_svc) {
		this.on_behalf_svc = on_behalf_svc;
	}

	/**
	 * @return the on_behalf_rslt_1
	 */
	public String getOn_behalf_rslt_1() {
		return on_behalf_rslt_1;
	}

	/**
	 * @param on_behalf_rslt_1
	 *            the on_behalf_rslt_1 to set
	 */
	public void setOn_behalf_rslt_1(String on_behalf_rslt_1) {
		this.on_behalf_rslt_1 = on_behalf_rslt_1;
	}

	/**
	 * @return the crdhld_billing_amt
	 */
	public String getCrdhld_billing_amt() {
		return crdhld_billing_amt;
	}

	/**
	 * @param crdhld_billing_amt
	 *            the crdhld_billing_amt to set
	 */
	public void setCrdhld_billing_amt(String crdhld_billing_amt) {
		this.crdhld_billing_amt = crdhld_billing_amt;
	}

	/**
	 * @return the mccr_amt
	 */
	public String getMccr_amt() {
		return mccr_amt;
	}

	/**
	 * @param mccr_amt
	 *            the mccr_amt to set
	 */
	public void setMccr_amt(String mccr_amt) {
		this.mccr_amt = mccr_amt;
	}

	/**
	 * @return the iccr_amt
	 */
	public String getIccr_amt() {
		return iccr_amt;
	}

	/**
	 * @param iccr_amt
	 *            the iccr_amt to set
	 */
	public void setIccr_amt(String iccr_amt) {
		this.iccr_amt = iccr_amt;
	}

	/**
	 * @return the tired_merch_id
	 */
	public String getTired_merch_id() {
		return tired_merch_id;
	}

	/**
	 * @param tired_merch_id
	 *            the tired_merch_id to set
	 */
	public void setTired_merch_id(String tired_merch_id) {
		this.tired_merch_id = tired_merch_id;
	}

	/**
	 * @return the qck_pymnt_srv_ind
	 */
	public String getQck_pymnt_srv_ind() {
		return qck_pymnt_srv_ind;
	}

	/**
	 * @param qck_pymnt_srv_ind
	 *            the qck_pymnt_srv_ind to set
	 */
	public void setQck_pymnt_srv_ind(String qck_pymnt_srv_ind) {
		this.qck_pymnt_srv_ind = qck_pymnt_srv_ind;
	}

	/**
	 * @return the gcms_proc_dat_cyc
	 */
	public String getGcms_proc_dat_cyc() {
		return gcms_proc_dat_cyc;
	}

	/**
	 * @param gcms_proc_dat_cyc
	 *            the gcms_proc_dat_cyc to set
	 */
	public void setGcms_proc_dat_cyc(String gcms_proc_dat_cyc) {
		this.gcms_proc_dat_cyc = gcms_proc_dat_cyc;
	}

	/**
	 * @return the gcms_adnl_pos_data
	 */
	public String getGcms_adnl_pos_data() {
		return gcms_adnl_pos_data;
	}

	/**
	 * @param gcms_adnl_pos_data
	 *            the gcms_adnl_pos_data to set
	 */
	public void setGcms_adnl_pos_data(String gcms_adnl_pos_data) {
		this.gcms_adnl_pos_data = gcms_adnl_pos_data;
	}

	/**
	 * @return the gcms_bus_activity
	 */
	public String getGcms_bus_activity() {
		return gcms_bus_activity;
	}

	/**
	 * @param gcms_bus_activity
	 *            the gcms_bus_activity to set
	 */
	public void setGcms_bus_activity(String gcms_bus_activity) {
		this.gcms_bus_activity = gcms_bus_activity;
	}

	/**
	 * @return the gcms_setl_date
	 */
	public String getGcms_setl_date() {
		return gcms_setl_date;
	}

	/**
	 * @param gcms_setl_date
	 *            the gcms_setl_date to set
	 */
	public void setGcms_setl_date(String gcms_setl_date) {
		this.gcms_setl_date = gcms_setl_date;
	}

	/**
	 * @return the mchip_proc_ind
	 */
	public String getMchip_proc_ind() {
		return mchip_proc_ind;
	}

	/**
	 * @param mchip_proc_ind
	 *            the mchip_proc_ind to set
	 */
	public void setMchip_proc_ind(String mchip_proc_ind) {
		this.mchip_proc_ind = mchip_proc_ind;
	}

	/**
	 * @return the mchip_proc_info
	 */
	public String getMchip_proc_info() {
		return mchip_proc_info;
	}

	/**
	 * @param mchip_proc_info
	 *            the mchip_proc_info to set
	 */
	public void setMchip_proc_info(String mchip_proc_info) {
		this.mchip_proc_info = mchip_proc_info;
	}

	/**
	 * @return the orig_swi_serl_num
	 */
	public String getOrig_swi_serl_num() {
		return orig_swi_serl_num;
	}

	/**
	 * @param orig_swi_serl_num
	 *            the orig_swi_serl_num to set
	 */
	public void setOrig_swi_serl_num(String orig_swi_serl_num) {
		this.orig_swi_serl_num = orig_swi_serl_num;
	}

}
