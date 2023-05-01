	package mypkg;

import java.util.Scanner;

class HelloJava {
	public static void main(String[] args){
		if(args.length != 0)
			for(int i =0 ; i < args.length ; i++)
				System.out.print(args[i]+" ");
		
		System.out.println("modify by hassan");
		System.out.println("modify from master");
		System.out.println("modify by mohamed");
<<<<<<< HEAD
		System.out.println("modify by hassan to make conflict");
=======
		System.out.println("modification 1);

>>>>>>> 8fc76e44dd77a01fcda160ebdf7e7980812ab3e1
	}
}