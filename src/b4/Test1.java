package b4;

public class Test1 {
	
	public long sum=0;
	
	public static long Det(int [][]Matrix,int N)//����n������ʽ��N=n-1��  
    {  
		
        int T0;  
        int T1;  
        int T2;  
        long Num;  
        int Cha;  
        int [][] B;  
        if(N>0)  
        {  
            Cha=0;  
            B=new int[N][N];  
            Num=0;  
            if(N==1)  
            {  
                return Matrix[0][0]*Matrix[1][1]+Matrix[0][1]*Matrix[1][0];  
            }  
            for(T0=0;T0<=N;T0++)//T0ѭ��  
            {  
                for(T1=1;T1<=N;T1++)//T1ѭ��  
                {  
                    for(T2=0;T2<=N-1;T2++)//T2ѭ��  
                    {  
                        if(T2==T0)  
                        {  
                            Cha=1;  
                        }  
                        B[T1-1][T2]=Matrix[T1][T2+Cha];  
                    }//T2ѭ��  
                    Cha=0;  
                }//T1ѭ��  
                //Num=Num+Matrix[0][T0]*Det(B,N-1)*Math.pow((-1),T0);
                Num=Num+Matrix[0][T0]*Det(B,N-1);
            }//T0ѭ��  
            return Num;  
        }  
        else if(N==0)  
        {  
            return Matrix[0][0];  
        }  
        return 0;  
    }  
	
	
	Test1(int queenNum,int[][] array){
		sum=Det(array,queenNum-1);
	}
	
    public static void main(String[]args)//����  
    {  
    	int num = 11;
        int[][] TestMatrix = new int[num][num];
        for(int i = 0;i<num ; i++)
        	for(int j = 0;j<num ; j++)
        		TestMatrix[i][j]=1;
       

        long starTime=System.currentTimeMillis();//����ʼʱ��  
        String str=String.valueOf(Det(TestMatrix,num-1));
        long endTime=System.currentTimeMillis();//�������ʱ�� 
       
        System.out.println(str);
        double runTimes=(double)(endTime-starTime) / 1000.0;  
        System.out.println("�����ܹ�����ʱ�䣺"+ runTimes + "s");  
      
    }  
}
