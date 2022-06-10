package bankaya.example.pokemon.dto;

public class AbilityDTO {
  
  private ItemDTO ability;
  private Boolean is_hidden;
  private Integer slot;  

  public ItemDTO getAbility() {
    return ability;
  }

  public Boolean getHidden() {
    return is_hidden;
  }

  public Integer getSlot() {
    return slot;
  }
}
