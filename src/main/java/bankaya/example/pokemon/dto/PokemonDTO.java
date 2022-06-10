package bankaya.example.pokemon.dto;

import java.util.List;

public class PokemonDTO {

  private String id;
  private String name;
  private String location_area_encounters;
  private List<HeldItemDTO> held_items;
  private String base_experience;
  private List<AbilityDTO> abilities;


  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLocationAreaEncounters() {
    return location_area_encounters;
  }

  public List<HeldItemDTO> getItems() {
    return held_items;
  }

  public String getBaseExperience() {
    return base_experience;
  }

  public List<AbilityDTO> getAbilities() {
    return abilities;
  }
  
}
