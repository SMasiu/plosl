# Napisz skrypt, który będzie prostym kalkulatorem. Zwróć uwagę na dzielenie przez 0.

x = float(input('Podaj x: '))
y = float(input('Podaj y: '))

print(f'x + y = {x + y}')
print(f'x - y = {x - y}')
print(f'x * y = {x * y}')

if y == 0:
    print('Nie dzielimy przez 0')
else:
    print(f'x / y = {x / y}')
