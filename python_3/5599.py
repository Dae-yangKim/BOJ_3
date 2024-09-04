from typing import *
import sys

input = sys.stdin.readline

n : int = int(input())
cards = [i + 1 for i in range(2 * n)]
m : int = int(input())

for _ in range(m):
    k : int = int(input())
    if k == 0:
        half_length : int = len(cards) // 2
        new_arr = []
        first_cards = cards[ : half_length]
        second_cards = cards[half_length : ]

        for i in range(len(first_cards)):
            new_arr.append(first_cards[i])
            new_arr.append(second_cards[i])
        
        # 재할당
        cards = new_arr
    else:
        first_cards = cards[ : k]
        second_cards = cards[k : ]

        for i in range(len(first_cards)):
            second_cards.append(first_cards[i])
        
        # 재할당
        cards = second_cards

for card in cards:
    print(card)