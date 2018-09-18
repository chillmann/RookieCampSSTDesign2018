package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import io.swagger.annotations.ApiParam;

/**
 * TODO: comment
 *
 * @author stefan.billet@qaware.de
 * @since 18.09.2018
 */
public class Beverage {
    private int id;
    private String name;

    public Beverage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
