from typing import *
import sys

input = sys.stdin.readline

N , M = map(int , input().split())
scores = list(map(int , input().split()))

people = {}
for _ in range(M):
    data = input().rstrip().split()
    
    score = 0
    for i in range(len(data[1:])):
        if data[1:][i] == 'O':
            score += scores[i]
    
    if data[0] not in people:
        people[data[0]] = score
    else:
        people[data[0]] += score

result = sorted(people.items() , key = lambda x : (-x[1] , x[0]))[0]
print(f"{result[0]} {result[1]}")