package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;
    @RequestMapping("/list")
    public List<Business> getBusinessList(Business business){
        return businessService.selectBusinessList(business.getOrderTypeId());
    }
}
