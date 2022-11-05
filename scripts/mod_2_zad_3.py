# Napisz skrypt, który będzie pytał użytkownika o szyfrowanie/deszyfrowanie Cezarem. Następnie dany tekst zaszyfruje bądź odszyfruje.


def encrypt(txt, key):
    encrypted = ""

    for character in txt:
        if character.isupper():
            character_index = ord(character) - ord('A')
            character_shifted = (character_index + key) % 26 + ord('A')
            encrypted += chr(character_shifted)
        elif character.islower():
            character_index = ord(character) - ord('a')
            character_shifted = (character_index + key) % 26 + ord('a')
            encrypted += chr(character_shifted)
        elif character.isdigit():
            character_new = (int(character) + key) % 10
            encrypted += str(character_new)
        else:
            encrypted += character
    return encrypted


def decrypt(txt, key):
    decrypted = ""
    key = key % 26

    for character in txt:
        if character.isupper():
            character_index = ord(character) - ord('A')
            character_org_pos = (character_index - key) % 26 + ord('A')
            decrypted += chr(character_org_pos)
        elif character.islower():
            character_index = ord(character) - ord('a')
            character_org_pos = (character_index - key) % 26 + ord('a')
            decrypted += chr(character_org_pos)
        elif character.isdigit():
            character_org_pos = (int(character) - key) % 10
            decrypted += str(character_org_pos)

        else:
            decrypted += character
    return decrypted


encryption_key = int(input("Podaj klucz: "))

action = input("Podaj akcje (ENCRYPT|DECRYPT): ")

if action == 'ENCRYPT':
    text = input("Podaj text do zaszyfrowania: ")

    print(f"Zaszyfrowany text: {encrypt(text, encryption_key)}")

if action == 'DECRYPT':
    text = input("Podaj text do odszyfrowania: ")

    print(f"Odszyfrowany text: {decrypt(text, encryption_key)}")
