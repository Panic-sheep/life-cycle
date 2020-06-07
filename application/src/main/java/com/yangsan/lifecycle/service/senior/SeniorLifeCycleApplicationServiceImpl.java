package com.yangsan.lifecycle.service.senior;

import com.yangsan.lifecycle.convert.senior.SeniorLifeCycleConvert;
import com.yangsan.lifecycle.entity.senior.SeniorLifeCycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SeniorLifeCycleApplicationServiceImpl implements ISeniorLifeCycleApplicationService {

    @Autowired
    private ISeniorLifeCycleService iSeniorLifeCycleService;

    @Override
    public String test(String name) {
        return "hello 》》》》》 " + name;
    }

    @Override
    public String optionSeniorLifeCycle(String guid,String keepInEarly,String keepInEnd,String[] keepInAppointedDay,String[] keepInYearAppointedDay) {
        return String.valueOf(iSeniorLifeCycleService.save(SeniorLifeCycleConvert.convertDTO(guid,keepInEarly,keepInEnd,keepInAppointedDay,keepInYearAppointedDay)));
    }
}
