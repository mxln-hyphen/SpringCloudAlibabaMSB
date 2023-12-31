package com.mxln.cloudalibabaopenfeignconsumer8888.controller;

import com.mxln.cloudalibabacommons.entity.JsonResult;
import com.mxln.cloudalibabaopenfeignconsumer8888.service.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignController {

    @Autowired
    private OpenFeignService openFeignService;

    @GetMapping("getInfo/{id}")
    public JsonResult<String> getInfo(@PathVariable("id") Long id){
        return openFeignService.msbSql(id);
    }

    //OpenFeginController
    @GetMapping("/testTimeout")
    public String TestTimeout(){
        return openFeignService.timeOut();
    }
}
