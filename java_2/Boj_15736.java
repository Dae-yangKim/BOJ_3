package java_2;

import java.io.*;

public class Boj_15736 {
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n + 1];
        
        // 초기화
        for(int i = 1 ; i < arr.length ; i++)
            arr[i] = 1;
        
        arr[0] = -1;
        
        // 바꾸기
        for(int i = 1 ; i < arr.length ; i++)
        {
            for(int j = i ; j < arr.length ; j++)
            {
                if(j % i == 0)
                {
                    if(arr[j] == 0)
                    {
                        arr[j] = 1;
                    }
                    else
                    {
                        arr[j] = 0;
                    }
                }
            }
        }

        int result = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
                result++;
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_15736().run();
    }
}