import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {

	public List<Integer> search(String name,String a) {
		List<Integer> num=new ArrayList<Integer>();
		int pos=0;
		while(true) {
		
		pos=name.indexOf(a,pos)+1;
		num.add(pos);
		if(pos==0) {
			break;
		}
		}
		return num;
	}
	
	public void print(String name,List<Integer> positions) {
		int len=name.length();
		int index=0;int k=0;
		char ar[]=name.toCharArray();
		for(int i=1;i<=len;i++) {
			
			if(positions.contains(i)) {
				System.out.print(name.charAt(i-1)+" ");
				k++;
			}
			else {
				System.out.print("X ");
			}
			
			}
		
		System.out.println();
		if(k==len) {
			System.out.println("----GAME OVER----");
			System.out.println("YOU HAVE WON");
		}
		
		}
		
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner inp=new Scanner(System.in);
		String name="HelloWorld";
		System.out.println("PLAYER 1 \nENTER MOVIE NAME");
		name=inp.nextLine();
		name=name.replaceAll(" ","");
		name=name.toLowerCase();
		//System.out.println(name);
		Integer chance =5;
		int i;
		
		Integer len=name.length();
		Game g=new Game();
		List<Integer> positions=new ArrayList<Integer>();
		System.out.println("PLAYER 2:");
		System.out.println("Guess this Movie");
		List<Integer> positions1=new ArrayList<Integer>();
		for(i=0;i<len;i++) {
			System.out.print("X ");
			
		}
		System.out.println();
		 
		
		while(chance!=0) {
		String a=inp.next();
		a.toLowerCase();
		
		
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(0);
		positions=g.search(name,a);
		
		if(positions.equals(arr)) {
			chance--;
			if(chance!=0) {
			System.out.println("U have "+chance + " chances\nTry again...");
			}
			}
		
		else {
			for(int in: positions) {
				positions1.add(in);
			}
			//System.out.println(positions1);
			positions1.sort(null);
			//positions1.addAll(positions);
		g.print(name, positions1);
		}
		
		
		}
		if(chance==0) {
			System.out.println("SORRY----YOU LOST THE GAME");
		}
		
		
		}
		

	}


