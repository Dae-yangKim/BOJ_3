from typing import *
import sys

input = sys.stdin.readline

N : int = int(input())
arr = list(map(int , input().split()))

steekers = []
max_length = 0

for i in range(len(arr)):
    if arr[i] not in steekers:
        steekers.append(arr[i])
        if len(steekers) > max_length:
            max_length = len(steekers)
    else:
        steekers.pop(steekers.index(arr[i]))

print(max_length)