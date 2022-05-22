package com.we.shopservice.controller;

import api.CommodityApi;
import com.we.shopservice.service.impl.CommodityServiceImpl;
import config.ResultMap;
import entity.Commodity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
    public ResultMap<Boolean> addCommodity(MultipartFile[] pictures) throws IOException {
        if(pictures == null||pictures.length == 0){
            return ResultMap.build(ResultMap.Status.FAIL,"传入的数据不可以为空！",false);
        }else if(pictures.length > 6){
            return ResultMap.build(ResultMap.Status.FAIL,"传入的数据不可以多余六份！",false);
        }
        String path = System.getProperty("user.dir") + "\\shop-service\\src\\main\\resources\\static\\cover\\";
        File realPath = new File(path);
        if (!realPath.exists()){
            boolean mkdirs = realPath.mkdirs();
            if(!mkdirs){
                return ResultMap.build(ResultMap.Status.FAIL,"创建目录失败！",false);
            }
        }
        long count = Arrays.stream(pictures)
                .map(MultipartFile::getOriginalFilename)
                .filter(Objects::nonNull)
                .filter(String::isEmpty)
                .count();
        if(count != pictures.length){
            for (MultipartFile picture : pictures) {
                String originalFilename = picture.getOriginalFilename();
                picture.transferTo(new File(realPath +"/"+ originalFilename));
                System.out.println(realPath +"/"+ originalFilename);
            }
            return ResultMap.build(ResultMap.Status.SUCCESS,true);
        }
        return ResultMap.build(ResultMap.Status.FAIL,"未知异常！",false);
    }


}
