package com.ar.dev.tierra.hasar.api.model;

/**
 *
 * @author PauloGaldo
 */
public class JsonResponse {
    
    private String status;
    private String msg;

    public JsonResponse(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    
}
