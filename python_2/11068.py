from typing import *
import sys

input = sys.stdin.readline

T : int = int(input())

for _ in range(T):

    N : int = int(input())
    arr = []
    for i in range(2 , 65):
        li = []
        temp = N
        while temp != 0:
            li.append(temp%i)
            temp //= i
        
        for k in range(len(li) // 2):
            if(li[k] != li[-1-k]):
                arr.append('X')
                break

    if len(arr) == 63:
        print(0)
    else:
        print(1)