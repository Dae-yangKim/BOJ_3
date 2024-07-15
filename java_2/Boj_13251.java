package java_2;

import java.io.*;
import java.util.*;

public class Boj_13251 {
    public int sumNumbers(Integer[] arr)
    {
        int num = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            num += arr[i];
        }
        return num;
    }

    public void run() throws IOException
    {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer m = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[m];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        Integer k = Integer.parseInt(br.readLine());
        
        // 계산
        if(m <= 1)
        {
            System.out.println(1.0);
        }
        else
        {
            double result = 0.0;

            for(int i = 0 ; i < arr.length ; i++)
            {
                double num = (double)arr[i];
                double summ = (double)sumNumbers(arr);

                double sub = 1.0;
                for(int j = 0 ; j < k ; j++)
                {
                    sub *= (double)(num / summ);
                    num -= 1;
                    summ -= 1;
                }

                result += sub;
            }

            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_13251().run();
    }
}