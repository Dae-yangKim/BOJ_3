package java_1;

import java.io.*;
import java.util.*;

public class Boj_19939 {
    public void run() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int check = k * (k + 1) / 2;

        if (n < check) {
            System.out.println(-1);
        } else if ((n - check) % k == 0) {
            System.out.println(k - 1);
        } else {
            System.out.println(k);
        }
    }

    public static void main(String[] args) throws IOException
    {
        new Boj_19939().run();
    }
}