from typing import *
import sys

input = sys.stdin.readline

N : int = int(input())
graph = [list(input().rstrip()) for _ in range(N)]

# 심장 위치
x = 0 ; y = 0

# 머리 찾기
for i in range(len(graph)):
    if graph[i].count('*') == 1:
        x = i + 2
        y = graph[i].index('*') + 1
        break

# 왼팔
left = 0
for i in range(0 , y - 1):
    if graph[x - 1][i] == '*':
        left += 1

# 오른팔
right = 0
for i in range(y , len(graph[x - 1])):
    if graph[x - 1][i] == '*':
        right += 1

# 몸통
body = 0
for i in range(x , N):
    if graph[i].count('*') == 1:
        body += 1
    else:
        break

# 발 스타트
check = []
left_index = 0
right_index = 0

for i in range(len(graph[x + body])):
    if graph[x + body][i] not in check and graph[x + body][i] == '*':
        left_index = i
        check.append(graph[x + body][i])
    elif graph[x + body][i] in check and graph[x + body][i] == '*':
        right_index = i

# 왼발
left_r = 1
right_r = 1

for i in range(x + body + 1 , N):
    if graph[i][left_index] == '*':
        left_r += 1

# 오른발

for i in range(x + body + 1 , N):
    if graph[i][right_index] == '*':
        right_r += 1

print(f"{x} {y}")
print(f"{left} {right} {body} {left_r} {right_r}")