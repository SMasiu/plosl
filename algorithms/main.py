def get_min_max(tab):
    current_max = tab[0]
    current_min = tab[0]

    for x in tab[1:]:
        if x > current_max:
            current_max = x
        elif x < current_min:
            current_min = x

    return current_min, current_max


def get_max(tab):
    current_max = tab[0]

    for x in tab[1:]:
        if x > current_max:
            current_max = x

    return current_max


class Stack:
    data = []

    def push(self, value):
        self.data.append(value)

    def pop(self):
        if self.data:
            return self.data.pop()

        return None

    def top(self):
        if self.data:
            return self.data[-1]

        return None

    def has(self, value):
        return value in self.data


print('min & max of [1, 0, 5, 7, 9, 3]:', get_min_max([1, 0, 5, 7, 9, 3]))
print('max of [1, 0, 5, 7, 9, 3]:', get_max([1, 0, 5, 7, 9, 3]))

stack = Stack()

print('stack top:', stack.top())
print('stack push: 5')
stack.push(5)

print('stack push: 3')
stack.push(3)

print('stack top:', stack.top())
print('stack pop:', stack.pop())
print('stack top:', stack.top())

print('stack has: 5', stack.has(5))
print('stack has: 3', stack.has(3))
