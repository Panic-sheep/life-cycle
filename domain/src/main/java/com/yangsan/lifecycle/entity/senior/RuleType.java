package com.yangsan.lifecycle.entity.senior;

public class RuleType {

    private RuleEnum ruleEnum;

    private String param;

    public RuleEnum getRuleEnum() {
        return ruleEnum;
    }

    public void setRuleEnum(RuleEnum ruleEnum) {
        this.ruleEnum = ruleEnum;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public RuleType(RuleEnum ruleEnum, String param) {
        this.ruleEnum = ruleEnum;
        this.param = param;
    }

    public RuleType() {
    }
}
