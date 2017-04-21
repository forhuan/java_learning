package b4;

import java.util.Scanner;

public class QueenDD {

    /**sum用来记录皇后放置成功的不同布局数*/  
    public long sum = 0;  
    long row =0;
    /**upperlim用来标记所有列都已经放置好了皇后*/  
    public long upperlim = 1;        
    
    int t=0;
    
    long x[] ;
    long xx[];
    
    QueenDD(int queenNum,int[][] array) { 
    	long[] aa = new long [queenNum];
    	
    	for(int i = 0; i < queenNum;i++){
    		long temp=0;
    		for(int j = 0; j < queenNum;j++){
        		temp+=array[i][j]*Math.pow(2, j);
    		}
    		aa[i]=temp;
    	}
    	this.x = aa;
    	this.xx = new long [queenNum];
    	queen(queenNum);  
    }
  
    /** 
     * 试探算法从最右边的列开始。   
     * @param row 竖列 
     */  
    void queenPos(int  n)
    {    
		long p=0;
		int k=1;
		int m=0;
		while(k>0) {
			
			long pos = upperlim & ~(row)& x[k-1];   //判断当前行可不可以放
			if(pos != 0)
			{
				System.out.println(Long.toBinaryString(pos));
				//找到位置了    
				p = pos & -pos;
				pos -= p;  
				row +=p;
				if(row == upperlim)    
				{
					sum++;
					//放完了
				}  
				else
				{
					//没全放完
					k++;  //下一行
				}
			}
			else
			{
				//没有能放的位置了
				k--;
			}
		}
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
        
       queenPos(queenNum);  
    }  
    
    public static void main(String[] args) {  

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
  
        long starTime=System.currentTimeMillis();//程序开始时间  
        QueenDD queendd = new QueenDD(_n,_array);  
        long endTime=System.currentTimeMillis();//程序结束时间  
       
        System.out.println(queendd.sum);
        double runTimes=(double)(endTime-starTime) / 1000.0;  
        System.out.println("程序总共运行时间："+ runTimes + "s");  
    }  

}

