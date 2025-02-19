package projcet.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

@Getter
@Setter
public class BoardPostDto {

    @NotEmpty //빈 값이 들어가면 에러 발생
    private String title;

    @NotEmpty
    private String content;
}
