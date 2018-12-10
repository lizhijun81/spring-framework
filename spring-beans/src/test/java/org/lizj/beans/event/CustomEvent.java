//package org.lizj.beans.event;
//
//import org.springframework.context.ApplicationEvent;
//
///**
// * Spring 自定义事件：事件类型
// */
//public class CustomEvent extends ApplicationEvent {
//
//    private String clazzName;
//
//    private String methodName;
//
//    /**
//     * @param source 事件源：事件最初发生的地方的对象
//     * @param clazzName 自定义字段1
//     * @param methodName 自定义字段2
//     */
//    public CustomEvent(Object source, String clazzName, String methodName) {
//        super(source);
//        this.clazzName = clazzName;
//        this.methodName = methodName;
//    }
//
//    public String getClazzName() {
//        return clazzName;
//    }
//
//    public void setClazzName(String clazzName) {
//        this.clazzName = clazzName;
//    }
//
//    public String getMethodName() {
//        return methodName;
//    }
//
//    public void setMethodName(String methodName) {
//        this.methodName = methodName;
//    }
//
//    @Override
//    public String toString() {
//        return "CustomEvent{" +
//                "clazzName='" + clazzName + '\'' +
//                ", methodName='" + methodName + '\'' +
//                ", source=" + source +
//                '}';
//    }
//}
