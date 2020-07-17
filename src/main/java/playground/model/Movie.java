package playground.model;

import java.util.HashMap;
import java.util.Map;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue
    private Long id;
    
    private String title;
    
    @Relationship(type = "ACTED_IN")
    @Builder.Default
    private Map<Person, Roles> actorsAndRoles = new HashMap<>();
    
}
