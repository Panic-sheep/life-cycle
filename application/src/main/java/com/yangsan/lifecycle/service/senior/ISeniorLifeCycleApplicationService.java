package com.yangsan.lifecycle.service.senior;


/**
 * create by develop-wenxin-bugfix
 */
public interface ISeniorLifeCycleApplicationService {

    String test(String name);

    String optionSeniorLifeCycle(String guid,String keepInEarly,String keepInEnd,String[] keepInAppointedDay,String[] keepInYearAppointedDay);
}
