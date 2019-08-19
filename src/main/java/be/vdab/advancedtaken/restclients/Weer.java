package be.vdab.advancedtaken.restclients;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Weer {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    public Main getMain() {
        return main;
    }
}
