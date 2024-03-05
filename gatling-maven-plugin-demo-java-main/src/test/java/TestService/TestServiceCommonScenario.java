package TestService;
import io.gatling.javaapi.core.ScenarioBuilder;


import static io.gatling.javaapi.core.CoreDsl.scenario;

public class TestServiceCommonScenario {
    public static ScenarioBuilder test_scn = scenario("testResponse")
            .feed(TestServiceFeeders.dpr)
            .exec(TestServiceActions.testResponse);
}
