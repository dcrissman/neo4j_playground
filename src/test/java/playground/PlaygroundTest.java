package playground;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.neo4j.springframework.boot.test.autoconfigure.data.AutoConfigureDataNeo4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import playground.model.Movie;
import playground.model.MovieRepository;
import playground.model.Person;
import playground.model.PersonRepository;
import playground.model.Roles;

/**
 * @see https://medium.com/neo4j/testing-your-neo4j-based-java-application-34bef487cc3c
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureDataNeo4j
public class PlaygroundTest {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void test() {
        Map<Person, Roles> actors = new HashMap<>();
        actors.put(Person.builder().name("Dennis").build(),
                Roles.builder().roles(Arrays.asList("The good guy!")).build());
        Movie createdMovie = movieRepository.save(Movie.builder()
                .title("A really cool movie")
                .actorsAndRoles(actors)
                .build());

        Movie foundMovie = movieRepository.findById(createdMovie.getId()).get();

        Person foundPersons = personRepository.findById(1L).get();

        assertTrue(true);
    }

}
