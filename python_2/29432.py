from typing import *
import sys

input = sys.stdin.readline

N : int = int(input())
sentence = [input().rstrip() for _ in range(N)]
position = sentence.index('?')

M : int = int(input())
fubo = [input().rstrip() for _ in range(M)]

if position == 0:
    for i in range(len(fubo)):
        if fubo[i] in sentence: continue
        if fubo[i][-1] == sentence[position + 1][0]:
            print(fubo[i]) ; break
elif position == len(sentence) - 1:
    for i in range(len(fubo)):
        if fubo[i] in sentence: continue
        if fubo[i][0] == sentence[position][-1]:
            print(fubo[i]) ; break
else:
    for i in range(len(fubo)):
        if fubo[i] in sentence: continue
        if (fubo[i][0] == sentence[position - 1][-1]) and (fubo[i][-1] == sentence[position + 1][0]):
            print(fubo[i]) ; break