package com.we.shopservice.service.impl;


import com.we.shopservice.mapper.CommodityMapper;
import com.we.shopservice.service.ICommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Commodity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wRan
 * @since 2022-05-22 12:39:17
 */
@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements ICommodityService {
    final CommodityMapper commodityMapper;

    public CommodityServiceImpl(CommodityMapper commodityMapper) {
        this.commodityMapper = commodityMapper;
    }

    @Override
    public List<Commodity> selectAllCommodityAndInformation() {
        return commodityMapper.selectAllCommodityAndInformation();
    }

}
