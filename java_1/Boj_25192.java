package java_1;

import java.util.*;
import java.io.*;

public class Boj_25192{
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Vector<String> vec = new Vector<>();

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            String usr_input = br.readLine();
            if(usr_input.equals("ENTER"))
            {
                vec = new Vector<>(); // 초기화
            }
            else if(!vec.contains(usr_input))
            {
                count++;
                vec.add(usr_input);
            }
        }

        System.out.println(count);
    }
    
    public static void main(String[] args) throws IOException
    {
        new Boj_25192().run();
    }
}