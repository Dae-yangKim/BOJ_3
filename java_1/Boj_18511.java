package java_1;

import java.util.*;
import java.io.*;

public class Boj_18511{
    static String solution(Integer[] arr , int n , int index)
    {
        if(arr.length <= index)
        {
            return "";
        }

        String str = String.valueOf(n);
        String answer = "";

        int minn = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] <= Character.getNumericValue(str.charAt(index)))
            {
                minn = arr[i];
            }
        }
        answer += String.valueOf(minn);
        answer += solution(arr , n , index += 1);

        return answer;
    }

    static void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[k];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < k ; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        String answer = solution(arr , n , 0);

        System.out.println(String.valueOf(answer));
    }
    
    public static void main(String[] args) throws IOException
    {
        run();
    }
}