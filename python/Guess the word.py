secret_word = "rad"
dashes = ["-","-","-"]
#Use boolean to test if the user guess is equal to the secret word

def get_guess():
    result = ""
    guesses_left = 10
    while(result is not secret_word and guesses_left > 0):
        print(str(guesses_left) + " incorrect guesses left.")
        guess = input("Guess: ")
        if(guess in secret_word):
            print("That letter is in the secret word!")
            result = update_dashes(secret_word, dashes, guess)
            print(result)
        elif(len(guess) > 1):
            print("Your guess  must have exactly one character!")
            result = update_dashes(secret_word, dashes, guess)
            print(result)
            guesses_left -= 1
        elif(not guess.islower()):
            print("Your guess must be a lowercase letter!")
            result = update_dashes(secret_word, dashes, guess)
            print(result)
            guesses_left -= 1
        else:
            print("That letter is not in the secret word!")
            print(update_dashes(secret_word, dashes, guess))
            guesses_left -= 1
        if(guesses_left == 0):
            print("You lose. The word was: rad")
            break
        elif(result is secret_word):
            print("Congrats! You win. The word was: rad.")
            break

def update_dashes(word, dash, clue):
    end = ""
    if(clue in word):
        for i in range(len(secret_word)):
            if secret_word[i] == clue:
                end = end + word[i]
                dash[i] = word[i]
            else:
                end = end + dash[i]
    return end
        
 
print(''.join(dashes)) 
get_guess()
