import sys

def add(a, b):  
    return int(a)+int(b)

a = sys.argv[1]
b = sys.argv[2]

print(add(a, b))