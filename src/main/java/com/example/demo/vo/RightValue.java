package com.example.demo.vo;

import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RightValue {

    /**
     * 判断右边变量是否为变量
     */
    private Boolean isVar;

    /**
     * 指标值类型
     */
    private String value;
}
