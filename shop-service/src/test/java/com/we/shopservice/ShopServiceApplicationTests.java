package com.we.shopservice;

import com.alibaba.fastjson2.JSONObject;
import com.we.shopservice.mapper.CommodityMapper;
import com.we.shopservice.mapper.DetailsMapper;
import entity.Commodity;
import entity.Details;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ShopServiceApplicationTests {

    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    DetailsMapper detailsMapper;

    @Test
    void contextLoads() {
        List<Commodity> commodities = commodityMapper.selectAllCommodityAndInformation();



    }


}
