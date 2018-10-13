package com.erligaming.dota.model.vo;

import java.io.Serializable;

public class ResponseVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean status;

    private String errorCode;

    private String message;

    private Object data;

    public ResponseVO(){}

    public ResponseVO(Boolean status,String errorCode, String message, Object data){
        this.status = status;
        this.errorCode = errorCode;
        this.message= message;
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
