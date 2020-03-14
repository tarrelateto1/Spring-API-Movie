package tar.Movie.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "movies")
public class Movie {
    @Id
    private ObjectId _id;
    private String name;
    private String urlImage;
    private Integer create;
    private Integer rating;

}
