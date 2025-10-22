package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonProperty("Title") String titulo,
                         @JsonProperty("Year") String anoLancamento,
                         @JsonProperty("Genre") String genero,
                         @JsonProperty("totalSeasons") Integer totalTemporadas,
                         @JsonProperty("imbdRating") String avaliacao)
    {
}
