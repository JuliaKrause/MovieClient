
package at.technikumwien.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für importMovies complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="importMovies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movies" type="{http://service.technikumwien.at/}movieList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importMovies", propOrder = {
    "movies"
})
public class ImportMovies {

    protected MovieList movies;

    /**
     * Ruft den Wert der movies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MovieList }
     *     
     */
    public MovieList getMovies() {
        return movies;
    }

    /**
     * Legt den Wert der movies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieList }
     *     
     */
    public void setMovies(MovieList value) {
        this.movies = value;
    }

}
