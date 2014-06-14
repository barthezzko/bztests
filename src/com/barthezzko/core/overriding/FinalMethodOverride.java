package com.barthezzko.core.overriding;

/**
 * Created with IntelliJ IDEA.
 * User: barthezzko
 * Date: 6/14/14
 * Time: 2:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class FinalMethodOverride {


}


class PetrolCar {
    public final void go(){
       System.out.println("using the petrol");
    }
}
class MazdaCar extends  PetrolCar{
    /*public void go() {
        System.out.println("not the petrol!");
    } */
}