package Slutprojekt_prog2;

import javafx.scene.control.Button;


public class Cell {
    public enum cellType{
        empty,x,o
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
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public cellType getType() {
        return type;
    }

    public void setType(cellType type) {
        this.type = type;
    }

}
