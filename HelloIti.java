	package mypkg;

import java.util.Scanner;

//update2 in same line to make conflict

class HelloJava {
	public static void main(String[] args){
		if(args.length != 0)
			for(int i =0 ; i < args.length ; i++)
				System.out.print(args[i]+" ");
	}
}