from typing import *
import sys

input = sys.stdin.readline

N : int = int(input())
sentence : str = input().rstrip()

summ : int = 0
sub_num = ''

for s in sentence:
    if s.isdigit():
        sub_num += s
    else:
        if sub_num != '':
            summ += int(sub_num)
            sub_num = '' # 초기화

if sub_num != '':
    summ += int(sub_num)

print(summ)