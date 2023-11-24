package org.py.mymodule.submodule.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2023-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ra")
public class Ra implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ra_id", type = IdType.AUTO)
    private Integer raId;

    private Integer roleId;

    private Integer authId;


}
