package java_1;

import java.util.*;
import java.io.*;

public class BOj_2455 {
    public void run() throws IOException
    {
        int num = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[4];
        StringTokenizer st;
        int maxx = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            
            num = num - first;
            num = num + second;

            if(num > maxx)
                maxx = num;
        }

        System.out.println(maxx);
    }
    
    public static void main(String[] args) throws IOException
    {
        new BOj_2455().run();
    }
}