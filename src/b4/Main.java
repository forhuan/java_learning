package b4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.xml.crypto.Data;

public class Main {
	
	int[][] parray = null; 

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static long caculateSubs(int n, int[][] array) {
    	

        long starTime=System.currentTimeMillis();//程序开始时间  
        Test1 test1 = new Test1(n,array);  
        long endTime=System.currentTimeMillis();//程序结束时间 
       
        System.out.println(test1.sum);
        double runTimes=(double)(endTime-starTime) / 1000.0;  
        System.out.println("程序总共运行时间："+ runTimes + "s");  
      
        starTime=System.currentTimeMillis();//程序开始时间  
        QueenQuick queenquick = new QueenQuick(n,array);  
        endTime=System.currentTimeMillis();//程序结束时间 
       
        System.out.println(queenquick.sum);
        runTimes=(double)(endTime-starTime) / 1000.0;  
        System.out.println("程序总共运行时间："+ runTimes + "s");  
        
        starTime=System.currentTimeMillis();//程序开始时间   
        QueenTest queenTest = new QueenTest(n,array);
        endTime=System.currentTimeMillis();//程序结束时间  

        System.out.println(queenquick.sum);
        runTimes=(double)(endTime-starTime) / 1000.0;  
        System.out.println("程序总共运行时间："+ runTimes + "s");  
        
		return queenTest.methodNum;
    }
    
    public static void pl(List<Integer> s,List<Integer> rs){
    	
        if(s.size()==1)  
        {
        	
            rs.add(s.get(0));
            //System.out.println(rs.toString());
            
            rs.remove(rs.size()-1);
            
        }else{
        	
            for(int i=0;i<s.size();i++){
            	
                rs.add(s.get(i));
                List<Integer> tmp=new ArrayList<Integer>();
                for(Integer a:s)
                   tmp.add(a);
                tmp.remove(i);
                pl(tmp,rs);
                rs.remove(rs.size()-1);
     
            }  
        }                     
   }  
    
    

    public static void main(String[] args){
    	
//	  List<Integer> s=new ArrayList<Integer>();  
//	  List<Integer> rs=new ArrayList<Integer>();
//	  Date d1 = new Date();
//	  for(int i=1;i<=12;i++)  
//	      s.add(i);
//	  
//	  pl(s,rs); 
    	
	  
        Scanner in = new Scanner(System.in);
        long res;
            
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _array_rows = 0;
        int _array_cols = 0;
        _array_rows = _n;
        _array_cols = _n;
        
        int[][] _array = new int[_array_rows][_array_cols];
        for(int _array_i=0; _array_i<_array_rows; _array_i++) {
            for(int _array_j=0; _array_j<_array_cols; _array_j++) {
                _array[_array_i][_array_j] = in.nextInt();
                
            }
        }
        
        if(in.hasNextLine()) {
          in.nextLine();
        }
  
        res = caculateSubs(_n, _array);
        System.out.println(String.valueOf(res));  

    }
}