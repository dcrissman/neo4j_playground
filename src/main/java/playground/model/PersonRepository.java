package playground.model;

import org.neo4j.springframework.data.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

}
