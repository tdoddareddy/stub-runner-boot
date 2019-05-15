package io.pivotal.stubrunner;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.contract.stubrunner.HttpServerStubConfiguration;
import org.springframework.cloud.contract.stubrunner.provider.wiremock.WireMockHttpServerStubConfigurer;
import org.springframework.util.SocketUtils;

public class HttpStubConfigurer extends WireMockHttpServerStubConfigurer {

    Logger logger = LoggerFactory
            .getLogger(HttpStubConfigurer.class);

    public WireMockConfiguration configure(WireMockConfiguration httpStubConfiguration, HttpServerStubConfiguration httpServerStubConfiguration) {

        logger.info("wiremockconfiguration -- " + httpServerStubConfiguration.stubConfiguration.getArtifactId());

        if (httpServerStubConfiguration.stubConfiguration.getArtifactId() == "fortune-service") {
            int httpsPort = SocketUtils.findAvailableTcpPort();
            logger.info("Will set HTTPs port [" + httpsPort + "] for fortune-service");
            return httpStubConfiguration
                    .httpsPort(httpsPort);
        }
        return httpStubConfiguration;
    }
}
