package java_1;

import java.io.*;
import java.util.*;

public class Main{
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];
        for(int i = 0 ; i < n ; i++)
        {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        // 정렬
        Arrays.sort(arr , Collections.reverseOrder());

        int result = 0;
        for(int i = 0 ; i < k ; i++)
        {
            result += arr[i];
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) throws IOException
    {
        new Main().run();
    }
}