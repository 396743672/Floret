package org.azhon.common.utils;

import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.util.function.Supplier;


/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.utils
 * 文件名:    Lazy
 * 创建时间:  2019/3/4 on 下午2:39
 * 描述:     TODO Holder of a value that is computed lazy.
 *
 * @author ZJB
 */
public class Lazy<T> implements Supplier<T>, Serializable {

    @Nullable
    private transient volatile Supplier<? extends T> supplier;
    @Nullable
    private T value;

    /**
     * Creates new instance of Lazy.
     *
     * @param supplier Supplier
     * @param <T>      泛型标记
     * @return Lazy
     */
    public static <T> Lazy<T> of(final Supplier<T> supplier) {
        return new Lazy<>(supplier);
    }

    private Lazy(final Supplier<T> supplier) {
        this.supplier = supplier;
    }

    /**
     * Returns the value. Value will be computed on first call.
     *
     * @return lazy value
     */
    @Nullable
    @Override
    public T get() {
        return (supplier == null) ? value : computeValue();
    }

    @Nullable
    private synchronized T computeValue() {
        final Supplier<? extends T> s = supplier;
        if (s != null) {
            value = s.get();
            supplier = null;
        }
        return value;
    }

}
