from typing import *
import sys

input = sys.stdin.readline

N , M = map(int , input().split())
coins = [int(input()) for _ in range(N)]

result : int = 0
for i in range(len(coins) - 1):
    if coins[i] < coins[i + 1]:
        if M // coins[i] > 0:
            result = M // coins[i]
            M = M - (result * coins[i])
    elif coins[i] > coins[i - 1] and result > 0:
        M = M + result * coins[i]
        result = 0

if result > 0:
    M = M + result * coins[N - 1]

print(M)