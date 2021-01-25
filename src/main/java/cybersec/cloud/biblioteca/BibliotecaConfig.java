package cybersec.cloud.biblioteca;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class BibliotecaConfig extends Configuration {
    
    private String descrizionePredefinita;
    
    @JsonProperty
    public String getDescrizionePredefinita() {
        return this.descrizionePredefinita;
    }
    
}
