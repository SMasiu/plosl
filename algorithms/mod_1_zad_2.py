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
