/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.toggle.pjsip.pjsua2;

public class AudioMediaVector extends java.util.AbstractList<AudioMedia> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AudioMediaVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AudioMediaVector obj) {
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
        pjsua2JNI.delete_AudioMediaVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AudioMediaVector(AudioMedia[] initialElements) {
    this();
    reserve(initialElements.length);

    for (AudioMedia element : initialElements) {
      add(element);
    }
  }

  public AudioMediaVector(Iterable<AudioMedia> initialElements) {
    this();
    for (AudioMedia element : initialElements) {
      add(element);
    }
  }

  public AudioMedia get(int index) {
    return doGet(index);
  }

  public AudioMedia set(int index, AudioMedia e) {
    return doSet(index, e);
  }

  public boolean add(AudioMedia e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, AudioMedia e) {
    modCount++;
    doAdd(index, e);
  }

  public AudioMedia remove(int index) {
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

  public AudioMediaVector() {
    this(pjsua2JNI.new_AudioMediaVector__SWIG_0(), true);
  }

  public AudioMediaVector(AudioMediaVector other) {
    this(pjsua2JNI.new_AudioMediaVector__SWIG_1(AudioMediaVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return pjsua2JNI.AudioMediaVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.AudioMediaVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.AudioMediaVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.AudioMediaVector_clear(swigCPtr, this);
  }

  public AudioMediaVector(int count, AudioMedia value) {
    this(pjsua2JNI.new_AudioMediaVector__SWIG_2(count, AudioMedia.getCPtr(value), value), true);
  }

  private int doSize() {
    return pjsua2JNI.AudioMediaVector_doSize(swigCPtr, this);
  }

  private void doAdd(AudioMedia x) {
    pjsua2JNI.AudioMediaVector_doAdd__SWIG_0(swigCPtr, this, AudioMedia.getCPtr(x), x);
  }

  private void doAdd(int index, AudioMedia x) {
    pjsua2JNI.AudioMediaVector_doAdd__SWIG_1(swigCPtr, this, index, AudioMedia.getCPtr(x), x);
  }

  private AudioMedia doRemove(int index) {
    long cPtr = pjsua2JNI.AudioMediaVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new AudioMedia(cPtr, false);
  }

  private AudioMedia doGet(int index) {
    long cPtr = pjsua2JNI.AudioMediaVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new AudioMedia(cPtr, false);
  }

  private AudioMedia doSet(int index, AudioMedia val) {
    long cPtr = pjsua2JNI.AudioMediaVector_doSet(swigCPtr, this, index, AudioMedia.getCPtr(val), val);
    return (cPtr == 0) ? null : new AudioMedia(cPtr, false);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.AudioMediaVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
