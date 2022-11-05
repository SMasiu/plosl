# Napisz skrypt, który sprawdzi czy wprowadzone słowo jest palindromem.

txt = input("Podaj text: ")

print("Słowo jest palindromem" if txt == txt[::-1] else "Słowo nie jest palindromem")