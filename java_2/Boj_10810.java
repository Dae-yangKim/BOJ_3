package java_2;

import java.util.*;
import java.io.*;

public class Boj_10810 {
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer n = Integer.parseInt(st.nextToken());
        Integer m = Integer.parseInt(st.nextToken());
        
        Integer[] box = new Integer[n];

        // 초기화
        for(int i = 0 ; i < n ; i++)
            box[i] = 0;
        
        // 계산
        for(int i = 0 ; i < m ; i++)
        {
            st = new StringTokenizer(br.readLine());

            Integer a = Integer.parseInt(st.nextToken());
            Integer b = Integer.parseInt(st.nextToken());
            Integer c = Integer.parseInt(st.nextToken());

            for(int j = a - 1 ; j < b ; j++)
                box[j] = c;
        }
        
        for(int i = 0 ; i < box.length ; i++)
        {
            System.out.print(box[i]);
            if(i < box.length - 1)
                System.out.print(" ");
        }
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_10810().run();
    }
}