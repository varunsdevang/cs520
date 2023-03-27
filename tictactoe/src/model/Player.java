package model;

public enum Player {
    Player1("1"),
    Player2("2");

    private String value;
    Player(String val){
        this.value = val;
    }

    public String toString(){
        return this.value;
    }
}
