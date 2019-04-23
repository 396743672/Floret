package org.azhon.common.utils;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.utils
 * 文件名:    BeanUtil
 * 创建时间:  2019/3/4 on 下午2:39
 * 描述:     TODO 异常处理工具类
 *
 * @author ZJB
 */
public class Exceptions {

    /**
     * 将CheckedException转换为UncheckedException.
     *
     * @param e Throwable
     * @return {RuntimeException}
     */
    public static RuntimeException unchecked(Throwable e) {
        if (e instanceof IllegalAccessException || e instanceof IllegalArgumentException
                || e instanceof NoSuchMethodException) {
            return new IllegalArgumentException(e);
        } else if (e instanceof InvocationTargetException) {
            return new RuntimeException(((InvocationTargetException) e).getTargetException());
        } else if (e instanceof RuntimeException) {
            return (RuntimeException) e;
        } else {
            return new RuntimeException(e);
        }
    }

    /**
     * 代理异常解包
     *
     * @param wrapped 包装过得异常
     * @return 解包后的异常
     */
    public static Throwable unwrap(Throwable wrapped) {
        Throwable unwrapped = wrapped;
        while (true) {
            if (unwrapped instanceof InvocationTargetException) {
                unwrapped = ((InvocationTargetException) unwrapped).getTargetException();
            } else if (unwrapped instanceof UndeclaredThrowableException) {
                unwrapped = ((UndeclaredThrowableException) unwrapped).getUndeclaredThrowable();
            } else {
                return unwrapped;
            }
        }
    }
//
//	/**
//	 * 将ErrorStack转化为String.
//	 *
//	 * @param ex Throwable
//	 * @return {String}
//	 */
//	public static String getStackTraceAsString(Throwable ex) {
//		FastStringWriter stringWriter = new FastStringWriter();
//		ex.printStackTrace(new PrintWriter(stringWriter));
//		return stringWriter.toString();
//	}

}
