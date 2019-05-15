package com.codahale.metrics;

import javax.management.ObjectName;

public class JmxAttributeGauge extends com.codahale.metrics.jvm.JmxAttributeGauge {
    public JmxAttributeGauge(final ObjectName objectName, final String attributeName) {
        super(objectName, attributeName);
    }
}
