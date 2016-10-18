package com.Hobby;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Haoni {
      public void haoniMove(int n ,HaoniTower haonitower){
    	  if(n==1){
    		  System.out.println("將盤1從"+haonitower.a+"移到"+haonitower.c);
    	  }
    	  else{
    		  
    		  haoniMove(n-1,new HaoniTower(haonitower.a,haonitower.c,haonitower.b));
    		  System.out.println("將盤"+n+"從"+haonitower.a+"移到"+haonitower.c);
    		  haoniMove(n-1,new HaoniTower(haonitower.b,haonitower.a,haonitower.c));
    	  }
      }//close method haoniMove
      
      public static void main(String[] args){
    	  Haoni haoni=new Haoni();
    	  try{
    		  System.out.println("請輸入河內塔的層數");
    		  BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
              int haoniDiskNumber=Integer.parseInt(reader.readLine());
              HaoniTower haonitower=new HaoniTower('A','B','C');
              haoni.haoniMove(haoniDiskNumber,haonitower);
    	  }
    	  catch(IOException ie){
    		  System.out.println(ie.toString());
    	  }
      }//close method main
      
}//close class Haoni

class HaoniTower{
	char a,b,c;
    HaoniTower(char a,char b,char c){
    	this.a=a;
    	this.b=b;
    	this.c=c;
    }//close constructor
 }//close class HaoniTower