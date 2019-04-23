package org.azhon.common.boot.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.azhon.common.api.R;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * 项目名:    hg_server
 * 包名       com.ziding.global
 * 文件名:    ValidatorAspect
 * 创建时间:  2018/11/23 on 上午9:31
 * 描述:     TODO
 *
 * @author ZJB
 */

@Aspect
@Component
public class ValidatorAspect {
    //环绕增强
    @Around(value = "execution(* org.azhon.*.controller.*.*(..)) && args(..,bindingResult)")
    public Object around(ProceedingJoinPoint pj, BindingResult bindingResult) throws Throwable {
        Object retVal;
        if (bindingResult.hasErrors()) {
            retVal = resultToList(bindingResult);
        } else {
            retVal = pj.proceed();
        }
        return retVal;
    }


    public R resultToList(BindingResult result) {
        List<FieldError> err = result.getFieldErrors();
        FieldError fe;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < err.size(); i++) {
            fe = err.get(i);
            builder.append(fe.getDefaultMessage());//得到错误消息
            builder.append(" ");
        }

        return R.fail(builder.toString());
    }
}
