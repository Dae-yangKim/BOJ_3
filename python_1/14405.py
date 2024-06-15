from typing import *
import sys

input = sys.stdin.readline

sentence = ['pi' , 'ka' , 'chu']

s : str = input().rstrip()
check : str = ''

for i in s:
    if check not in sentence:
        check += i
    else:
        check = ''
        check += i

if check in sentence:
    print('YES')
else:
    print('NO')