import io.gatling.javaapi.http.HttpProtocolBuilder;
import static io.gatling.javaapi.http.HttpDsl.*;
public class Protocols {
    public static HttpProtocolBuilder google = http.baseUrl("https://www.gismeteo.ru")
            .acceptHeader("*/*");
}
