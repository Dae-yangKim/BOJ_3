from typing import *
import sys

input = sys.stdin.readline

N : int = int(input())

times = [list(map(int , input().split())) for _ in range(N)]

s = sorted(times , reverse = True)
e = sorted(times , key = lambda x : x[1])

if(s[0][0] - e[0][1]) < 0:
    print(0)
else:
    print(s[0][0] - e[0][1])