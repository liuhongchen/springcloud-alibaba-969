package com.liuhongchen.exception.sentinel_exception_handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
public class ResponseData {
    private int code;
    private String message;
}
