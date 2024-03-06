import NameService.CommonScenario;
import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.CoreDsl.incrementUsersPerSec;

public class DebugIncrementUserPerSec extends Simulation {

    {
     setUp(
                CommonScenario.test_scn.injectOpen(
                        incrementUsersPerSec(Sets.incrementUsersPerSec)
                                .times(Sets.times)
                                .eachLevelLasting(Sets.eachLevelLasting)
                                .separatedByRampsLasting(Sets.separatedByRampsLasting)
                                .startingFrom(Sets.startingFrom) // Double
                ).protocols(Protocols.google)
        );

    }
}
