```python
# Function to Generate Sudoku Board

from sudoku import Sudoku
import random
array_board = []

def generate_sudoku_array():
    random.seed()
    random_num = random.random()
    sudoku_type_board = Sudoku(3).difficulty( random_num )
    array_board = sudoku_type_board.board

    for row in range(len( array_board )):
        for column in range(len( array_board[row] )):
            cell = array_board[row][column];
            if array_board[row][column] is None:
                array_board[row][column] = 0;
    return array_board
```


```python
# Function to Pretty Print Sudoku Board

def pretty_print_sudoku( board ):
    
    character_count = len( str( board[0][0] ) )
    divider = sudoku_pretty_print_divider( character_count )
    header = sudoku_header_pretty_print( character_count )
    
    print( "\n" + divider )
    print( header )
    print(  divider )
    row_counter = 1;
    for row in board:
        print( "||", end = " ")
        column_counter = 1;
        for cell in row:
            if( column_counter % 3 == 0 ):
                print( str( cell ) + " ||", end =" " )
            else:
                print( str( cell ), end =" " )
            column_counter += 1
        
        if( row_counter % 3 == 0 ):
            print( "\n" + divider )
        else:
            print( "" )
        row_counter += 1
```


```python
# Function to determine length of divider lines for pretty_print_sudoku depending on character count

def sudoku_pretty_print_divider( character_count ):
    divider_count = 20 + ( character_count * 9 )
    divider = ""
    while( divider_count > 0 ):
        divider += "="
        divider_count -= 1
    
    return divider;

```


```python
# Function to create Sudoku header for pretty_print_sudoku depending on character count

def sudoku_header_pretty_print( character_count ):
    header = ""
    title = "SUDOKU"
    full_character_count = 11 + ( character_count * 9 )
    half_character_count = full_character_count // 2
    counter = 0;
    while( counter <= half_character_count ):
        header += "|"
        counter += 1
    header += " " + title + " "
    while( counter <= full_character_count ):
        header += "|"
        counter += 1
    return header
```


```python
# Generating and printing our initial randomly generated sudoku board

sudoku = generate_sudoku_array();

print("\nRandomly generated, unsolved sudoku board:")
pretty_print_sudoku ( sudoku )
```

    
    Randomly generated, unsolved sudoku board:
    
    =============================
    ||||||||||| SUDOKU ||||||||||
    =============================
    || 0 3 4 || 7 2 6 || 0 9 1 || 
    || 0 7 9 || 3 4 5 || 6 0 0 || 
    || 2 0 5 || 1 8 9 || 7 0 0 || 
    =============================
    || 5 2 1 || 0 3 4 || 8 0 0 || 
    || 4 8 7 || 0 5 2 || 9 1 3 || 
    || 6 9 0 || 8 1 7 || 2 4 0 || 
    =============================
    || 3 1 0 || 2 0 8 || 4 5 9 || 
    || 9 5 0 || 4 6 1 || 3 0 2 || 
    || 7 4 2 || 5 9 0 || 0 8 6 || 
    =============================



```python
# Create a Reference Grid

reference_grid = [] 
def create_reference_grid():
 
    nine_alphabet_letters = ['A','B','C','D','E','F','G','H','I']
    nine_numbers = ['1','2','3','4','5','6','7','8','9']
    for row in range(len( nine_alphabet_letters )):
        temp_list = []
        for column in range(len( nine_numbers )):
            temp_list.append( nine_alphabet_letters[row] + nine_numbers[column] )
        reference_grid.append(temp_list)


create_reference_grid()
pretty_print_sudoku( reference_grid )
```

    
    ======================================
    ||||||||||||||| SUDOKU |||||||||||||||
    ======================================
    || A1 A2 A3 || A4 A5 A6 || A7 A8 A9 || 
    || B1 B2 B3 || B4 B5 B6 || B7 B8 B9 || 
    || C1 C2 C3 || C4 C5 C6 || C7 C8 C9 || 
    ======================================
    || D1 D2 D3 || D4 D5 D6 || D7 D8 D9 || 
    || E1 E2 E3 || E4 E5 E6 || E7 E8 E9 || 
    || F1 F2 F3 || F4 F5 F6 || F7 F8 F9 || 
    ======================================
    || G1 G2 G3 || G4 G5 G6 || G7 G8 G9 || 
    || H1 H2 H3 || H4 H5 H6 || H7 H8 H9 || 
    || I1 I2 I3 || I4 I5 I6 || I7 I8 I9 || 
    ======================================



```python
# Solve Sudoku Board
```


```python

```
