package at.technikumwien;

import at.technikumwien.generated.*;

import javax.xml.bind.*;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.List;


/**
 * Created by Julia on 01.12.2016.
 */
public class MovieClient {

    public static void main ( String [] args ) throws Exception {

        //TODO: soll ein Kommandozeilenwerkzeug sein, d.h. irgendwie aus Kommandozeile den XML-Datei-Namen einlesen
        MovieWebService_Service service = new MovieWebService_Service();
        MovieWebService port = service.getMovieWebServicePort();

        //Einlesen aus der XML-Datei
        JAXBContext jaxbContext = JAXBContext.newInstance(MovieList.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Source source = new StreamSource(new File("movies.xml"));
        JAXBElement<MovieList> jaxbElement = unmarshaller.unmarshal(source, MovieList.class);
        MovieList movieListWrapper = jaxbElement.getValue();
        List<Movie> movieList = movieListWrapper.getMovie();
        System.out.println(movieList.get(0).getActors().getActor().get(0).getBirthdate());

        //senden an WebService
        //at first, server said: illegalArgumentException thrown by importMovies(), something about Gregorian Calendar
        //had to change type of BirthDate in generated entity Actor (hope that's okay)
        //for some reason, wsimport made this a GregorianCalendar type, but we want Date
        //now it's working!!!
        //man könnte das Ganze natürlich auch anders lösen
        //entweder am Server bei Actor auch GregorianCalender als Type für BirthDate nehmen
        //(ich nehme an, dann wäre das in der WSDL auch so angegeben und würde von hier aus gehen)
        //oder halt am Client einen Converter machen, der für alle Schauspieler den Typ von BirthDate
        //von GregorianCalender in Date umwandelt
        port.importMovies(movieListWrapper);

        //hier hab ich mal was probiert, weil irgendwozu ja die ImportMovies Klasse gut sein muss,
        // weiß nicht, ob dabei jetzt was anderes rauskommen würde
        /*ImportMovies importMovies = new ImportMovies();
        importMovies.setMovies(movieListWrapper);
        port.importMovies(importMovies.getMovies());*/

    }


}
