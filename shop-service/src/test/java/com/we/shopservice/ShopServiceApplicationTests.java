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
//        List<Commodity> commodities = commodityMapper.selectAllCommodityAndInformation();
//        commodities.forEach(System.out::println);

//        Commodity commodity = new Commodity();
//        commodity.setClassification("daily necessities");
//        commodity.setCoverAddress("pen.webp");
//        commodity.setPrice(new BigDecimal("3.65"));
//        commodity.setDescribeText("一款神奇的钢笔!");
//        commodityMapper.insert(commodity);
//
//        Details details = new Details();
//        details.setCId(1024274433);
//        details.setQuantity(50);
//        details.setExplainText("一款神奇的钢笔！");
//        Map<String, String> map = new HashMap<>();
//        map.put("长度","16cm");
//        map.put("材质","不锈钢");
//        details.setParameters(map);
//        detailsMapper.insert(details);

    }


}
