package com.we.shopservice.controller;

import api.DetailsApi;
import com.we.shopservice.service.impl.DetailsServiceImpl;
import config.ResultMap;
import entity.Details;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cjq
 * @since  2022/5/22 - 16:11
 */
@RestController
@RequestMapping("/details")
public class DetailsController implements DetailsApi {

    final DetailsServiceImpl detailsService;

    public DetailsController(DetailsServiceImpl detailsService) {
        this.detailsService = detailsService;
    }

    @Override
    @RequestMapping("/getAll")
    public ResultMap<?> getAll() {
        List<Details> list = detailsService.list();
        return ResultMap.build(ResultMap.Status.SUCCESS, list);
    }
}
