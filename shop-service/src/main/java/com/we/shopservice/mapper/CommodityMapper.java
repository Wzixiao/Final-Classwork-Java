package com.we.shopservice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import entity.Commodity;
import entity.Details;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wRan
 * @since 2022-05-22 12:39:17
 */
@Mapper
public interface CommodityMapper extends BaseMapper<Commodity> {
    /**
     * 查询全部的商品以及对应的信息
     * @return List
     */
    @Select("select * from commodity")
    @Results(id = "selectAllCommodityAndInformation",value = {
            @Result(column = "id",property = "id"),
            @Result(column = "cover_address",property = "coverAddress",javaType = List.class,typeHandler = FastjsonTypeHandler.class),
            @Result(column = "id",property = "details",javaType = Details.class,
                    one = @One(select = "com.we.shopservice.mapper.DetailsMapper.selectBycId")
            )
    })
    List<Commodity> selectAllCommodityAndInformation();

}
