from cryptography.hazmat.primitives.asymmetric import rsa
from cryptography.hazmat.primitives import serialization
import random

private_key = rsa.generate_private_key(
    public_exponent = 65537,
    key_size = 2048
)

private_key_pass = b"feanwio86yswtgo8g6748"
# password in byte form for encryption

pem = private_key.private_bytes(
    encoding=serialization.Encoding.PEM,
    format=serialization.PrivateFormat.PKCS8,
    encryption_algorithm=serialization.BestAvailableEncryption(private_key_pass)
)
# encodes private key in PEM/PKC8 format and then encrypts it

public_key = private_key.public_key()
pem_public_key = public_key.public_bytes(
    encoding=serialization.Encoding.PEM,
    format=serialization.PublicFormat.SubjectPublicKeyInfo
)
# encodes public key in PEM/PKC8 format

test_public_key = 10
test_private_key = random.randrange(15)
#test_private_key = random.randrange(34568)
def discrete_challenge(public_key, private_key):
    y = public_key**private_key
    
    # user picks a value: 
    print("Pick a value between (0 - 10):")
    userValue = int(input())

    # user computes value and sends to server
    print("y = public_key^" + str(userValue))
    userValue2 = public_key**userValue
    

    # server returns a value from same range
    serverValue = random.randrange(10)

    # server sends to user
    print(serverValue)

    # user performs 2nd calculation & sends to server
    print("r = " + str(userValue) + " - " + str(serverValue) + "* private_key")
    userValue3 = int(userValue) - (int(serverValue)*private_key)

    # server performs check 
    if(userValue2 == ((public_key**int(userValue3)) * (y**int(serverValue)))):
            print("Authentication successful! :)")
    
    else: 
        print("Authentication failed! :(")


discrete_challenge(test_public_key, test_private_key)
    
