/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.toggle.pjsip.pjsua2;

public class CodecFmtpVector extends java.util.AbstractList<CodecFmtp> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CodecFmtpVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CodecFmtpVector obj) {
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
        pjsua2JNI.delete_CodecFmtpVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CodecFmtpVector(CodecFmtp[] initialElements) {
    this();
    reserve(initialElements.length);

    for (CodecFmtp element : initialElements) {
      add(element);
    }
  }

  public CodecFmtpVector(Iterable<CodecFmtp> initialElements) {
    this();
    for (CodecFmtp element : initialElements) {
      add(element);
    }
  }

  public CodecFmtp get(int index) {
    return doGet(index);
  }

  public CodecFmtp set(int index, CodecFmtp e) {
    return doSet(index, e);
  }

  public boolean add(CodecFmtp e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, CodecFmtp e) {
    modCount++;
    doAdd(index, e);
  }

  public CodecFmtp remove(int index) {
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

  public CodecFmtpVector() {
    this(pjsua2JNI.new_CodecFmtpVector__SWIG_0(), true);
  }

  public CodecFmtpVector(CodecFmtpVector other) {
    this(pjsua2JNI.new_CodecFmtpVector__SWIG_1(CodecFmtpVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return pjsua2JNI.CodecFmtpVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.CodecFmtpVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.CodecFmtpVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.CodecFmtpVector_clear(swigCPtr, this);
  }

  public CodecFmtpVector(int count, CodecFmtp value) {
    this(pjsua2JNI.new_CodecFmtpVector__SWIG_2(count, CodecFmtp.getCPtr(value), value), true);
  }

  private int doSize() {
    return pjsua2JNI.CodecFmtpVector_doSize(swigCPtr, this);
  }

  private void doAdd(CodecFmtp x) {
    pjsua2JNI.CodecFmtpVector_doAdd__SWIG_0(swigCPtr, this, CodecFmtp.getCPtr(x), x);
  }

  private void doAdd(int index, CodecFmtp x) {
    pjsua2JNI.CodecFmtpVector_doAdd__SWIG_1(swigCPtr, this, index, CodecFmtp.getCPtr(x), x);
  }

  private CodecFmtp doRemove(int index) {
    return new CodecFmtp(pjsua2JNI.CodecFmtpVector_doRemove(swigCPtr, this, index), true);
  }

  private CodecFmtp doGet(int index) {
    return new CodecFmtp(pjsua2JNI.CodecFmtpVector_doGet(swigCPtr, this, index), false);
  }

  private CodecFmtp doSet(int index, CodecFmtp val) {
    return new CodecFmtp(pjsua2JNI.CodecFmtpVector_doSet(swigCPtr, this, index, CodecFmtp.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.CodecFmtpVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
