package java_2;

import java.io.*;
import java.util.*;

public class Boj_20115 {
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(br.readLine());
        Integer[] drinks = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++)
            drinks[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(drinks , Collections.reverseOrder());
        double result = 0.0;

        result += (double)drinks[0];

        for(int i = 1 ; i < drinks.length ; i++)
        {
            result += (double)drinks[i] / 2;
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_20115().run();
    }
}