package com.domain;

public enum Alianza {
    ONEWORLD(1,"Oneworld"),
    SKYTEAM(2,"SkyTeam"),
    STARALLIANCE(3,"Star Alliance");

    public final String alianza;
    public final int id;
    
    private Alianza (int id, String alianza){
    	this.id = id;
        this.alianza = alianza;
    }
}
