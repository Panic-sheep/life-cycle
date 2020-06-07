package com.yangsan.lifecycle.entity.senior;

import java.util.Date;
import java.util.List;

public class SeniorLifeCycle {

    private String guid;

    private List<RuleType> ruleTypes;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public List<RuleType> getRuleTypes() {
        return ruleTypes;
    }

    public void setRuleTypes(List<RuleType> ruleTypes) {
        this.ruleTypes = ruleTypes;
    }

    public boolean isMatchDay(Date date){
        return false;
    }

    public List<String> toSql(Date date){
        return null;
    }


}
