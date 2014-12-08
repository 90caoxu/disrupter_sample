package com.lycos.disrupter.demo;

import com.lmax.disruptor.EventFactory;

/** 
 * @ClassName: ValueEvent 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Lycos 
 * @date 2014年12月7日 下午9:37:15  
 */
public class ValueEvent {
	private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public final static EventFactory<ValueEvent> EVENT_FACTORY = new EventFactory<ValueEvent>() {
        public ValueEvent newInstance() {
            return new ValueEvent();
        }
    };
}

