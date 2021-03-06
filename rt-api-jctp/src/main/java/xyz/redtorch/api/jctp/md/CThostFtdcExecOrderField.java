/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcExecOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerExecOrderSeq(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerExecOrderSeq() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExecOrderField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExecOrderField(), true);
  }

}
