package playground.model;

import java.util.List;

import org.neo4j.springframework.data.core.schema.RelationshipProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@RelationshipProperties
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Roles {

    private List<String> roles;
}
