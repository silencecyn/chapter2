package com.silence.domain;


import org.springframework.stereotype.Repository;

import java.io.Serializable;

public class TUser implements Serializable{

  private String userId;
  private String userName;
  private String credits;
  private String password;
  private java.sql.Timestamp lastVisit;
  private String lastIp;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getCredits() {
    return credits;
  }

  public void setCredits(String credits) {
    this.credits = credits;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public java.sql.Timestamp getLastVisit() {
    return lastVisit;
  }

  public void setLastVisit(java.sql.Timestamp lastVisit) {
    this.lastVisit = lastVisit;
  }


  public String getLastIp() {
    return lastIp;
  }

  public void setLastIp(String lastIp) {
    this.lastIp = lastIp;
  }

}
