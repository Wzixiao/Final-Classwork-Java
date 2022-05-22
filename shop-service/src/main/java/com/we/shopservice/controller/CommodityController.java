package com.we.shopservice.controller;

import api.CommodityApi;
import com.we.shopservice.service.impl.CommodityServiceImpl;
import config.ResultMap;
import entity.Commodity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 莫
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController implements CommodityApi {

    final CommodityServiceImpl commodityService;

    public CommodityController(CommodityServiceImpl commodityService) {
        this.commodityService = commodityService;
    }
    
    @Override
    @RequestMapping("/getAll")
    public ResultMap<List<Commodity>> getAll(){
        List<Commodity> list = commodityService.list();
        return ResultMap.build(ResultMap.Status.SUCCESS,list);
    }



}
