from typing import *
import sys

input = sys.stdin.readline

A : int = int(input())
T : int = int(input())
guho = int(input())

bundegi = []
bun = degi = 1
turn = 0
while True:
    prev = bun
    turn += 1
    for _ in range(2):
        bundegi.append((bun , 0))
        bun += 1
        bundegi.append((degi , 1))
        degi += 1
    for _ in range(turn + 1):
        bundegi.append((bun , 0))
        bun += 1
    for _ in range(turn + 1):
        bundegi.append((degi , 1))
        degi += 1

    if prev < T <= bun:
        print(bundegi.index((T , guho)) % A)
        break