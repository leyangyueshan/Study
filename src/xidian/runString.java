package xidian;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class runString {  
	  
    static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
    	Scanner input = new Scanner(System.in);
    	String s = input.nextLine();
    	Object a=0;
    	Object b = 5.0;
    	//String b ="5.0";
       //String strs = "1+1*2+(10-(2*(5-3)*(2-1))-4)";  
        try {  
        	a=jse.eval(s);
        	
        } catch (Exception e) {  
        	
        }  
        if(a.equals(b)){
        System.out.println(a);}  
    }  
}  
