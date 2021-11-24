package testing;
import org.json.simple.parser.ParseException;

import java.io.IOException;
public class App {
    public static void main(String... args) throws IOException, InterruptedException, ParseException {
        Httpmodule newRequest = new Httpmodule("2");
        newRequest.getStarWarsPeople();
    }
}
