package org.mengsoft.admin.common.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mengsoft.admin.common.enums.ResponseCode;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse {
    private Integer statusCode;
    private String message;
    private String exception;

    /**
     *
     * @param responseCode
     * @param e
     * @param message
     * @return
     */
    public static ErrorResponse fail(ResponseCode responseCode, Throwable e, String message){
        ErrorResponse response = ErrorResponse.fail(responseCode, e);
        response.setMessage(message);

        return response;
    }

    public static ErrorResponse fail(ResponseCode responseCode, Throwable e){
        ErrorResponse response = new ErrorResponse();
        response.setMessage(responseCode.getMessage());
        response.setStatusCode(responseCode.getCode());
        response.setException(e.getClass().getName());

        return response;
    }
}
