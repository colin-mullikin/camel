/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RestEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RestEndpoint target = (RestEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apidoc":
        case "apiDoc": target.setApiDoc(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bindingmode":
        case "bindingMode": target.setBindingMode(property(camelContext, org.apache.camel.spi.RestConfiguration.RestBindingMode.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumercomponentname":
        case "consumerComponentName": target.setConsumerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumes": target.setConsumes(property(camelContext, java.lang.String.class, value)); return true;
        case "description": target.setDescription(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "intype":
        case "inType": target.setInType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outtype":
        case "outType": target.setOutType(property(camelContext, java.lang.String.class, value)); return true;
        case "producercomponentname":
        case "producerComponentName": target.setProducerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "produces": target.setProduces(property(camelContext, java.lang.String.class, value)); return true;
        case "queryparameters":
        case "queryParameters": target.setQueryParameters(property(camelContext, java.lang.String.class, value)); return true;
        case "routeid":
        case "routeId": target.setRouteId(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
