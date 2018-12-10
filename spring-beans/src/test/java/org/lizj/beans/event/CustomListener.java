//package org.lizj.beans.event;
//
//import org.springframework.context.ApplicationListener;
//
///**
// * Spring 自定义对应事件：对应事件监听器
// *     Spring context 会自动识别继承自ApplicationListener并且将其注册到Spring context，
// *     Spring context 统一管理事件监听器
// */
//public class CustomListener implements ApplicationListener<CustomEvent> {
//
//    public void onApplicationEvent(CustomEvent event) {
//        System.out.println("***自定义监听器 CustomListener 执行, 事件为：" + event.toString() + "***");
//    }
//
//}
