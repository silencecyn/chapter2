package com.silence.domain;


import org.springframework.stereotype.Repository;

import java.io.Serializable;

public class TLoginLog implements Serializable{

  private String loginLogId;
  private String userId;
  private String ip;
  private java.sql.Timestamp loginDatetime;


  public String getLoginLogId() {
    return loginLogId;
  }

  public void setLoginLogId(String loginLogId) {
    this.loginLogId = loginLogId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public java.sql.Timestamp getLoginDatetime() {
    return loginDatetime;
  }

  public void setLoginDatetime(java.sql.Timestamp loginDatetime) {
    this.loginDatetime = loginDatetime;
  }

}
