package at.technikumwien;

import at.technikumwien.generated.*;

import javax.xml.bind.*;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;


/**
 * Created by Julia on 01.12.2016.
 */
public class MovieClient {

    public static void main ( String [] args ) throws Exception {

        MoviesAuthenticator.setAsDefault("BSWrite", "123");

        System.out.println("Filename is: ");

        if(args.length > 0) {
            for(String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No args to print");
        }

        final String XML_FILE = args[0];

        MovieWebService_Service service = new MovieWebService_Service();
        MovieWebService port = service.getMovieWebServicePort();

        //Einlesen aus der XML-Datei
        JAXBContext jaxbContext = JAXBContext.newInstance(MovieList.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Source source = new StreamSource(new File(XML_FILE));
        JAXBElement<MovieList> jaxbElement = unmarshaller.unmarshal(source, MovieList.class);
        MovieList movieListWrapper = jaxbElement.getValue();
        List<Movie> movieList = movieListWrapper.getMovie();
        //System.out.println(movieList.get(0).getActors().getActor().get(0).getBirthdate());

        //senden an WebService
        //had to change type of BirthDate in generated entity Actor (hope that's okay)
        //for some reason, wsimport made this a GregorianCalendar type, but we want Date
        //man könnte das Ganze natürlich auch anders lösen

        port.importMovies(movieListWrapper);

    }


}
