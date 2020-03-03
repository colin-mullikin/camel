/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hazelcast.seda;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HazelcastSedaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        HazelcastSedaEndpoint target = (HazelcastSedaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.getConfiguration().setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "defaultoperation":
        case "defaultOperation": target.setDefaultOperation(property(camelContext, org.apache.camel.component.hazelcast.HazelcastOperation.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "hazelcastinstance":
        case "hazelcastInstance": target.setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastinstancename":
        case "hazelcastInstanceName": target.setHazelcastInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "onerrordelay":
        case "onErrorDelay": target.getConfiguration().setOnErrorDelay(property(camelContext, int.class, value)); return true;
        case "polltimeout":
        case "pollTimeout": target.getConfiguration().setPollTimeout(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transacted": target.getConfiguration().setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transferexchange":
        case "transferExchange": target.getConfiguration().setTransferExchange(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
