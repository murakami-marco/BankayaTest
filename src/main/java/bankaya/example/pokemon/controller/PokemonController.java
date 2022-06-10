package bankaya.example.pokemon.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import bankaya.example.pokemon.dto.PokemonDTO;
import bankaya.example.pokemon.model.Registry;
import bankaya.example.pokemon.repository.RegistryRepository;
import bankaya.example.pokemon.services.PokemonService;

@RestController
@RequestMapping("/pokemon")

public class PokemonController {

  private PokemonService pokemonService;

  @Autowired
  RegistryRepository registryRepository;
  
  @GetMapping("/{name}")
  public Object getName(@PathVariable String name, HttpServletRequest request) {
    pokemonService = new PokemonService();
    Object response = pokemonService.getInfo(name);

    if (response != null) {
      Gson gson = new Gson();
      PokemonDTO pokemon = gson.fromJson(response.toString(), PokemonDTO.class);
      storeRequestData(request.getRemoteAddr(), new Date(), "getName");

      return pokemon.getName();
    }

    return "Not found";
  }

  @GetMapping("/{name}/id")
  public Object getID(@PathVariable String name, HttpServletRequest request) {
    pokemonService = new PokemonService();
    Object response = pokemonService.getInfo(name);

    if (response != null) {
      Gson gson = new Gson();
      PokemonDTO pokemon = gson.fromJson(response.toString(), PokemonDTO.class);
      storeRequestData(request.getRemoteAddr(), new Date(), "getID");

      return pokemon.getId();
    }

    return "Not found";
  }

  @GetMapping("/{name}/locations")
  public Object getLocations(@PathVariable String name, HttpServletRequest request) {
    pokemonService = new PokemonService();
    Object response = pokemonService.getInfo(name);

    if (response != null) {
      Gson gson = new Gson();
      PokemonDTO pokemon = gson.fromJson(response.toString(), PokemonDTO.class);
      storeRequestData(request.getRemoteAddr(), new Date(), "getLocations");

      return pokemon.getLocationAreaEncounters();
    }

    return "Not found";
  }

  @GetMapping("/{name}/items")
  public Object getItems(@PathVariable String name, HttpServletRequest request) {
    pokemonService = new PokemonService();
    Object response = pokemonService.getInfo(name);

    if (response != null) {
      Gson gson = new Gson();
      PokemonDTO pokemon = gson.fromJson(response.toString(), PokemonDTO.class);
      storeRequestData(request.getRemoteAddr(), new Date(), "getItems");

      return pokemon.getItems();
    }

    return "Not found";
  }

  @GetMapping("/{name}/experience")
  public Object getBaseExperience(@PathVariable String name, HttpServletRequest request) {
    pokemonService = new PokemonService();
    Object response = pokemonService.getInfo(name);

    if (response != null) {
      Gson gson = new Gson();
      PokemonDTO pokemon = gson.fromJson(response.toString(), PokemonDTO.class);
      storeRequestData(request.getRemoteAddr(), new Date(), "getBaseExperience");

      return pokemon.getBaseExperience();
    }

    return "Not found";
  }

  @GetMapping("/{name}/abilities")
  public Object getAbilities(@PathVariable String name, HttpServletRequest request) {
    pokemonService = new PokemonService();
    Object response = pokemonService.getInfo(name);

    if (response != null) {
      Gson gson = new Gson();
      PokemonDTO pokemon = gson.fromJson(response.toString(), PokemonDTO.class);
      storeRequestData(request.getRemoteAddr(), new Date(), "getAbilities");

      return pokemon.getAbilities();
    }

    return "Not found";
  }

  private void storeRequestData(String ipAddress, Date requestDate, String method) {
    Registry registry = new Registry(ipAddress, requestDate, method);
    registryRepository.save(registry);
  }
}
