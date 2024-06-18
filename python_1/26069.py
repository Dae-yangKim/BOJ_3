from typing import *
import sys

input = sys.stdin.readline

meet = {'ChongChong'}
n : int = int(input())

for _ in range(n):
    a , b = input().rstrip().split()

    if a in meet:
        meet.add(b)
    
    if b in meet:
        meet.add(a)

length : int = len(meet)
print(length)