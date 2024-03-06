package NameService;

import io.gatling.javaapi.core.FeederBuilder;
import static io.gatling.javaapi.core.CoreDsl.csv;

public class Feeders {
    public static FeederBuilder dpr = csv("NameService/when.csv").circular();
}
