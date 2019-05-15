# metrics-compatibility

A library that attempts to provide a compatibility shim, that provides compatibility for the current and previous major version of the Metrics library. 

## Usage
You should add a **runtime** dependency on this library to your project.

Maven:
```xml
<dependency>
  <groupId>io.dropwizard.metrics</groupId>
  <artifactId>metrics-compatibility</artifactId>
  <version>${metrics.version}</version>
  <scope>runtime</scope>
</dependency>
```

## Metrics 4
This version of the compatibility library is intended to provide a shim to allow for easier migration from metrics3 -> metrics4.

## Note
Two areas where exact compatibility is not possible are:
* **com.codahale.metrics.Clock$CpuTimeClock**; this static inner class was removed in Metrics 4, and it is not possible to provide a shim for.
* **com.codahale.metrics.JmxReporter**; Due to a private constructor, this class had to be duplicated. Please try to move to using com.codahale.metrics.jmx.JmxReporter wherever possible.
