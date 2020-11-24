package com.example.demo.vo;


import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * app规则视图对象
 */
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppRuleVO {

    /**
     * app规则id
     */
    private String appRuleId;

    /**
     * app规则名称
     */
    private String appRuleName;

    /**
     * 描述
     */
    private String desc;

    /**
     * 子公司编码
     */
    private String orgNo;

    /**
     * 子公司名称
     */
    private String orgName;

    /**
     * 门店id
     */
    private String storeId;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * 规则配置 新增规则 复制其它门店
     */
    private String appRuleProperty;

    /**
     * 指标ids
     */
    private List<String> indicatorIds;

    /**
     * 规则对象 对应tag
     */
    private List<RuleVO> ruleVO;

    /**
     * app规则状态
     */
    private int status;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 规则明细
     */
    private StringBuilder rules;

}
