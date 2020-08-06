package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BusinessMapper {
    List<Business> selectBusinessList(@Param("orderTypeId") int orderTypeId);
}
