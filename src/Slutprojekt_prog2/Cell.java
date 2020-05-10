package Slutprojekt_prog2;

import javafx.scene.control.Button;


public class Cell { //fortfarande lite confused övber vad som händer här men ska försöka förklara(patrik ville att jag skulle göra så här)
    public enum cellType{
        empty,x,o // en knapp kan antingen vara tom spelare x eller spelare o
    }

    public Cell(){}



    private Button button;



    private cellType type;

    public Cell(Button button, cellType type){
        this.button = button;
        this.type = type;
    }

    public boolean isEmpty(){
        return type == cellType.empty;
    } //gör så att man kolla om knappen är "empty"

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) { this.button = button; } //ingen aning vad allt gör exakt men de skapar cells som innehåller knappar så man bara kan hämta en cell så får man en färdig knapp typ

    public cellType getType() {
        return type;
    }

    public void setType(cellType type) {
        this.type = type;
    }

}
