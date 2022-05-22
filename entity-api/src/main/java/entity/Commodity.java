package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wRan
 * @since 2022-05-22 12:39:17
 */
@Getter
@Setter
@Accessors(chain = true)
public class Commodity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 表述
     */
    private String describeText;

    /**
     * 封面地址
     */
    private String coverAddress;

    /**
     * 分类（枚举类型）
     * {
     *     数码产品 ：digital
     *     日用品 ：daily necessities
     * }
     */
    private String classification;


}
