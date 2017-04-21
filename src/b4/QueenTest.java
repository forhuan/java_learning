package b4;

public class QueenTest {
    /**�±�i��ʾ�ڼ��У�x[i]��ʾ��i�лʺ��λ��,ע��˴�0�в���*/  
    public int[] x;  
    
    public int[][] aa;//�ڼ��еڼ���λ���Ƿ���Է�
    
    /**�ʺ����Ŀ*/  
    public int queenNum;  
    /**�����Ŀ*/  
    public long methodNum;  
      
     QueenTest(int queenNum,int[][] array) {  
        this.queenNum = queenNum;  
        this.x = new int[queenNum+1];//ע�⣬�������Ǵӵ�1�п�ʼ���𣬵�0�в���  
        this.aa = array;
        
        backtrack(1);//�ӵ�һ���ʺ�ʼ�ݹ�  
    }  
      
    /** 
     * һ��һ�е�ȷ�����еĻʺ�λ�� 
     * @param t 
     */  
    public void backtrack(int t)  
    {  
        if( t > queenNum) //�����ǰ�д��ڻʺ���Ŀ����ʾ�ҵ�����  
        {  
            methodNum++;//sumΪ���еĿ��еĽ�  
//            //���δ�ӡ���ν�ʺ��λ��  
//            for(int m = 1; m <= queenNum; m++){  
//               //System.out.println(x[m]);//��һ����������ݹ鵽Ҷ�ڵ��ʱ��һ�����н�  
//               //����ֻ��Ϊ�˺ÿ���д�������  
//               for(int k =1; k <= queenNum;k++){  
//                   if(k == x[m]){  
//                     System.out.print(x[m]+" ");   
//                   }else {  
//                     System.out.print("* ");//��*��ʾû�б��õ���λ��   
//                }  
//               }  
//                System.out.println();  
//            }  
//            System.out.println();  
        }  
        else{  
            for(int i = 1;i <= queenNum;i++)//��t���ϻʺ��λ��ֻ����1-queenNum   
            {
            	if(aa[t-1][i-1]==1)
            	{
	                x[t] = i;            
	                if(place(t)) {//�˴���place����������������������˵���������жϣ����������������һ���ݹ�,��������һ���ʺ�  
	                    backtrack(t+1);  
	                } 
            	}
            }  
        }  
    }  
      
    /** 
     * �жϵ�k�лʺ���Է��õ�λ�� 
     * @param k k��ʾ��k�У�X[K]k��ʾ��k���ϻʺ��λ�� 
     * @return boolean false��ʾ�˴����ܷ��ûʺ� 
     */  
    public boolean place(int k) {  
        for (int j = 1; j < k; j++)  
            //�����ǰ����ĵ�K���ϵĻʺ���õ�λ�ú������ʺ���һ��ֱ����(x[j] == x[k])  
            if (x[j] == x[k]){                                                                  
                return false;  
            }  
        return true;  
    }  
  
    public static void main(String[] args) {  

  
    }  
}
