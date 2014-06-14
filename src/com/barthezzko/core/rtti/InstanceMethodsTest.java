package com.barthezzko.core.rtti;


import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: barthezzko
 * Date: 6/14/14
 * Time: 12:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class InstanceMethodsTest {

    @Test
    public void methodsDiffer(){
        String str1 = new String("a");
        String str2 = new String("b");
        Method method1 = str1.getClass().getDeclaredMethods()[0];
        Method method2 = str2.getClass().getDeclaredMethods()[0];
        System.out.println(method1.hashCode());
        System.out.println(method2.hashCode());
        Assert.assertFalse(method1 == method2);
        Assert.assertTrue(method1.equals(method2));

    }
}
