import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeDivisas {
    public Divisas buscarDivisas(String divisaBase, String divisaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/76f93d76fafb3327e410f519/pair/"
                +divisaBase+"/"+divisaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri (direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisas.class);
        } catch (Exception e){
            throw new RuntimeException("No encontré la moneda");
        }
    }
}
