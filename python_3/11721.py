from typing import *
import sys

input = sys.stdin.readline

sentence : str = input().rstrip()

length : int = len(sentence) // 10
if len(sentence) % 10 > 0:
    length += 1

for i in range(length):
    if i == length - 1:
        print(sentence[i * 10 : ])
        continue
    print(sentence[(i * 10) : ((i + 1) * 10)])