import numpy as np

def solve_matrix_multiplication():
    A = create_array()
    B = create_array()
    
    C = (A @ B).astype(int)
    text = ""
    for row in C:
        text += "\n"
        for el in row:
            text += str(el)+ " "
    
def create_array():    
    n1, m1 = map(int, input().split()) 
    A = np.ones((n1, m1))
    
    for n in range(n1):
        values = input().split()
        for m in range(len(values)):
            A[n][m] = values[m]
            
    return A