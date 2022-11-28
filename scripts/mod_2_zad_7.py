# Utwórz klasę Punkt, która będzie reprezentować punkt $(x,y)$.
# Następnie utwórz dwa obiekty tej klasy i oblicz odległość pomiędzy tymi punktami (przy pomocy funkcji).

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def calc_distance(self, other):
        return ((self.x - other.x) ** 2 + (self.y - other.y) ** 2) ** 0.5


p1_x = float(input("Podaj x dla punktu 1: "))
p1_y = float(input("Podaj y dla punktu 1: "))

p2_x = float(input("Podaj x dla punktu 2: "))
p2_y = float(input("Podaj y dla punktu 2: "))


p1 = Point(p1_x, p1_y)
p2 = Point(p2_x, p2_y)

print(f"Odległość: {p1.calc_distance(p2)}")
