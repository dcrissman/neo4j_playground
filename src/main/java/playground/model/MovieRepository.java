package playground.model;

import org.neo4j.springframework.data.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {

}
