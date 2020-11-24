package com.example.demo.vo;

import lombok.*;

import java.util.List;

/**
 * 规则配置明细对象
 */
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RuleVO {

    /**
     * 规则id
     */
    private String ruleId;

    /**
     * 规则名称
     */
    private String ruleName;

    /**
     * 规则
     */
    private List<CritriaVO> conditions;

    /**
     * 规则逻辑
     */
    private String logic;
}
