import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorConexion {

    public MonedaDTO buscarMoneda(String monedaOrigen, String monedaDestino) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b9ecb0b37a6e8473c24792ee/pair/" + monedaOrigen + "/" + monedaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return  new Gson().fromJson(response.body(), MonedaDTO.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontró la Moneda");
        }
    }

}

