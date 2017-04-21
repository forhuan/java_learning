package b4;

import java.util.Scanner;

public class QueenQuick {

    /**sum������¼�ʺ���óɹ��Ĳ�ͬ������*/  
    public long sum = 0;  
      
    /**upperlim������������ж��Ѿ����ú��˻ʺ�*/  
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
     * ��̽�㷨�����ұߵ��п�ʼ��   
     * @param row ���� 
     */  
    void queenPos(long row)
    {    
        if (row != upperlim)    
        {    
            // row ��ӦλΪ0��    
            // Ȼ����ȡ�����롱��ȫ1����������õ�ǰ���п��Է��ûʺ��λ�ã���Ӧ�и�Ϊ1    
            // Ҳ������ȡ��ǰ��Щ�п��Է��ûʺ�    
        	   	
//        	System.out.println(Long.toBinaryString(row));
//        	System.out.println("t="+t);
        	
            long pos = upperlim & ~(row)& x[t];       
            while (pos != 0)    // 0 -- �ʺ�û�еط��ɷţ�����    
            {    
                // ����pos���ұ�Ϊ1��bit������bit��0    
                // Ҳ����ȡ�ÿ��ԷŻʺ�����ұߵ���    
                long p = pos & -pos;                 //int p = pos & (~pos + 1);                                    
        
                // ��pos���ұ�Ϊ1��bit����    
                // Ҳ����Ϊ��ȡ��һ�ε����ҿ�����ʹ����׼����    
                // ����������ݵ����λ�ü�����̽    
                pos -= p;                               
        
                // row + p������ǰ����1����ʾ��¼��λʺ���õ��С�    
                t++;
                queenPos(row + p);                                  
            }    
        }    
        else       
        {    
            // row������λ��Ϊ1�����ҵ���һ���ɹ��Ĳ��֣�����    
            sum++;    
        }    
        t--;
        
    }  
      
    /** 
     * ���ݴ���Ļʺ���Ŀ��ʼ���� 
     * @param n �ʺ����� 
     */  
    void queen(int queenNum) {  
        if ((queenNum < 1) || (queenNum > 32)) {  
            System.out.println(" ֻ�ܼ���1-32֮��\n");  
            return;  
        }  
        // N���ʺ�ֻ��Nλ�洢��N����ĳ���лʺ����Ӧbit��1��  
        upperlim = (upperlim << queenNum) - 1;  
        queenPos(0);  
    }  
  
  
    public static void main(String[] args) {  
//        Scanner sc=new Scanner(System.in);    
//        System.out.print("������ʺ���Ŀ:");    
        int num=3;//sc.nextInt();    
          
        
    }  

}

