package b4;

import java.util.Scanner;

public class QueenDD {

    /**sum������¼�ʺ���óɹ��Ĳ�ͬ������*/  
    public long sum = 0;  
    long row =0;
    /**upperlim������������ж��Ѿ����ú��˻ʺ�*/  
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
     * ��̽�㷨�����ұߵ��п�ʼ��   
     * @param row ���� 
     */  
    void queenPos(int  n)
    {    
		long p=0;
		int k=1;
		int m=0;
		while(k>0) {
			
			long pos = upperlim & ~(row)& x[k-1];   //�жϵ�ǰ�пɲ����Է�
			if(pos != 0)
			{
				System.out.println(Long.toBinaryString(pos));
				//�ҵ�λ����    
				p = pos & -pos;
				pos -= p;  
				row +=p;
				if(row == upperlim)    
				{
					sum++;
					//������
				}  
				else
				{
					//ûȫ����
					k++;  //��һ��
				}
			}
			else
			{
				//û���ܷŵ�λ����
				k--;
			}
		}
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
  
        long starTime=System.currentTimeMillis();//����ʼʱ��  
        QueenDD queendd = new QueenDD(_n,_array);  
        long endTime=System.currentTimeMillis();//�������ʱ��  
       
        System.out.println(queendd.sum);
        double runTimes=(double)(endTime-starTime) / 1000.0;  
        System.out.println("�����ܹ�����ʱ�䣺"+ runTimes + "s");  
    }  

}

