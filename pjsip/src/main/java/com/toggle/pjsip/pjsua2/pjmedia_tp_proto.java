/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.toggle.pjsip.pjsua2;

public final class pjmedia_tp_proto {
  public final static int PJMEDIA_TP_PROTO_NONE = 0;
  public final static int PJMEDIA_TP_PROTO_UNKNOWN = 1 << 0;
  public final static int PJMEDIA_TP_PROTO_UDP = 1 << 1;
  public final static int PJMEDIA_TP_PROTO_RTP = 1 << 2;
  public final static int PJMEDIA_TP_PROTO_DTLS = 1 << 3;
  public final static int PJMEDIA_TP_PROFILE_RTCP_FB = 1 << 13;
  public final static int PJMEDIA_TP_PROFILE_SRTP = 1 << 14;
  public final static int PJMEDIA_TP_PROFILE_AVP = 1 << 15;
  public final static int PJMEDIA_TP_PROTO_RTP_AVP = PJMEDIA_TP_PROTO_RTP|PJMEDIA_TP_PROFILE_AVP;
  public final static int PJMEDIA_TP_PROTO_RTP_SAVP = PJMEDIA_TP_PROTO_RTP_AVP|PJMEDIA_TP_PROFILE_SRTP;
  public final static int PJMEDIA_TP_PROTO_DTLS_SRTP = PJMEDIA_TP_PROTO_DTLS|PJMEDIA_TP_PROTO_RTP_SAVP;
  public final static int PJMEDIA_TP_PROTO_RTP_AVPF = PJMEDIA_TP_PROTO_RTP_AVP|PJMEDIA_TP_PROFILE_RTCP_FB;
  public final static int PJMEDIA_TP_PROTO_RTP_SAVPF = PJMEDIA_TP_PROTO_RTP_SAVP|PJMEDIA_TP_PROFILE_RTCP_FB;
  public final static int PJMEDIA_TP_PROTO_DTLS_SRTPF = PJMEDIA_TP_PROTO_DTLS_SRTP|PJMEDIA_TP_PROFILE_RTCP_FB;
}

