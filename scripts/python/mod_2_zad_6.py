# Zaimplementuj klasę Kolo, która będzie miała dwie metody (bezargumentowe) obliczające pole kola, oraz obwód.

import math


class Circle:
    def __init__(self, r):
        self.r = r

    def area(self):
        return self.r ** 2 * math.pi

    def perimeter(self):
        return 2 * math.pi * self.r


circle_r = float(input('Podaj r: '))

circle = Circle(circle_r)

print(f'area: {circle.area()}')
print(f'perimeter: {circle.perimeter()}')
