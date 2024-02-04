def check_winner(board):
    # Check each direction: horizontal, vertical, two diagonals
    directions = [(0,1),(1,0),(1,1),(1,-1)]
    
    for x in range(19):
        for y in range(19):
            if board[x][y] != 0:
                for dx, dy in directions:
                    try:
                        if all([board[x + i*dx][y + i*dy] == board[x][y] for i in range(5)]) \
                                and (x+5*dx < 0 or x+5*dx >= 19 or y+5*dy < 0 or y+5*dy >= 19 or board[x + 5*dx][y + 5*dy] != board[x][y]) \
                                and (x-dx < 0 or x-dx >= 19 or y-dy < 0 or y-dy >= 19 or board[x - dx][y - dy] != board[x][y]):
                            return board[x][y], x + 2*dx + 1, y + 2*dy + 1
                    except IndexError:
                        pass

    return 0, None, None

board = [list(map(int, input().split())) for _ in range(19)]
winner, x, y = check_winner(board)

print(winner)
if winner:
    print(x, y)