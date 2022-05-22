package com.we.shopservice;

import com.we.shopservice.mapper.CommodityMapper;
import com.we.shopservice.mapper.DetailsMapper;
import entity.Commodity;
import entity.Details;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ShopServiceApplicationTests {

    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    DetailsMapper detailsMapper;

    @Test
    void contextLoads() {
        Commodity commodity = new Commodity();
        commodity.setClassification("daily necessities");
        commodity.setCoverAddress("pen.webp");
        commodity.setPrice(new BigDecimal("3.65"));
        commodity.setDescribeText("一款神奇的钢笔!");
        commodityMapper.insert(commodity);

        Details details = new Details();
        details.setCId(1024274433);
        details.setQuantity(50);
        details.setExplainText("一款神奇的钢笔！");
        details.setParameters("{\"长度\":\"16cm\",\"材质\":\"0.3碳钢\"}");
        detailsMapper.insert(details);

    }


}
