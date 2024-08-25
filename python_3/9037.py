from typing import *
import sys

input = sys.stdin.readline

def solution(members : List[int]) -> int:
    # 홀수 -> 짝수
    for i in range(len(members)):
        if members[i] % 2 != 0:
            members[i] += 1
    
    count : int = 0
    while True:
        # 모두 같은 경우
        if len(set(members)) == 1:
            break

        # 한 바퀴
        for i in range(len(members) - 1):
            half_my_candy = members[i] // 2
            members[i + 1] += half_my_candy
            members[i] = members[i] // 2
            
            if members[i] % 2 != 0:
                members[i] += 1
            
            if members[i + 1] % 2 != 0:
                members[i + 1] += 1
        
        # 마지막 사람이 처음 사람한테 줘야 한다.
        half_my_candy_last = members[-1] // 2
        members[0] += half_my_candy_last
        members[-1] = members[-1] // 2
        
        if members[-1] % 2 != 0:
            members[-1] += 1
        
        if members[0] % 2 != 0:
            members[0] += 1
        
        # 1순환
        count += 1

    return count

N : int = int(input())
for _ in range(N):
    T : int = int(input())
    members = list(map(int , input().split()))
    print(solution(members))