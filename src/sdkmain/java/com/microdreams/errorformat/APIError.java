package com.microdreams.errorformat;

public class APIError {
    private int code = 0;
    private String msg = "正常";
    private String eventId = "";
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
        this.setMsg(Constance.getErrorMessage(code));
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getEventId() {
        return eventId;
    }
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}
