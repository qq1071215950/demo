package com.example.demo.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author jiange
 * @date 2020/10/26 14:46
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> appRuleSkuColumns = new HashMap<>();
        appRuleSkuColumns.put("sku_name","商品名称");
        appRuleSkuColumns.put("m_cate_name1","一级类目");
        appRuleSkuColumns.put("m_cate_name2","二级类目");
        appRuleSkuColumns.put("m_cate_name3","三级类目");
        appRuleSkuColumns.put("sku_price","售价");
        appRuleSkuColumns.put("gross_profit_rate","综合毛利率");
        for (Map.Entry<String, String> entry : appRuleSkuColumns.entrySet()){
            System.out.println(entry.getKey()+ "" + entry.getValue());
        }
        System.out.println("有序测试");

        Map<String, String> appRuleSkuColumns1 = new LinkedHashMap<>();
        appRuleSkuColumns1.put("sku_name","商品名称");
        appRuleSkuColumns1.put("m_cate_name1","一级类目");
        appRuleSkuColumns1.put("m_cate_name2","二级类目");
        appRuleSkuColumns1.put("m_cate_name3","三级类目");
        appRuleSkuColumns1.put("sku_price","售价");
        appRuleSkuColumns1.put("gross_profit_rate","综合毛利率");
        for (Map.Entry<String, String> entry : appRuleSkuColumns1.entrySet()){
            System.out.println(entry.getKey()+ "" + entry.getValue());
        }
    }
}
