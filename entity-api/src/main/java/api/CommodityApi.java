package api;

import config.ResultMap;
import entity.Commodity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author wRan
 */
public interface CommodityApi {
    /**
     *  获取所有商品
     * @return ResultMap
     */
    ResultMap<?> getAll();

    /**
     *  获取所有商品和所对应的信息(暂时禁止使用)
     * @return ResultMap
     */
    ResultMap<List<Commodity>> getAllAndInformation();

    /**
     * 添加商品 包含详细信息以及图片
     * @param pictures 多张图片
     * @param commodity 商品对象
     * @return 成功或者失败
     */
    ResultMap<List<String>> addCommodity(@RequestPart("pictures") MultipartFile[] pictures, @RequestPart("commodity") Commodity commodity);
}
