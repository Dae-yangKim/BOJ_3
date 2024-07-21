from typing import *
import sys

input = sys.stdin.readline

check : List[str] = ['U' , 'C' , 'P' , 'C']
sentence : str = input().rstrip()

index : int = 0
for s in sentence:
    if index == len(check):
        break
    if s == check[index]:
        index += 1

if index == len(check):
    print('I love UCPC')
else:
    print('I hate UCPC')