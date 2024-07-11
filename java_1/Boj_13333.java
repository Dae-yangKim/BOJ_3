package java_1;

import java.io.*;
import java.util.*;

public class Boj_13333 {
    public static boolean areAllElementEqual(Integer[] arr)
    {
        return arr.length <= 1 || Arrays.stream(arr).distinct().count() == 1;
    }

    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        if(areAllElementEqual(arr))
        {
            System.out.println(arr[0]);
        }
        else
        {
            for(int i = 0 ; i < arr.length ; i++)
            {
                int k = arr[i];
                if(k <= Arrays.copyOfRange(arr , i , arr.length).length) // k편 이상인지
                {
                    int num = n - k;
                    if(num < 0)
                        break;
                    else
                    {
                        if(num == Arrays.copyOfRange(arr , 0 , i).length)
                        {
                            System.out.println(k);
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_13333().run();
    }
}