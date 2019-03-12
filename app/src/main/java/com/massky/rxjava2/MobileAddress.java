package com.massky.rxjava2;

class MobileAddress {
    //{"error_code":10017,"reason":"当前用户已被禁用，如需恢复使用请与我们联系"}
    private String error_code;
    private String reason;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {

        return reason;
    }
}
