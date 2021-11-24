package testing;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Httpmodule {
    private final URI people_url;
    private final String new_url_str;
    protected Httpmodule(String value) {
        this.new_url_str = "https://swapi.dev/api/people/" + value + "/?format=json";
        this.people_url = URI.create(new_url_str);
    }
    protected void getStarWarsPeople() throws IOException, InterruptedException, ParseException {
        JSONParser jsp = new JSONParser();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().GET().header("accept", "application/json").uri(people_url)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject result = (JSONObject) jsp.parse(response.body());
        Object name = result.get("name");
        System.out.println(name);
    }
}