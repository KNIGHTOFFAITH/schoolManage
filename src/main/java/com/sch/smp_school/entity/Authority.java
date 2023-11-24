package com.sch.smp_school.entity;

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
 * @author hao
 * @since 2023-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("authority")
public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "auth_id", type = IdType.AUTO)
    private Integer authId;

    private String authName;

    private String authDesc;


}
