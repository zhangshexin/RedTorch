/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcTradingAccountPasswordUpdateV1Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingAccountPasswordUpdateV1Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingAccountPasswordUpdateV1Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcTradingAccountPasswordUpdateV1Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountPasswordUpdateV1Field_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountPasswordUpdateV1Field_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountPasswordUpdateV1Field_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountPasswordUpdateV1Field_InvestorID_get(swigCPtr, this);
  }

  public void setOldPassword(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountPasswordUpdateV1Field_OldPassword_set(swigCPtr, this, value);
  }

  public String getOldPassword() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountPasswordUpdateV1Field_OldPassword_get(swigCPtr, this);
  }

  public void setNewPassword(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountPasswordUpdateV1Field_NewPassword_set(swigCPtr, this, value);
  }

  public String getNewPassword() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountPasswordUpdateV1Field_NewPassword_get(swigCPtr, this);
  }

  public CThostFtdcTradingAccountPasswordUpdateV1Field() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcTradingAccountPasswordUpdateV1Field(), true);
  }

}