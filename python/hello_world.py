import turtle

turtle = turtle.Turtle()

def make_square(turtle, length):
    print(turtle)
    for i in range(4):
        turtle.fd(length)
        turtle.lt(90)
def color_5_squares(turtle, color, length1):
    for i in range(4):
        if(i%2 == 0):
            turtle.fillcolor(color)
            turtle.begin_fill()
            make_square(turtle, length1)
            turtle.end_fill()
        else:
            turtle.fillcolor('white')
            turtle.begin_fill()
            make_square(turtle, length1)
            turtle.end_fill()
        length1 = length1-100
  
        
turtle.penup()
turtle.goto(-200,-200)
turtle.pendown()
color_5_squares(turtle, 'yellow', 400)
