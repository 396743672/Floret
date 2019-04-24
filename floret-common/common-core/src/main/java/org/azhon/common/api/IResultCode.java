package org.azhon.common.api;

import java.io.Serializable;

/**
 * 项目名:    Floret
 * 包名       org.azhon.common.api
 * 文件名:    IResultCode
 * 创建时间:  2019-04-24 on 09:20
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
