package com.example.usuario.inventory.pojo;

/**
 * @author Alfonso Chamorro Valle
 * Clase pojo de las dependencias
 */

public class Dependency {

    private int _ID;
    private String name;
    private String shortname;
    private String description;

    public Dependency(int _ID, String name, String shortname, String description) {
        this._ID = _ID;
        this.name = name;
        this.shortname = shortname;
        this.description = description;
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortname;
    }

    public void setShortName(String shortname) {
        this.shortname = shortname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NAME: " + name + '\n' + "SHORTNAME: " + shortname + '\n' + "DESCRIPTION: " + description;
    }
}
