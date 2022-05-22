package api;

import config.ResultMap;

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

}
