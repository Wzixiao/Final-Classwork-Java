package com.we.shopservice.tools;

import config.ResultMap;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author wRan
 * @since 2022/5/22 22:52
 */
@Component("picturesSaveTools")
public class PicturesSaveTools {
    final int MAX_QUANTITY = 6;

    /**
     * 保存图片
     *
     * @param pictures 多个图片
     * @return {
     * 成功：返回携带所有图片名称的ResultMap，
     * 失败：返回空数据和错误信息的ResultMap
     * }
     */
    public ResultMap<List<String>> save(MultipartFile[] pictures) {
        if (pictures == null || pictures.length == 0) {
            return ResultMap.build(ResultMap.Status.FAIL, "传入数据不可为空！");
        } else if (pictures.length > MAX_QUANTITY) {
            return ResultMap.build(ResultMap.Status.FAIL, "传入数据不能大于六个！");
        }
        String path = System.getProperty("user.dir") + "\\shop-service\\src\\main\\resources\\static\\cover\\";
        File realPath = new File(path);
        if (!realPath.exists()) {
            boolean mkdirs = realPath.mkdirs();
            if (!mkdirs) {
                return ResultMap.build(ResultMap.Status.FAIL, "创建目录失败！");
            }
        }

        List<String> names = new ArrayList<>();
        for (MultipartFile picture : pictures) {
            String originalFilename = picture.getOriginalFilename();
            try {
                String s = UUID.randomUUID() + originalFilename;
                picture.transferTo(new File(realPath + "/" + s));
                names.add(s);
            } catch (IOException e) {
                return ResultMap.build(ResultMap.Status.FAIL, "保存失败！");
            }
        }
        return ResultMap.build(ResultMap.Status.SUCCESS, names);

    }

}
