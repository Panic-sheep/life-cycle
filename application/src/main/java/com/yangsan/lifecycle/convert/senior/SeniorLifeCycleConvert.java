package com.yangsan.lifecycle.convert.senior;


import com.alibaba.fastjson.JSON;
import com.yangsan.lifecycle.entity.senior.RuleEnum;
import com.yangsan.lifecycle.entity.senior.SeniorLifeCycle;
import com.yangsan.lifecycle.entity.senior.RuleType;

import java.util.ArrayList;
import java.util.List;

public class SeniorLifeCycleConvert {

    public static SeniorLifeCycle convertDTO(String guid,String keepInEarly,String keepInEnd,String[] keepInAppointedDay,String[] keepInYearAppointedDay){
        SeniorLifeCycle seniorLifeCycle = new SeniorLifeCycle();
        seniorLifeCycle.setGuid(guid);
        List<RuleType> ruleTypes = new ArrayList<>();
        if("Y".equalsIgnoreCase(keepInEarly)){
            ruleTypes.add(new RuleType(RuleEnum.KEEP_IN_EARLY,"Y"));
        }
        if("Y".equalsIgnoreCase(keepInEnd)){
            ruleTypes.add(new RuleType(RuleEnum.KEEP_IN_END,"Y"));
        }
        if(keepInAppointedDay != null){
            ruleTypes.add(new RuleType(RuleEnum.KEEP_IN_APPOINTED_DAY,JSON.toJSONString(keepInAppointedDay)));
        }
        if(keepInYearAppointedDay != null){
            ruleTypes.add(new RuleType(RuleEnum.KEEP_IN_YEAR_APPOINTED_DAY,JSON.toJSONString(keepInYearAppointedDay)));
        }
        seniorLifeCycle.setRuleTypes(ruleTypes);
        return seniorLifeCycle;
    }

    public static void main(String[] args) {
        String[] param = {"2020-02-03","2020-02-04"};

        System.out.println(JSON.toJSONString(param));
    }

}
