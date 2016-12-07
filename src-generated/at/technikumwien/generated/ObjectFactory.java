
package at.technikumwien.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.technikumwien.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllMovies_QNAME = new QName("http://service.technikumwien.at/", "getAllMovies");
    private final static QName _SearchMoviesByTitleResponse_QNAME = new QName("http://service.technikumwien.at/", "searchMoviesByTitleResponse");
    private final static QName _ImportMoviesResponse_QNAME = new QName("http://service.technikumwien.at/", "importMoviesResponse");
    private final static QName _ImportMovies_QNAME = new QName("http://service.technikumwien.at/", "importMovies");
    private final static QName _SearchMoviesByTitle_QNAME = new QName("http://service.technikumwien.at/", "searchMoviesByTitle");
    private final static QName _GetAllMoviesResponse_QNAME = new QName("http://service.technikumwien.at/", "getAllMoviesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.technikumwien.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link ImportMovies }
     * 
     */
    public ImportMovies createImportMovies() {
        return new ImportMovies();
    }

    /**
     * Create an instance of {@link SearchMoviesByTitle }
     * 
     */
    public SearchMoviesByTitle createSearchMoviesByTitle() {
        return new SearchMoviesByTitle();
    }

    /**
     * Create an instance of {@link GetAllMoviesResponse }
     * 
     */
    public GetAllMoviesResponse createGetAllMoviesResponse() {
        return new GetAllMoviesResponse();
    }

    /**
     * Create an instance of {@link SearchMoviesByTitleResponse }
     * 
     */
    public SearchMoviesByTitleResponse createSearchMoviesByTitleResponse() {
        return new SearchMoviesByTitleResponse();
    }

    /**
     * Create an instance of {@link GetAllMovies }
     * 
     */
    public GetAllMovies createGetAllMovies() {
        return new GetAllMovies();
    }

    /**
     * Create an instance of {@link ImportMoviesResponse }
     * 
     */
    public ImportMoviesResponse createImportMoviesResponse() {
        return new ImportMoviesResponse();
    }

    /**
     * Create an instance of {@link Studio }
     * 
     */
    public Studio createStudio() {
        return new Studio();
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link MovieList }
     * 
     */
    public MovieList createMovieList() {
        return new MovieList();
    }

    /**
     * Create an instance of {@link Movie.Actors }
     * 
     */
    public Movie.Actors createMovieActors() {
        return new Movie.Actors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.technikumwien.at/", name = "getAllMovies")
    public JAXBElement<GetAllMovies> createGetAllMovies(GetAllMovies value) {
        return new JAXBElement<GetAllMovies>(_GetAllMovies_QNAME, GetAllMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMoviesByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.technikumwien.at/", name = "searchMoviesByTitleResponse")
    public JAXBElement<SearchMoviesByTitleResponse> createSearchMoviesByTitleResponse(SearchMoviesByTitleResponse value) {
        return new JAXBElement<SearchMoviesByTitleResponse>(_SearchMoviesByTitleResponse_QNAME, SearchMoviesByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.technikumwien.at/", name = "importMoviesResponse")
    public JAXBElement<ImportMoviesResponse> createImportMoviesResponse(ImportMoviesResponse value) {
        return new JAXBElement<ImportMoviesResponse>(_ImportMoviesResponse_QNAME, ImportMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.technikumwien.at/", name = "importMovies")
    public JAXBElement<ImportMovies> createImportMovies(ImportMovies value) {
        return new JAXBElement<ImportMovies>(_ImportMovies_QNAME, ImportMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMoviesByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.technikumwien.at/", name = "searchMoviesByTitle")
    public JAXBElement<SearchMoviesByTitle> createSearchMoviesByTitle(SearchMoviesByTitle value) {
        return new JAXBElement<SearchMoviesByTitle>(_SearchMoviesByTitle_QNAME, SearchMoviesByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.technikumwien.at/", name = "getAllMoviesResponse")
    public JAXBElement<GetAllMoviesResponse> createGetAllMoviesResponse(GetAllMoviesResponse value) {
        return new JAXBElement<GetAllMoviesResponse>(_GetAllMoviesResponse_QNAME, GetAllMoviesResponse.class, null, value);
    }

}
