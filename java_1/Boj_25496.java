package java_1;

import java.util.*;
import java.io.*;

public class Boj_25496{
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(p < 200)
            {
                count ++;
                p += arr[i];
            }
            else
                break;
        }

        System.out.println(count);
    }
    
    public static void main(String[] args)throws IOException
    {
        new Boj_25496().run();
    }
}