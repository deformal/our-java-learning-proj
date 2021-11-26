package testing;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

public class App {
    public static void main(String... args)
            throws IOException, InterruptedException, ParseException {
        // for the http class
        Httpmodule newRequest = new Httpmodule("5"); // fetches data for luke skywalker
        newRequest.getStarWarsPeople();
        Men saurabh = new Men("Saurabh", "Jainwal", 20);
        // for the Men class
        String response1 = saurabh.isDisabled();
        System.out.println(response1);
        HashMap<String, String> response2 = saurabh.displayDetails();
        for (String element : response2.values()) {
            System.out.println(element);
        }
        // for the car class
        Car audi = new Car("r8", true, "2021");
        HashMap<String, String> response3 = audi.vehicleDetails();
        for (String element : response3.values()) {
            System.out.println(element);
        }
    }
}
