from typing import *
import sys

input = sys.stdin.readline

N : int = int(input())
data = {}

for i in range(N):
    num : int = int(input())
    if num not in data:
        data[num] = 1
    else:
        data[num] += 1

print(sorted(data.items() , key = lambda x : (-x[1] , x[0]))[0][0])