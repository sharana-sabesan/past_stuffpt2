num = int(input("Enter a number: "))
a = 0
for i in range(num):
    a = a + (i + 1)
    print("Sum #" + str(i) + ": " + str(a))
