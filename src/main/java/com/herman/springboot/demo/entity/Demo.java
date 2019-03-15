package com.herman.springboot.demo.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: herman
 * @Description:
 * @Date: 2019/3/15
 */
@Data
public class Demo implements Serializable {
    private String id;
    private boolean isDeleted;
    private Date gmtCreate;
    private Date gmtModified;
}
