package com.yangsan.lifecycle.controller.senior;

import com.yangsan.lifecycle.dto.senior.SeniorLifeCycleDTO;
import com.yangsan.lifecycle.service.senior.ISeniorLifeCycleApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * create by develop-wenxin
 */
@RestController
@RequestMapping("/senior-lifecycle")
public class SeniorLifeCycleController {

    @Autowired
    private ISeniorLifeCycleApplicationService iSeniorLifeCycleApplicationService;


    /**
     * 高级生命周期设置
     * @param seniorLifeCycleDTO
     */
    @RequestMapping("/optionSeniorLifeCycle")
    public String optionSeniorLifeCycle(@RequestBody SeniorLifeCycleDTO seniorLifeCycleDTO){
       return iSeniorLifeCycleApplicationService.optionSeniorLifeCycle(seniorLifeCycleDTO.getGuid(),seniorLifeCycleDTO.getKeepInEarly(),seniorLifeCycleDTO.getKeepInEnd(),seniorLifeCycleDTO.getKeepInAppointedDay(),seniorLifeCycleDTO.getKeepInYearAppointedDay());
    }


    @RequestMapping("/test/{name}")
    public String test(@PathVariable("name") String name){
       return iSeniorLifeCycleApplicationService.test(name);
    }

}