import NameService.CommonScenario;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.CoreDsl.incrementUsersPerSec;

public class Debug extends Simulation {

    {
        setUp(
                CommonScenario.test_scn.injectOpen(
                        CoreDsl.nothingFor(5),
                        CoreDsl.rampUsersPerSec(0.1).to(TpsScn.PROFIL_scn * Sets.stepOne).during(Sets.ramp_stepOne),
                        CoreDsl.constantUsersPerSec(TpsScn.PROFIL_scn * Sets.stepOne).during(Sets.during_stepOne),
                        CoreDsl.rampUsersPerSec(0.1).to(TpsScn.PROFIL_scn * Sets.stepTwo).during(Sets.ramp_stepTwo),
                        CoreDsl.constantUsersPerSec(TpsScn.PROFIL_scn * Sets.stepTwo).during(Sets.during_stepTwo)
                ).protocols(Protocols.google)
                        //.proxy(Proxy(Sets.host, Sets.port)))
        );
    }
}
