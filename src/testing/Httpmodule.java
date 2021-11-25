package testing;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Httpmodule {
    private final URI peopleUrl;

    protected Httpmodule(String value) {
        String new_url_str = "https://swapi.dev/api/people/" + value + "/?format=json";
        this.peopleUrl = URI.create(new_url_str);
    }

    protected void getStarWarsPeople() throws IOException, InterruptedException, ParseException {
        JSONParser jsp = new JSONParser();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =
                HttpRequest.newBuilder()
                        .GET()
                        .header("accept", "application/json")
                        .uri(peopleUrl)
                        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject result = (JSONObject) jsp.parse(response.body());
        for (Object element : result.entrySet()) {
            System.out.println(element);
        }
    }
}
