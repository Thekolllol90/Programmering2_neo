package Slutprojekt_prog2;

public class check {
    public check() {}

    public static boolean checkWin(cell[] cells, cell.cellType player){
        for(int y = 0; y < 3; y++){
            if(cells[0+y*3].getType() == player && cells[1+y*3].getType() == player && cells[2+y*3].getType() == player){
                return true;
            }
        }
        for(int x =  0; x < 3; x++){
            if(cells[x+0*3].getType() == player && cells[x+1*3].getType() == player && cells[x+2*3].getType() == player){
                return true;
            }
        }
        if(cells[0+0*3].getType() == player && cells[1+1*3].getType() == player && cells[2+2*3].getType() == player){
            return true;
        }
        if(cells[0+2*3].getType() == player && cells[1+1*3].getType() == player && cells[2+0*3].getType() == player){
            return true;
        }

        return false;
    }

}
