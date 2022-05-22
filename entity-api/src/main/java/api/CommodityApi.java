package api;

import config.ResultMap;
import entity.Commodity;

import java.util.List;

/**
 * @author wRan
 */
public interface CommodityApi {
    /**
     * <p>
     *     获取所有商品
     * </p>
     * @return ResultMap
     */
    ResultMap<?> getAll();

    /**
     * <p>
     *     获取所有商品和所对应的信息(禁止使用)
     * </p>
     * @return ResultMap
     */
    @Deprecated
    ResultMap<List<Commodity>> getAllAndInformation();

}
