package com.we.shopservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.Commodity;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wRan
 * @since 2022-05-22 12:39:17
 */
public interface ICommodityService extends IService<Commodity> {
    /**
     * 查询全部的商品以及对应的信息
     * @return List
     */
    List<Commodity> selectAllCommodityAndInformation();
}
