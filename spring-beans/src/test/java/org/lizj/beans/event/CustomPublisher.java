//package org.lizj.beans.event;
//
//import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.context.ApplicationEventPublisherAware;
//
///**
// * Spring 自定义事件：事件发布者
// */
//public class CustomPublisher implements ApplicationEventPublisherAware {
//
//    /**
//     * spring context 的事件发布者:
//     *    spring context 管理事件监听器的注册和删除
//     *    spring context 管理事件的传播
//     */
//    private ApplicationEventPublisher applicationEventPublisher;
//
//    /**
//     * 发布自定义的事件：CustomEvent
//     */
//    public void publish() {
//        CustomEvent customEvent = new CustomEvent(this, CustomPublisher.class.getName(), "publish");
//        applicationEventPublisher.publishEvent(customEvent);
//    }
//
//    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
//        this.applicationEventPublisher = applicationEventPublisher;
//    }
//}
