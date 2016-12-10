package at.technikumwien;

import at.technikumwien.generated.Actor;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

/**
 * Created by Julia on 10.12.2016.
 */
public class MovieResourceClient {
    public static void main(String[] args) throws Exception {
        WebTarget target = ClientBuilder
                .newClient()
                .target("http://localhost:8080/MovieServiceWebApp_war_exploded/resources/actor");

        Actor actor = target
                .path("/{actorId}")
                .resolveTemplate("actorId", 1)
                .request(MediaType.APPLICATION_JSON)
                .get(Actor.class);

        System.out.println(actor.getBirthdate());

        Actor newActor = new Actor();
        newActor.setFirstname("Jimmy");
        newActor.setLastname("Doe");
        newActor.setSex("MALE");
        newActor.setBirthdate(new Date());

        Response response = target
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.json(newActor));
        System.out.println(response.getLocation());
    }

}
