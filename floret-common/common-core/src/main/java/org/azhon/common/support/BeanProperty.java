package org.azhon.common.support;

import lombok.AllArgsConstructor;
import lombok.Getter;



/**
 * 项目名:    Floret
 * 包名       org.azhon.common.support
 * 文件名:    BeanProperty
 * 创建时间:  2019-04-24 on 09:19
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
