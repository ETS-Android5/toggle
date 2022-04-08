/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.toggle.pjsip.pjsua2;

public class SipEventBody {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SipEventBody(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipEventBody obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_SipEventBody(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTimer(TimerEvent value) {
    pjsua2JNI.SipEventBody_timer_set(swigCPtr, this, TimerEvent.getCPtr(value), value);
  }

  public TimerEvent getTimer() {
    long cPtr = pjsua2JNI.SipEventBody_timer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TimerEvent(cPtr, false);
  }

  public void setTsxState(TsxStateEvent value) {
    pjsua2JNI.SipEventBody_tsxState_set(swigCPtr, this, TsxStateEvent.getCPtr(value), value);
  }

  public TsxStateEvent getTsxState() {
    long cPtr = pjsua2JNI.SipEventBody_tsxState_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TsxStateEvent(cPtr, false);
  }

  public void setTxMsg(TxMsgEvent value) {
    pjsua2JNI.SipEventBody_txMsg_set(swigCPtr, this, TxMsgEvent.getCPtr(value), value);
  }

  public TxMsgEvent getTxMsg() {
    long cPtr = pjsua2JNI.SipEventBody_txMsg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TxMsgEvent(cPtr, false);
  }

  public void setTxError(TxErrorEvent value) {
    pjsua2JNI.SipEventBody_txError_set(swigCPtr, this, TxErrorEvent.getCPtr(value), value);
  }

  public TxErrorEvent getTxError() {
    long cPtr = pjsua2JNI.SipEventBody_txError_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TxErrorEvent(cPtr, false);
  }

  public void setRxMsg(RxMsgEvent value) {
    pjsua2JNI.SipEventBody_rxMsg_set(swigCPtr, this, RxMsgEvent.getCPtr(value), value);
  }

  public RxMsgEvent getRxMsg() {
    long cPtr = pjsua2JNI.SipEventBody_rxMsg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RxMsgEvent(cPtr, false);
  }

  public void setUser(UserEvent value) {
    pjsua2JNI.SipEventBody_user_set(swigCPtr, this, UserEvent.getCPtr(value), value);
  }

  public UserEvent getUser() {
    long cPtr = pjsua2JNI.SipEventBody_user_get(swigCPtr, this);
    return (cPtr == 0) ? null : new UserEvent(cPtr, false);
  }

  public SipEventBody() {
    this(pjsua2JNI.new_SipEventBody(), true);
  }

}
