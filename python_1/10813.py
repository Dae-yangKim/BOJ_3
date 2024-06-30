from typing import *
import sys

input = sys.stdin.readline

N , M = map(int , input().split())
box = [i for i in range(1 , N + 1)]

for i in range(M):
    a , b = map(int , input().split())
    box[a - 1] , box[b - 1] = box[b - 1] , box[a - 1]

print(' '.join(map(str , box)))