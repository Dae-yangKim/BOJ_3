from typing import *
import sys

input = sys.stdin.readline

N : int = int(input())

for _ in range(N):
    n : int = int(input())
    if n == 0:
        print(0)
    elif n == 1:
        print(1)
    else:
        dp = [0] * (n + 2)
        dp[0] = 0 ; dp[1] = 1
        for i in range(2 , n + 2):
            dp[i] = dp[i - 1] + dp[i - 2]
        
        print(dp[-1])