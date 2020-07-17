package playground.model;

import java.util.HashMap;
import java.util.Map;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;
import org.neo4j.springframework.data.core.schema.Relationship.Direction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    
    @Relationship(type = "ACTED_IN", direction = Direction.INCOMING)
    @Builder.Default
    private Map<Movie, Roles> moviesAndRoles = new HashMap<>();
    
}
