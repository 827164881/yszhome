package com.microdreams.errorformat;

public enum ErrMessage {
  SUCCESS("200","请求成功！"),
  DISCONNECTION("500","连接服务器超时！"),
  TIMEOUT("500","请求超时！");

  private String code ;
  private String desc ;

  private ErrMessage( String code , String desc ){
    this.code = code ;
    this.desc = desc ;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  @Override
  public String toString() {
    return "{\"code\":"+this.code+",\"message\":"+this.desc+"}";
  }
}
