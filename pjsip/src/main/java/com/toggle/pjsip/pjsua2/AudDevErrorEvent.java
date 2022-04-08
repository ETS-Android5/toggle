/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.toggle.pjsip.pjsua2;

public class AudDevErrorEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AudDevErrorEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AudDevErrorEvent obj) {
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
        pjsua2JNI.delete_AudDevErrorEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDir(int value) {
    pjsua2JNI.AudDevErrorEvent_dir_set(swigCPtr, this, value);
  }

  public int getDir() {
    return pjsua2JNI.AudDevErrorEvent_dir_get(swigCPtr, this);
  }

  public void setId(int value) {
    pjsua2JNI.AudDevErrorEvent_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return pjsua2JNI.AudDevErrorEvent_id_get(swigCPtr, this);
  }

  public void setStatus(int value) {
    pjsua2JNI.AudDevErrorEvent_status_set(swigCPtr, this, value);
  }

  public int getStatus() {
    return pjsua2JNI.AudDevErrorEvent_status_get(swigCPtr, this);
  }

  public AudDevErrorEvent() {
    this(pjsua2JNI.new_AudDevErrorEvent(), true);
  }

}
