package com.barthezzko.core.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeACat {
	
	public static void main(String ... args) throws IOException, ClassNotFoundException{
		if (args[0].equals("save")){
			File contactsFile = new File("mycontacts.ser");
			FileOutputStream fos = new FileOutputStream(contactsFile);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			Cat cat = new Cat();
			cat.setAge(11);
			cat.setName("Cactus");
			cat.setCatDNA("GHDAMCSJHFTUYTUG");
			out.writeObject(cat);
			out.close();
			fos.close();
			System.out.println(cat);
		}
		
		if (args[0].equals("load")){
			File contactsFile = new File("mycontacts.ser");
			FileInputStream fis = new FileInputStream(contactsFile);
			ObjectInputStream in = new ObjectInputStream(fis);
			Cat cat = (Cat)in.readObject();
			System.out.println(cat);
		}
	}
}


class Cat implements Serializable {
	
	private int age;
	private String name;
	private transient String catDNA;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatDNA() {
		return catDNA;
	}
	public void setCatDNA(String catDNA) {
		this.catDNA = catDNA;
	}
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", catDNA=" + catDNA
				+ "]";
	}
	
	
	
	
	
	
}