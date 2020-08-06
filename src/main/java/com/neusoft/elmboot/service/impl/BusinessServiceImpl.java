package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.BusinessMapper;
import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.service.BusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BusinessServiceImpl implements BusinessService {
    @Resource
    private BusinessMapper businessMapper;
    @Override
    public List<Business> selectBusinessList(int orderTypeId) {
        return businessMapper.selectBusinessList(orderTypeId);
    }
}
