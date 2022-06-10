package bankaya.example.pokemon.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankaya.example.pokemon.model.Registry;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, UUID> {

}