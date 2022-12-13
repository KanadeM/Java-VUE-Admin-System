package org.mengsoft.admin.common.exceptions;

import lombok.Data;
import org.mengsoft.admin.common.enums.ResponseCode;

@Data
public class BusinessException extends RuntimeException{

    private Integer statusCode;
    private String message;

    public BusinessException(ResponseCode responseCode){
        this.statusCode = responseCode.getCode();
        this.message = responseCode.getMessage();
    }

}
