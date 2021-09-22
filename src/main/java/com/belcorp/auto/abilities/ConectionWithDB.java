package com.belcorp.auto.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

import java.sql.Connection;

public class ConectionWithDB implements Ability {

    private Connection connection;

    public Connection getManager() {
        return connection;
    }

    public static ConectionWithDB as(Actor actor) {
        return actor.abilityTo(ConectionWithDB.class);
    }
}
