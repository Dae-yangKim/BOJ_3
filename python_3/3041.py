from typing import *
import sys

input = sys.stdin.readline

puzzle = ['ABCD' , 'EFGH' , 'IJKL' , 'MNO.'] # 완성 위치
puzzle2 = []
pos = {}
count = 0

for _ in range(4):
    puzzle2.append(input())

# 현재의 위치를 저장한다
for i in range(4):
    for j in range(4):
        if puzzle[i][j] != puzzle2[i][j] and puzzle2[i][j] != '.':
            pos[puzzle2[i][j]] = (i , j)

# 원래의 위치와 현재의 위치 차이 산출
for i in range(4):
    for j in range(4):
        if puzzle[i][j] in pos.keys():
            count += abs(pos[puzzle[i][j]][0] - i) + abs(pos[puzzle[i][j]][1] - j)

print(count)