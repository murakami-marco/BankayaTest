package bankaya.example.pokemon.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokemonService {
  
  private String POKEMON_URL = "https://pokeapi.co/api/v2/pokemon";

  public Object getInfo(String name) {
    Object resp = null;
    
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
    .GET()
    .uri(URI.create(POKEMON_URL + "/" + name))
    .build();

    try {
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

      if (response.statusCode() == 200) {
        resp = response.body();
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }

    return resp;
  }
}
