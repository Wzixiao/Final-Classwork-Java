package api;

import config.ResultMap;
import entity.Commodity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
     *     获取所有商品和所对应的信息(暂时禁止使用)
     * </p>
     * @return ResultMap
     */
    ResultMap<List<Commodity>> getAllAndInformation();

    /**
     * 添加商品 包含详细信息以及图片
     * @param pictures 多张图片
     * @return 成功或者失败
     * @throws IOException io堵塞等异常
     */
    ResultMap<Boolean> addCommodity(MultipartFile[] pictures) throws IOException;
}
