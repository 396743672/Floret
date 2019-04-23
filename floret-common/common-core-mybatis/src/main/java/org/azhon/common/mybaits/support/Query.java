package org.azhon.common.mybaits.support;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.support
 * 文件名:    Query
 * 创建时间:  2019/3/4 on 下午2:39
 * 描述:     TODO 分页工具
 *
 * @author ZJB
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "查询条件")
public class Query {

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页")
    private Integer current = 1;

    /**
     * 每页的数量
     */
    @ApiModelProperty(value = "每页的数量")
    private Integer size = 10;

    /**
     * 排序的字段名
     */
    @ApiModelProperty(hidden = true)
    private String ascs;

    /**
     * 排序方式
     */
    @ApiModelProperty(hidden = true)
    private String descs;

}
