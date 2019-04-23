package org.azhon.common.support;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.support
 * 文件名:    BeanProperty
 * 创建时间:  2019/3/4 on 下午2:39
 * 描述:     TODO Bean属性
 *
 * @author ZJB
 */
@Getter
@AllArgsConstructor
public class BeanProperty {
	private final String name;
	private final Class<?> type;
}
