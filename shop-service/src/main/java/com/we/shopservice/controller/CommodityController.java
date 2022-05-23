package com.we.shopservice.controller;

import api.CommodityApi;
import com.we.shopservice.service.impl.CommodityServiceImpl;
import com.we.shopservice.tools.PicturesSaveTools;
import config.ResultMap;
import entity.Commodity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 莫
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController implements CommodityApi {

    final CommodityServiceImpl commodityService;
    final PicturesSaveTools picturesSaveTools;

    public CommodityController(CommodityServiceImpl commodityService,PicturesSaveTools picturesSaveTools) {
        this.commodityService = commodityService;
        this.picturesSaveTools = picturesSaveTools;
    }


    @Override
    @RequestMapping("/getAll")
    public ResultMap<List<Commodity>> getAll() {
        List<Commodity> list = commodityService.list();
        return ResultMap.build(ResultMap.Status.SUCCESS, list);
    }

    @Override
    @RequestMapping("/getAllAndInformation")
    public ResultMap<List<Commodity>> getAllAndInformation() {
        List<Commodity> commodities = commodityService.selectAllCommodityAndInformation();
        return ResultMap.build(ResultMap.Status.SUCCESS, commodities);
    }

    @Override
    @RequestMapping("/addCommodity")
    public ResultMap<List<String>> addCommodity(@RequestPart("pictures") MultipartFile[] pictures, @RequestPart("commodity") Commodity commodity) {
        //todo 未完成
        System.out.println(Arrays.toString(pictures));
        System.out.println(commodity);
//        return picturesSaveTools.save(pictures);
        ArrayList<String> objects = new ArrayList<>();
        objects.add("a");
        return ResultMap.build(ResultMap.Status.SUCCESS,objects);
    }


}
