from typing import *
import sys

input = sys.stdin.readline

data = set()
n : int = int(input())
count : int = 0

for i in range(n):
    usr_input = input().rstrip()

    if usr_input != 'ENTER':
        if usr_input not in data:
            data.add(usr_input)
            count += 1
    else:
        data.clear()

print(count)