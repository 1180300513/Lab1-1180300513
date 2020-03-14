package P1;
import java.io.*;
public class MagicSquare 
{
    public final int MAX = 1000;
    public static final String Filename = "D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\1.txt";
    public static final String Output_Filename = "D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\6.txt";

    public boolean isLegalMagicSquare(String filename) 
    {
        InputStreamReader reader = null;
        BufferedReader br = null;
        try 
        {
            reader = new InputStreamReader(new FileInputStream(filename));
            br = new BufferedReader(reader);

            String MyLine;
            try 
            {
                int[][] square = new int[MAX][MAX];
                String[] tmp ;
                int N = 0;
                int Sd_N = -1;
                MyLine = br.readLine();
                while (MyLine != null) 
                {
                    tmp = MyLine.split("\t");
                    if(Sd_N==-1) 
                    {
                        Sd_N = tmp.length;
                    } 
                    else
                    {
//                        �������Ƿ��������
                        if(Sd_N!=tmp.length) 
                        {
                            System.out.println("Error: �������в����");
                            return false;
                        }
                    }
                    for(int i=0;i<tmp.length;i++) 
                    {
                        try 
                        {
                            square[N][i] = Integer.valueOf(tmp[i]);
                            if(square[N][i]<=0) 
                            {
                                System.out.println("Error: ����Ĳ���������");
                                return false;
                            }
                        } 
                        catch(Exception e) 
                        {
                            System.out.println("Error: ����Ĳ���������||����֮�䲢����\\t�ָ�");
//                            e.printStackTrace();
                            return false;
//                            e.printStackTrace();
                        }
                    }
                    N++;
                    MyLine = br.readLine(); // һ�ζ���һ������
                }
                
                if(Sd_N!=N) 
                {
                    System.out.println("Error: �������в����");
                    return false;
                }

//                ���MagicSquare
                int sd_sum = 0;
                for(int i=0;i<N;i++) sd_sum += square[0][i];
//                �����
                for(int i=1;i<N;i++) 
                {
                    int tmp_sum = 0;
                    for(int j=0;j<N;j++) 
                    {
                        tmp_sum += square[i][j];
                    }
                    if(tmp_sum!=sd_sum) 
                    	return false;
                }
//                  �����
                for(int j=0;j<N;j++) 
                {
                    int tmp_sum = 0;
                    for(int i=0;i<N;i++) 
                    {
                        tmp_sum += square[i][j];
                    }
                    if(tmp_sum!=sd_sum) return false;
                }
//                 ���Խ���
                int x_sum = 0,y_sum = 0;
                for(int i=0;i<N;i++) 
                {
                    x_sum+=square[i][i];
                    y_sum+=square[i][N-1-i];
                }
                if(x_sum!=sd_sum) return false;
                if(y_sum!=sd_sum) return false;
//                ͨ����֤Ϊ�÷�
                return true;
            } 
            catch (IOException e) 
            {
                System.out.println("Error: IO����");
//                e.printStackTrace();
            }
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Error: �ļ�δ�ҵ�");
//            e.printStackTrace();
        }
        try 
        {
        	br.close();
        }
        catch(IOException e) 
        {
        	e.printStackTrace();
        }
        return true;
    }


    
//   ����һ��MagicSquare
    public static boolean generateMagicSquare(int n)
    {
//       (2) �������n���Ϸ�ʱ��nΪż����nΪ�����ȣ����������false������
        if((n<=0) || ((n&1)==0)) 
        {
            System.out.println("Error: ���벻�Ϸ�������������!");
            return false;
        }
        int magic[][] = new int[n][n];  //����magic square��ά����
        int row = 0, col = n / 2, i, j, square = n * n;     //(row��col) ��ǰλ�� squareΪ�ܸ���

        for (i = 1; i <= square; i++) 
        { //ʹ���޲�������һ���÷� for ���� �������е�����i
            magic[row][col] = i;    //��(row,col)λ��������i
            if (i % n == 0)     //���i%n==0������+1
                row++;
            else 
            {  //����
                if (row == 0)   //���row==0������=n-1
                    row = n - 1;
                else            //��������--
                    row--;

                if (col == (n - 1))  //�������==n-1������=0
                    col = 0;
                else            //��������++
                    col++;
            }
        }
////      ��ӡ���ɵĻ÷�
//        for (i = 0; i < n; i++)
 //       {
 //           for (j = 0; j < n; j++)
 //               System.out.print(magic[i][j] + "\t");
 //           System.out.println();
 //       }
//      (1) ��������magic squareд���ļ�\src\P1\txt\6.txt�У�
        String filename = Output_Filename;
        
        try 
        {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename));
            BufferedWriter bw = new BufferedWriter(writer);
            for(i=0;i<n;i++) 
            {
                StringBuffer bf = new StringBuffer();
                for(j=0;j<n;j++) 
                {
                    bf.append(Integer.toString(magic[i][j])+"\t");
                }
                bf.append("\n");
                try 
                {
                    bw.write(bf.toString());
                } 
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            try 
            {
                bw.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        } 
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) 
    {
        //generateMagicSquare(9);
    		System.out.println("1.txt");
        if(new MagicSquare().isLegalMagicSquare(Filename)) 
        {
            System.out.println("�˾�����һ���÷�");
        } 
        else 
        {
            System.out.println("�˾����ǻ÷�");
        }
        System.out.println("2.txt");
        if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\2.txt")) 
        {
            System.out.println("�˾�����һ���÷�");
        } 
        else 
        {
            System.out.println("�˾����ǻ÷�");
        }
        System.out.println("3.txt");
        if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\3.txt")) 
        {
            System.out.println("�˾�����һ���÷�");
        } 
        else 
        {
            System.out.println("�˾����ǻ÷�");
        }
        System.out.println("4.txt");
        if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\4.txt")) 
        {
            System.out.println("�˾�����һ���÷�");
        } 
        else 
        {
            System.out.println("�˾����ǻ÷�");
        }
        System.out.println("5.txt");
        if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\5.txt")) 
        {
            System.out.println("�˾�����һ���÷�");
        } 
        else 
        {
            System.out.println("�˾����ǻ÷�");
        }
    }
}