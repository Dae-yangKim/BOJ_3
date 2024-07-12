package java_1;

import java.io.*;

public class Boj_10988 {
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        int length = sentence.length();
        boolean condi = true;

        if(length % 2 == 0)
        {
            int iter = length / 2;
            for(int i = 0 ; i < iter ; i++)
            {
                if(sentence.charAt(i) == sentence.charAt(length - (1 + i)))
                {
                    continue;
                }
                else
                    condi = false;
            }
        }
        else
        {
            int iter = (int)(length / 2) + 1;
            for(int i = 0 ; i < iter ; i++)
            {
                if(sentence.charAt(i) == sentence.charAt(length - (1 + i)))
                {
                    continue;
                }
                else
                {
                    condi = false;
                }
            }
        }

        if(condi)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_10988().run();
    }
}