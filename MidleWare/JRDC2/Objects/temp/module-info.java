module b4j {
requires java.base;
requires java.desktop;
requires java.instrument;
requires java.logging;
requires java.management;
requires java.naming;
requires java.rmi;
requires java.security.jgss;
requires java.sql;
requires java.transaction.xa;
requires java.xml;
exports com.xjobfinderjrdc2;
uses jakarta.servlet.ServletContainerInitializer;
uses jakarta.websocket.ContainerProvider;
uses java.sql.Driver;
uses org.eclipse.jetty.http.HttpFieldPreEncoder;
uses org.eclipse.jetty.webapp.Configuration;
uses org.eclipse.jetty.websocket.core.Extension;
uses org.slf4j.spi.SLF4JServiceProvider;
}