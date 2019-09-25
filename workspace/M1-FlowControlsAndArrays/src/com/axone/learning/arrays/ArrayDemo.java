package com.axone.learning.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[10];
		names[0] = "FamilyNames";
		names[1] = "Ezhil";
		names[2] = "Nandhini";
		names[3] = "Varshasri";
		
		for(int i=0; i < names.length;i++)
		{
			System.out.println(names[i]);
		}
	}

}
