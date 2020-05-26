package me.topits.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 
 *
 * @author Wang Ziyue
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ImDemo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("is_delete")
    private Boolean isDelete;

    @TableField("add_time")
    private Date addTime;

    @TableField("update_time")
    private Date updateTime;

    @TableField("name")
    private String name;

    @TableField("user_mobile_mask")
    private String userMobileMask;

    @TableField("user_mobile_md5")
    private String userMobileMd5;


    /**  */
    public static final String ID = "id";

    /**  */
    public static final String IS_DELETE = "is_delete";

    /**  */
    public static final String ADD_TIME = "add_time";

    /**  */
    public static final String UPDATE_TIME = "update_time";

    /**  */
    public static final String NAME = "name";

    /**  */
    public static final String USER_MOBILE_MASK = "user_mobile_mask";

    /**  */
    public static final String USER_MOBILE_MD5 = "user_mobile_md5";

}
