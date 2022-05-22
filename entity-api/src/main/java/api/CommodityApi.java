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

    ResultMap<List<Commodity>> getAllAndInformation();
}
