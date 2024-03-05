package TestService;

import io.gatling.javaapi.core.FeederBuilder;

import static io.gatling.javaapi.core.CoreDsl.csv;

public class TestServiceFeeders {
    public static FeederBuilder dpr = csv("TestService/when.csv").circular();
}
