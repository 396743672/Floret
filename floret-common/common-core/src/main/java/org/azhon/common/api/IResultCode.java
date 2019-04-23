package org.azhon.common.api;

import java.io.Serializable;

/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.api
 * 文件名:    IResultCode
 * 创建时间:  2019/2/14 on 下午1:39
 * 描述:     TODO
 *
 * @author ZJB
 */
public interface IResultCode extends Serializable {

    /**
     * 消息
     *
     * @return String
     */
    String getMessage();

    /**
     * 状态码
     *
     * @return int
     */
    int getCode();

}
