package java_2;

import java.io.*;
import java.util.*;

public class Boj_20044 {
    static Integer getMin(Integer[] arr)
    {
        Integer minn = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] < minn)
                minn = arr[i];
        }
        return minn;
    }

    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[n];
        Integer[] reverse_arr = new Integer[n];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            reverse_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        Arrays.sort(reverse_arr , Collections.reverseOrder());

        Integer[] results = new Integer[n * 2];
        for(int i = 0 ; i < n * 2 ; i++)
            results[i] = arr[i] + reverse_arr[i];
        
        System.out.println(getMin(results));
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_20044().run();
    }
}