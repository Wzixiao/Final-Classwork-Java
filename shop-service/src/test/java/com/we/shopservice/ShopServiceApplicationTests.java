package com.we.shopservice;

import com.we.shopservice.mapper.CommodityMapper;
import com.we.shopservice.mapper.DetailsMapper;
import com.we.shopservice.service.impl.CommodityServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ShopServiceApplicationTests {

    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    CommodityServiceImpl commodityService;

    @Autowired
    DetailsMapper detailsMapper;

    @Test
    void contextLoads() {

    }


}
