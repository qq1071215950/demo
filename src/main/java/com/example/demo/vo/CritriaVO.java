package com.example.demo.vo;

import lombok.*;

/**
 * 条件对象
 */
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CritriaVO {

    /**
     * 规则条件id
     */
    private Integer id;

    /**
     * 左值
     */
    private LeftValue left;

    /**
     * 操作符号id
     */
    private String operator;

    /**
     * 右值
     */
    private RightValue right;

}
