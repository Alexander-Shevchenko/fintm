package org.alexthunder.fintm.team;

import java.util.Objects;

public record Player(long id, String name) {
    public Player {
        Objects.requireNonNull(name);
    }
}
