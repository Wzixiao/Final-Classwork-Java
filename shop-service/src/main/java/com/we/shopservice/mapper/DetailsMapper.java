package com.we.shopservice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Details;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wRan
 * @since 2022-05-22 12:39:17
 */
@Mapper
public interface DetailsMapper extends BaseMapper<Details> {
    /**
     * 通过外键cid获取商品的相信信息
     * @param cId 外键id
     * @return 单个实体类
     */
    @Select("select * from details where c_id = #{cId}")
    Details selectBycId(int cId);
}
