/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.toggle.pjsip.pjsua2;

public class VideoDevInfoVector2 extends java.util.AbstractList<VideoDevInfo> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VideoDevInfoVector2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VideoDevInfoVector2 obj) {
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
        pjsua2JNI.delete_VideoDevInfoVector2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VideoDevInfoVector2(VideoDevInfo[] initialElements) {
    this();
    reserve(initialElements.length);

    for (VideoDevInfo element : initialElements) {
      add(element);
    }
  }

  public VideoDevInfoVector2(Iterable<VideoDevInfo> initialElements) {
    this();
    for (VideoDevInfo element : initialElements) {
      add(element);
    }
  }

  public VideoDevInfo get(int index) {
    return doGet(index);
  }

  public VideoDevInfo set(int index, VideoDevInfo e) {
    return doSet(index, e);
  }

  public boolean add(VideoDevInfo e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, VideoDevInfo e) {
    modCount++;
    doAdd(index, e);
  }

  public VideoDevInfo remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public VideoDevInfoVector2() {
    this(pjsua2JNI.new_VideoDevInfoVector2__SWIG_0(), true);
  }

  public VideoDevInfoVector2(VideoDevInfoVector2 other) {
    this(pjsua2JNI.new_VideoDevInfoVector2__SWIG_1(VideoDevInfoVector2.getCPtr(other), other), true);
  }

  public long capacity() {
    return pjsua2JNI.VideoDevInfoVector2_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.VideoDevInfoVector2_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.VideoDevInfoVector2_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.VideoDevInfoVector2_clear(swigCPtr, this);
  }

  public VideoDevInfoVector2(int count, VideoDevInfo value) {
    this(pjsua2JNI.new_VideoDevInfoVector2__SWIG_2(count, VideoDevInfo.getCPtr(value), value), true);
  }

  private int doSize() {
    return pjsua2JNI.VideoDevInfoVector2_doSize(swigCPtr, this);
  }

  private void doAdd(VideoDevInfo x) {
    pjsua2JNI.VideoDevInfoVector2_doAdd__SWIG_0(swigCPtr, this, VideoDevInfo.getCPtr(x), x);
  }

  private void doAdd(int index, VideoDevInfo x) {
    pjsua2JNI.VideoDevInfoVector2_doAdd__SWIG_1(swigCPtr, this, index, VideoDevInfo.getCPtr(x), x);
  }

  private VideoDevInfo doRemove(int index) {
    return new VideoDevInfo(pjsua2JNI.VideoDevInfoVector2_doRemove(swigCPtr, this, index), true);
  }

  private VideoDevInfo doGet(int index) {
    return new VideoDevInfo(pjsua2JNI.VideoDevInfoVector2_doGet(swigCPtr, this, index), false);
  }

  private VideoDevInfo doSet(int index, VideoDevInfo val) {
    return new VideoDevInfo(pjsua2JNI.VideoDevInfoVector2_doSet(swigCPtr, this, index, VideoDevInfo.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.VideoDevInfoVector2_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
