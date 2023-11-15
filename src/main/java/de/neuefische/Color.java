package de.neuefische;

public enum Color {
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF"),
    BLACK("FFFFFF"),
    WHITE("000000"),
    HOTPINK("Hot");

    private final String hexCode;

    private Color (String hexCode){
        this.hexCode = hexCode;
    }

    public String getHexCode(){
        return hexCode;
    }

}
