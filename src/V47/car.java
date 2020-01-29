package V47;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.lang.reflect.Array;
import java.util.ArrayList;

abstract class car {
    public abstract void Engine();
    public abstract void HorsePower();
    public abstract void Speakers();
    public void horn(){
        System.out.println("Toot");
    }
}
class Volvo extends car {

    public Volvo()
    {

    }

    @Override
    public void Engine(){
        System.out.println("1");
    }

    @Override
    public void HorsePower(){
        System.out.println("11");
    }

    @Override
    public void Speakers(){
        System.out.println("111");
    }
}

class BMW extends car{

    public BMW()
    {

    }

    @Override
    public void Engine(){
        System.out.println("2");
    }

    @Override
    public void HorsePower(){
        System.out.println("22");
    }

    @Override
    public void Speakers(){
        System.out.println("222");
    }
}
class Audi extends car{

    public Audi()
    {

    }

    @Override
    public void Engine(){
        System.out.println("3");
    }

    @Override
    public void HorsePower(){
        System.out.println("33");
    }

    @Override
    public void Speakers(){
        System.out.println("333");
    }
}

class main{
    public static void main(String[] args) {
        ArrayList<car> Car = new ArrayList<car>();
        Car.add(new Volvo());
        Car.add(new BMW());
        Car.add(new Audi());

        for(int i = 0; i < Car.size(); i++){
            Car.get(i).Engine();
            Car.get(i).HorsePower();
            Car.get(i).Speakers();
            Car.get(i).horn();
            System.out.println();
        }
    }
}
