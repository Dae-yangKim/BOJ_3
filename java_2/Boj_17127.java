package java_2;

import java.util.*;
import java.io.*;

public class Boj_17127 {
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        // 계산
        int result = 0;
        int a = 1;
        for(int i = 0 ; i < arr.length - 3 ; i++)
        {
            a *= arr[i];
            int b = 1;
            for(int j = i + 1 ; j < arr.length - 2 ; j++)
            {
                b *= arr[j];
                int c = 1;
                for(int k = j + 1 ; k < arr.length - 1 ; k++)
                {
                    c *= arr[k];
                    int d = 1;
                    for(int l = k + 1 ; l < arr.length ; l++)
                    {
                        d *= arr[l];
                    }
                    if(result < (a + b + c + d))
                    {
                        result = a + b + c + d;
                    }
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_17127().run();
    }
}