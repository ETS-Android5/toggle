/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.toggle.pjsip.pjsua2;

public class MediaEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MediaEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MediaEvent obj) {
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
        pjsua2JNI.delete_MediaEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(int value) {
    pjsua2JNI.MediaEvent_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return pjsua2JNI.MediaEvent_type_get(swigCPtr, this);
  }

  public void setData(MediaEventData value) {
    pjsua2JNI.MediaEvent_data_set(swigCPtr, this, MediaEventData.getCPtr(value), value);
  }

  public MediaEventData getData() {
    long cPtr = pjsua2JNI.MediaEvent_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MediaEventData(cPtr, false);
  }

  public void setPjMediaEvent(SWIGTYPE_p_void value) {
    pjsua2JNI.MediaEvent_pjMediaEvent_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getPjMediaEvent() {
    long cPtr = pjsua2JNI.MediaEvent_pjMediaEvent_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public MediaEvent() {
    this(pjsua2JNI.new_MediaEvent(), true);
  }

}
