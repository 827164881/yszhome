package com.microdreams.errorformat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class OutWithError {
    protected final APIError err = new APIError();
    public OutWithError setErrorCode(int code)
    {
        this.err.setCode(code);
        return this;
    }
    
    public APIError getErr()
    {
        return this.err;
    }
}
