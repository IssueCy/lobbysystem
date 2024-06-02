package de.merix.lobbysystem;

public class Data {

    public final String prefix =   "§8[§eCrafterCrew§8] ",
            noPerms =  prefix + "§cNah uh",
            noPlayer = prefix + "§cYou have to be a player";

    public Data() {

    }
    public String getPrefix() {
        return prefix;
    }
    public String getNoPerms(){return noPerms;}
    public String getNoPlayer(){return noPlayer;}
}