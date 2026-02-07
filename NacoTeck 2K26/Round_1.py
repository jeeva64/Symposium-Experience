#Sum varies by +3 with i
sum = 3
#Finobacci Series
a, b = 1, 0

for i in range(0, 19):
    c = a + b
    a,b = b,c
    print(f"Level {i+1} -> Sum = {sum} AddrShift = {c}")
    #Relation Expression derived from output
    sum = sum + 3 + i