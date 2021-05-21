package com.bihai.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: CommonResult
 * @author: bihai-ui
 * @create: 2021-04-22 23:32
 * @Description: TODO
 */

@Data
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public CommonResult(Integer code, String msg,T data){
        this(code,msg);
        this.data = data;
    }

}