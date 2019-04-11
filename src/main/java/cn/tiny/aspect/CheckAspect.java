package cn.tiny.aspect;


import cn.tiny.service.CheckAuthService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author tiny
 * date 2018/12/29 10:28
 */
@Aspect
@Component
public class CheckAspect {
    @Autowired
    CheckAuthService checkAuthService;

    @Pointcut("@annotation(CheckRoot)")
    public void check(){
    }
    @Pointcut("execution(* cn.tiny.service..*Service.*(..)) throws NumberFormatException")
    public void matchReturnException(){}


    @Before(value="check()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        if(method.isAnnotationPresent(CheckRoot.class)){
            CheckRoot checkRoot = method.getAnnotation(CheckRoot.class);
            checkRoot.value();
            //checkAuthService.checkAccess();
        }
    }
    @AfterThrowing("matchReturnException()")
    public void after(){
        System.out.println("#### after #####");
    }

}
