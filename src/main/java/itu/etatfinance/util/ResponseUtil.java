package itu.etatfinance.util;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {

    public static Map<String, Object> createResponse(String status, String message, Object data , Object error) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", error);
        response.put("data", data);
        response.put("message", message);
        response.put("status", status);
        return response;
    }

    public static Map<String, Object> successResponse(String message, Object data) {
        return createResponse("success", message, data,null);
    }
    public static Map<String, Object> errorResponse(String message , Object data , Object error){
        return createResponse("error", message, data, error);
    }
}
