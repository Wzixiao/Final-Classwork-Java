package com.we.shopservice.controller;

import com.we.shopservice.config.ResultMap;
import com.we.shopservice.entity.Commodity;
import com.we.shopservice.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 莫
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController {

    final CommodityServiceImpl commodityService;

    public CommodityController(CommodityServiceImpl commodityService) {
        this.commodityService = commodityService;
    }

    /**
     * @return 全部的商品
     */
    @RequestMapping("/getAll")
    public ResultMap<?> getAll(){
        List<Commodity> list = commodityService.list();
        return ResultMap.build(ResultMap.Status.SUCCESS,list);
    }

}
