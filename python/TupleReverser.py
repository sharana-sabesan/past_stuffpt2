def make_tuple():
    my_string = ""
    for i in range(5):
        num = input("Enter a number: ")
        my_string += num

    my_tuple = tuple(my_string)
    return my_tuple

def reverse(my_tuple):
    print("Reversed tuple: ")
    for i in range(0, 5, 1):
        print(my_tuple[i])
        
num_tuple = make_tuple()
reverse(num_tuple)
