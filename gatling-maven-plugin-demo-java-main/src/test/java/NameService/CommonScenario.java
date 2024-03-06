package NameService;
import io.gatling.javaapi.core.ScenarioBuilder;


import static io.gatling.javaapi.core.CoreDsl.scenario;

public class CommonScenario {
    public static ScenarioBuilder test_scn = scenario("testResponse")
            .feed(Feeders.dpr)
            .exec(Actions.testResponse);
}
