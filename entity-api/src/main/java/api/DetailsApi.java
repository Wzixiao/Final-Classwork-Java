package api;

import config.ResultMap;

/**
 * @author cjq
 * @since 2022/5/22 - 16:11
 */
public interface DetailsApi {
    /**
     * 获取所有商品所对应的信息
     * @return Result.class
     */
    ResultMap<?> getAll();

}
