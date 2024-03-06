package NameService;

import io.gatling.javaapi.core.Choice;
import io.gatling.javaapi.core.ScenarioBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;

public class CommonScenario {
    public static Integer repeats = 2;//количество повторений в цикле
    public static ScenarioBuilder test_scn = scenario("testResponse")
            .pause(1)
            //Пример цикла
            .doWhile(session -> session.getInt("counter") < repeats, "counter").on(
                    //Распределение по вариантам, указывается процент, в сусмме = 100.0
                    randomSwitch().on(
                            Choice.withWeight(50.0,
                                    feed(Feeders.dpr)
                                            .group("testResponseGroupe_exitHereIfFailed").on(
                                                    exec(Actions.testResponse).exitHereIfFailed()
                                            )
                            ),
                            Choice.withWeight(50.0,
                                    feed(Feeders.dpr)
                                            .group("testResponseGroupe_Print").on(
                                                    exec(Actions.testResponse)
                                                            //Печать
                                                            .exec(session -> {
                                                                        System.out.println(session.getString("when"));
                                                                        return session;
                                                                    }
                                                            )
                                            )
                            )
                    )

            );

}
