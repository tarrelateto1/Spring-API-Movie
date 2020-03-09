package tar.Movie.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("user")
public class User {

    @Id
    private String id;
    private String name;
    private int phone;
    private String address;

}
