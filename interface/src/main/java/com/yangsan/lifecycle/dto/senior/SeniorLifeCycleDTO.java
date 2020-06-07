package com.yangsan.lifecycle.dto.senior;

public class SeniorLifeCycleDTO {

    private String guid;

    private String keepInEarly;

    private String keepInEnd;

    private String[] keepInAppointedDay;

    private String[] keepInYearAppointedDay;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getKeepInEarly() {
        return keepInEarly;
    }

    public void setKeepInEarly(String keepInEarly) {
        this.keepInEarly = keepInEarly;
    }

    public String getKeepInEnd() {
        return keepInEnd;
    }

    public void setKeepInEnd(String keepInEnd) {
        this.keepInEnd = keepInEnd;
    }

    public String[] getKeepInAppointedDay() {
        return keepInAppointedDay;
    }

    public void setKeepInAppointedDay(String[] keepInAppointedDay) {
        this.keepInAppointedDay = keepInAppointedDay;
    }

    public String[] getKeepInYearAppointedDay() {
        return keepInYearAppointedDay;
    }

    public void setKeepInYearAppointedDay(String[] keepInYearAppointedDay) {
        this.keepInYearAppointedDay = keepInYearAppointedDay;
    }
}
