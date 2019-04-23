package org.azhon.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.api
 * 文件名:    ResultCode
 * 创建时间:  2019/2/14 on 下午1:39
 * 描述:     TODO 业务代码枚举
 *
 * @author ZJB
 */
@Getter
@AllArgsConstructor
public enum ResultCode implements IResultCode {

    /**
     * 操作成功
     */
    SUCCESS(1, "操作成功"),

    /**
     * 业务异常
     */
    FAILURE(-1, "业务异常"),

    /**
     * 暂无数据
     */
    NO_DATA(0, "暂无数据"),

    /**
     * 404 没找到请求
     */
    NOT_FOUND(404, "404 没找到请求"),


    /**
     * 不支持当前请求方法
     */
    METHOD_NOT_SUPPORTED(405, "不支持当前请求方法"),

    /**
     * 不支持当前媒体类型
     */
    MEDIA_TYPE_NOT_SUPPORTED(415, "不支持当前媒体类型"),

    /**
     * 请求被拒绝
     */
    REQ_REJECT(403, "请求被拒绝"),

    /**
     * 服务器异常
     */
    INTERNAL_SERVER_ERROR(500, "服务器异常"),

    /**
     * 缺少必要的请求参数
     */
    PARAM_MISS(-1, "缺少必要的请求参数"),

    /**
     * 请求参数类型错误
     */
    PARAM_TYPE_ERROR(-1, "请求参数类型错误"),

    /**
     * 请求参数绑定错误
     */
    PARAM_BIND_ERROR(-1, "请求参数绑定错误"),

    /**
     * 参数校验失败
     */
    PARAM_VALID_ERROR(-1, "参数校验失败"),;

    /**
     * code编码
     */
    final int code;
    /**
     * 中文信息描述
     */
    final String message;

}
