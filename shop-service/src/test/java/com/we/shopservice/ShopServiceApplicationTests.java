package com.we.shopservice;

import com.we.shopservice.mapper.CommodityMapper;
import com.we.shopservice.mapper.DetailsMapper;
import com.we.shopservice.service.impl.CommodityServiceImpl;
import com.we.shopservice.service.impl.DetailsServiceImpl;
import entity.Commodity;
import entity.Details;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class ShopServiceApplicationTests {

    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    CommodityServiceImpl commodityService;

    @Autowired
    DetailsMapper detailsMapper;

    @Autowired
    DetailsServiceImpl detailsService;
    @Test
    void contextLoads() {

    }

}
