x = [1, 2, 3, 4] 
def findEvenNum():
    count = 0
    while True: 
        if x[count] % 2 != 0:
            x.remove(x[count])
        elif x[count] == x[-1]:
            break
        else:
            count += 1
    print(x)
    
findEvenNum()
