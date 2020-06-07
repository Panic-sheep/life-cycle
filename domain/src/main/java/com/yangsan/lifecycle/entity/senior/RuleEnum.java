package com.yangsan.lifecycle.entity.senior;

public enum RuleEnum {

    KEEP_IN_EARLY("keepInEarly"),

    KEEP_IN_END("keepInEnd"),

    KEEP_IN_APPOINTED_DAY("keepInAppointedDay"),

    KEEP_IN_YEAR_APPOINTED_DAY("keepInYearAppointedDay");

    public final String ruleName;

    RuleEnum(String ruleName) {
        this.ruleName = ruleName;
    }



}
