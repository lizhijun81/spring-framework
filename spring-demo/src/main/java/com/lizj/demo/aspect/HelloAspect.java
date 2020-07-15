package com.lizj.demo.aspect;

@Aspect
public class HelloAspect {

    // 只拦截service层的所有方法
    @Pointcut("execution(* com.fsx.service.*.*(..)) ")
    public void point() {

    }

    @Before("point()")
    public void before() {
        System.out.println("this is from HelloAspect#before...");
    }

    @After("point()")
    public void after() {
        System.out.println("this is from HelloAspect#after...");
    }

    @AfterReturning("point()")
    public void afterReturning() {
        System.out.println("this is from HelloAspect#afterReturning...");
    }

    @AfterThrowing("point()")
    public void afterThrowing() {
        System.out.println("this is from HelloAspect#afterThrowing...");
    }

	// 此处需要注意：若写了@Around方法，那么最后只会执行@Around和@AfterReturning 其它的都不会执行
    //@Around("point()")
    //public void around() {
    //    System.out.println("this is from HelloAspect#around...");
    //}

}
