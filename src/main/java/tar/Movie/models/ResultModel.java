package tar.Movie.models;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ResultModel implements Serializable {
    private String message;
    private Object result;
}
