package be.vdab.advancedtaken.forms;

import be.vdab.advancedtaken.constraints.OndernemingsNr;
import javax.validation.constraints.NotNull;

public class OndernemingsNrForm {
    @NotNull @OndernemingsNr
    private final Long ondernemingsNr;

    public OndernemingsNrForm(@NotNull Long ondernemingsNr) {
        this.ondernemingsNr = ondernemingsNr;
    }

    public Long getOndernemingsNr() {
        return ondernemingsNr;
    }
}
