package cn.opm.mybatis.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
public class Emp {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    @TableLogic
    private Integer flag;

    private String name;

    private Integer age;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

}