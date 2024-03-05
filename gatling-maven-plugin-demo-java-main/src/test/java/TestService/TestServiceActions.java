package TestService;

import io.gatling.javaapi.core.ChainBuilder;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class TestServiceActions {
    public static ChainBuilder testResponse =
            exec(http("name")
                    .get("/weather-moscow-4368/#{when}/ ")
                    .header("content-type", "application/json; charset = utf-8")
                    .check(status().is(200)));
}
