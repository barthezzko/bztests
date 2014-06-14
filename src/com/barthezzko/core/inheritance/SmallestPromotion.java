package com.barthezzko.core.inheritance;

/**
 * Created with IntelliJ IDEA.
 * User: barthezzko
 * Date: 6/14/14
 * Time: 1:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class SmallestPromotion {

    public static void main(String ... args){
        byte b = 12;
        long l = 12l;
        SmallestPromotion sp = new SmallestPromotion();
        sp.returnMe(b);
        //sp.returnMe(l); up promoting is impossible
    }

    public int returnMe(int i){
        System.out.println("int");
        return i;
    }
    public short returnMe(short i){
        System.out.println("short");
        return i;
    }


}
