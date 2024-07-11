from typing import *
import sys

input = sys.stdin.readline

N , M = map(int , input().split())
arr = [i for i in range(1 , N + 1)]

for _ in range(M):
    left , right = map(int , input().split())
    arr[left - 1 : right] = reversed(arr[left - 1 : right])

print(' '.join(map(str , arr)))