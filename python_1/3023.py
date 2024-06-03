from typing import *
import sys

input = sys.stdin.readline

R , C = map(int , input().split())

patterns = []
patterns_reverse = []
for _ in range(R):
    pattern = list(map(str , input().rstrip()))
    patterns.append(pattern + pattern[::-1])

for i in range(len(patterns)):
    patterns_reverse.insert(0 , patterns[i].copy())

e_1 , e_2 = map(int , input().split())
e_1 -= 1 ; e_2 -= 1

result = patterns + patterns_reverse

if result[e_1][e_2] == '#':
    result[e_1][e_2] = '.'
else:
    result[e_1][e_2] = '#'

for a in result:
    print(''.join(a))