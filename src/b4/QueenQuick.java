package b4;

import java.util.Scanner;

public class QueenQuick {

    /**sum用来记录皇后放置成功的不同布局数*/  
    public long sum = 0;  
      
    /**upperlim用来标记所有列都已经放置好了皇后*/  
    public long upperlim = 1;        
    
    int t=0;
    
    long x[] ;
    
    QueenQuick(int queenNum,int[][] array) { 
    	long[] aa = new long [queenNum];
    	
    	for(int i = 0; i < queenNum;i++){
    		long temp=0;
    		for(int j = 0; j < queenNum;j++){
        		temp+=array[i][j]*Math.pow(2, j);
    		}
    		aa[i]=temp;
    	}
    	this.x = aa;
    	
    	queen(queenNum);  
    }
  
    /** 
     * 试探算法从最右边的列开始。   
     * @param row 竖列 
     */  
    void queenPos(long row)
    {    
        if (row != upperlim)    
        {    
            // row 对应位为0，    
            // 然后再取反后“与”上全1的数，来求得当前所有可以放置皇后的位置，对应列改为1    
            // 也就是求取当前哪些列可以放置皇后    
        	   	
//        	System.out.println(Long.toBinaryString(row));
//        	System.out.println("t="+t);
        	
            long pos = upperlim & ~(row)& x[t];       
            while (pos != 0)    // 0 -- 皇后没有地方可放，回溯    
            {    
                // 拷贝pos最右边为1的bit，其余bit置0    
                // 也就是取得可以放皇后的最右边的列    
                long p = pos & -pos;                 //int p = pos & (~pos + 1);                                    
        
                // 将pos最右边为1的bit清零    
                // 也就是为获取下一次的最右可用列使用做准备，    
                // 程序将来会回溯到这个位置继续试探    
                pos -= p;                               
        
                // row + p，将当前列置1，表示记录这次皇后放置的列。    
                t++;
                queenPos(row + p);                                  
            }    
        }    
        else       
        {    
            // row的所有位都为1，即找到了一个成功的布局，回溯    
            sum++;    
        }    
        t--;
        
    }  
      
    /** 
     * 根据传入的皇后数目开始计算 
     * @param n 皇后数据 
     */  
    void queen(int queenNum) {  
        if ((queenNum < 1) || (queenNum > 32)) {  
            System.out.println(" 只能计算1-32之间\n");  
            return;  
        }  
        // N个皇后只需N位存储，N列中某列有皇后则对应bit置1。  
        upperlim = (upperlim << queenNum) - 1;  
        queenPos(0);  
    }  
  
  
    public static void main(String[] args) {  
//        Scanner sc=new Scanner(System.in);    
//        System.out.print("请输入皇后数目:");    
        int num=3;//sc.nextInt();    
          
        
    }  

}

