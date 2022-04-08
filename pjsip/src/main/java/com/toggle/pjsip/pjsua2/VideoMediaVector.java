/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.toggle.pjsip.pjsua2;

public class VideoMediaVector extends java.util.AbstractList<VideoMedia> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VideoMediaVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VideoMediaVector obj) {
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
        pjsua2JNI.delete_VideoMediaVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VideoMediaVector(VideoMedia[] initialElements) {
    this();
    reserve(initialElements.length);

    for (VideoMedia element : initialElements) {
      add(element);
    }
  }

  public VideoMediaVector(Iterable<VideoMedia> initialElements) {
    this();
    for (VideoMedia element : initialElements) {
      add(element);
    }
  }

  public VideoMedia get(int index) {
    return doGet(index);
  }

  public VideoMedia set(int index, VideoMedia e) {
    return doSet(index, e);
  }

  public boolean add(VideoMedia e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, VideoMedia e) {
    modCount++;
    doAdd(index, e);
  }

  public VideoMedia remove(int index) {
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

  public VideoMediaVector() {
    this(pjsua2JNI.new_VideoMediaVector__SWIG_0(), true);
  }

  public VideoMediaVector(VideoMediaVector other) {
    this(pjsua2JNI.new_VideoMediaVector__SWIG_1(VideoMediaVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return pjsua2JNI.VideoMediaVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.VideoMediaVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.VideoMediaVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.VideoMediaVector_clear(swigCPtr, this);
  }

  public VideoMediaVector(int count, VideoMedia value) {
    this(pjsua2JNI.new_VideoMediaVector__SWIG_2(count, VideoMedia.getCPtr(value), value), true);
  }

  private int doSize() {
    return pjsua2JNI.VideoMediaVector_doSize(swigCPtr, this);
  }

  private void doAdd(VideoMedia x) {
    pjsua2JNI.VideoMediaVector_doAdd__SWIG_0(swigCPtr, this, VideoMedia.getCPtr(x), x);
  }

  private void doAdd(int index, VideoMedia x) {
    pjsua2JNI.VideoMediaVector_doAdd__SWIG_1(swigCPtr, this, index, VideoMedia.getCPtr(x), x);
  }

  private VideoMedia doRemove(int index) {
    return new VideoMedia(pjsua2JNI.VideoMediaVector_doRemove(swigCPtr, this, index), true);
  }

  private VideoMedia doGet(int index) {
    return new VideoMedia(pjsua2JNI.VideoMediaVector_doGet(swigCPtr, this, index), false);
  }

  private VideoMedia doSet(int index, VideoMedia val) {
    return new VideoMedia(pjsua2JNI.VideoMediaVector_doSet(swigCPtr, this, index, VideoMedia.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.VideoMediaVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
