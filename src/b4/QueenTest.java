package b4;

public class QueenTest {
    /**下标i表示第几行，x[i]表示第i行皇后的位置,注意此处0行不用*/  
    public int[] x;  
    
    public int[][] aa;//第几行第几个位置是否可以放
    
    /**皇后的数目*/  
    public int queenNum;  
    /**解的数目*/  
    public long methodNum;  
      
     QueenTest(int queenNum,int[][] array) {  
        this.queenNum = queenNum;  
        this.x = new int[queenNum+1];//注意，这里我们从第1行开始算起，第0行不用  
        this.aa = array;
        
        backtrack(1);//从第一个皇后开始递归  
    }  
      
    /** 
     * 一行一行的确定该行的皇后位置 
     * @param t 
     */  
    public void backtrack(int t)  
    {  
        if( t > queenNum) //如果当前行大于皇后数目，表示找到解了  
        {  
            methodNum++;//sum为所有的可行的解  
//            //依次打印本次解皇后的位置  
//            for(int m = 1; m <= queenNum; m++){  
//               //System.out.println(x[m]);//这一行用输出当递归到叶节点的时候，一个可行解  
//               //这里只是为了好看才写成下面的  
//               for(int k =1; k <= queenNum;k++){  
//                   if(k == x[m]){  
//                     System.out.print(x[m]+" ");   
//                   }else {  
//                     System.out.print("* ");//用*表示没有被用到的位置   
//                }  
//               }  
//                System.out.println();  
//            }  
//            System.out.println();  
        }  
        else{  
            for(int i = 1;i <= queenNum;i++)//第t行上皇后的位置只能是1-queenNum   
            {
            	if(aa[t-1][i-1]==1)
            	{
	                x[t] = i;            
	                if(place(t)) {//此处的place函数用来进行我们上面所说的条件的判断，如果成立，进入下一级递归,即放置下一个皇后  
	                    backtrack(t+1);  
	                } 
            	}
            }  
        }  
    }  
      
    /** 
     * 判断第k行皇后可以放置的位置 
     * @param k k表示第k行，X[K]k表示第k行上皇后的位置 
     * @return boolean false表示此处不能放置皇后 
     */  
    public boolean place(int k) {  
        for (int j = 1; j < k; j++)  
            //如果当前传入的第K行上的皇后放置的位置和其它皇后在一个直线上(x[j] == x[k])  
            if (x[j] == x[k]){                                                                  
                return false;  
            }  
        return true;  
    }  
  
    public static void main(String[] args) {  

  
    }  
}
