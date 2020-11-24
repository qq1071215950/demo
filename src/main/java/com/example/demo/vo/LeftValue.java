package com.example.demo.vo;

import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeftValue {

    /**
     * 判断左边变量是否为变量
     */
    private Boolean isVsr;


    /**
     * 指标值类型
     */
    private String value;
}
