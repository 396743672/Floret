
package org.azhon.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 包名       org.azhon.system.entity
 * 文件名:    Dict
 * 创建时间:  2019-05-03
 * 描述:     TODO 字典实体类
 *
 * @author zjb
 */
@Data
@TableName("floret_dict")
@ApiModel(value = "Dict对象", description = "字典")
public class Dict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
  @ApiModelProperty(value = "主键")
  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;

    /**
     * 父主键
     */
  @ApiModelProperty(value = "父主键")
  private Integer parentId;

    /**
     * 字典码
     */
  @ApiModelProperty(value = "字典码")
  private String code;

    /**
     * 字典值
     */
  @ApiModelProperty(value = "字典值")
  private Integer dictKey;

    /**
     * 字典名称
     */
  @ApiModelProperty(value = "字典名称")
  private String dictValue;

    /**
     * 排序
     */
  @ApiModelProperty(value = "排序")
  private Integer sort;

    /**
     * 字典备注
     */
  @ApiModelProperty(value = "字典备注")
  private String remark;

    /**
     * 是否已删除
     */
  @ApiModelProperty(value = "是否已删除")
  private Integer isDeleted;



}
