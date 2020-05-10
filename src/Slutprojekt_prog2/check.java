package Slutprojekt_prog2;

public class check {
    public check() {}

    public static boolean checkWin(Cell[] Cells, Cell.cellType player){ // kollar om någon har vunnit
        for(int y = 0; y < 3; y++){
            if(Cells[0+y*3].getType() == player && Cells[1+y*3].getType() == player && Cells[2+y*3].getType() == player){
                return true; //kollar om den activa spelaren har tre i rad och ger tillbaka true till controllern
            }
        }
        for(int x =  0; x < 3; x++){
            if(Cells[x+0*3].getType() == player && Cells[x+1*3].getType() == player && Cells[x+2*3].getType() == player){
                return true; //kollar om den activa spelaren har tre i rad och ger tillbaka true till controllern
            }
        }
        if(Cells[0+0*3].getType() == player && Cells[1+1*3].getType() == player && Cells[2+2*3].getType() == player){
            return true; //kollar om den activa spelaren har tre i rad och ger tillbaka true till controllern
        }
        if(Cells[0+2*3].getType() == player && Cells[1+1*3].getType() == player && Cells[2+0*3].getType() == player){
            return true; //kollar om den activa spelaren har tre i rad och ger tillbaka true till controllern
        }

        return false; //om ingen har tre i rad
    }

}
