package oi.hexled.xo;

public class Player {
    private final String name;

    private final Figer figer;

    public Player (final String name, final Figer figer){
        this.name = name;
        this.figer = figer;
    }
    public Figer getFiger(){
        return figer;
    }
    public String getName(){
        return name;
    }
}
