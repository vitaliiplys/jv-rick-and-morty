package mate.academy.rickandmorty.dto.external;

import java.util.List;
import lombok.Data;

@Data
public class ExternalCharacterDataDto {
    private List<ExternalCharacterDto> results;
}