from typing import *
import sys

input = sys.stdin.readline

game_board = [[' '] * 3 for _ in range(3)] # 게임판 만들기

p = int(input())
while True:
    x , y = map(int , input().split())
    x -= 1 ; y -= 1
    win = 0

    if p == 1:
        game_board[x][y] = 'O'
    else:
        game_board[x][y] = 'X'
    
    check = []
    for i in range(3):
        check.append([game_board[i][0] , game_board[i][1] , game_board[i][2]])
    
    for i in range(3):
        check.append([game_board[0][i] , game_board[1][i] , game_board[2][i]])
    
    # 대각선 체크
    check.append([game_board[0][0] , game_board[1][1] , game_board[2][2]])
    check.append([game_board[2][0] , game_board[1][1] , game_board[0][2]])
    
    # 승패 판결
    if ['O'] * 3 in check:
        win = 1
    elif ['X'] * 3 in check:
        win = 2

    # 무승부 체크
    if win == 0:
        condition = False
        for i in range(len(check)):
            if ' ' in check[i] :
                condition = True
        if not condition:
            win = 3
    
    if win > 0:
        break

    # 만약 현재 플레이어 1 -> 2 로 차례 넘기기
    if p == 1:
        p = 2
    else:
        p = 1

if win < 3:
    print(win)
else:
    print(0)