import NameService.CommonScenario;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.CoreDsl.incrementUsersPerSec;

public class Debug extends Simulation {

    {
//        setUp(
//                CommonScenario.test_scn.injectOpen(
//                        CoreDsl.nothingFor(5),
//                        CoreDsl.rampUsersPerSec(0.1).to(TpsScn.PROFIL_scn * Sets.stepOne).during(Sets.ramp_stepOne),
//                        CoreDsl.constantUsersPerSec(TpsScn.PROFIL_scn * Sets.stepOne).during(Sets.during_stepOne),
//                        CoreDsl.rampUsersPerSec(0.1).to(TpsScn.PROFIL_scn * Sets.stepTwo).during(Sets.ramp_stepTwo),
//                        CoreDsl.constantUsersPerSec(TpsScn.PROFIL_scn * Sets.stepTwo).during(Sets.during_stepTwo)
//                ).protocols(Protocols.google)
//                        //.proxy(Proxy(Sets.host, Sets.port)))
//        );

        setUp(
                // generate an open workload injection profile
                // with levels of 10, 15, 20, 25 and 30 arriving users per second
                // each level lasting 10 seconds
                // separated by linear ramps lasting 10 seconds
                CommonScenario.test_scn.injectOpen(
                        incrementUsersPerSec(0.3)
                                .times(5)
                                .eachLevelLasting(10)
                                .separatedByRampsLasting(10)
                                .startingFrom(0) // Double
                )
        );

    }
}
