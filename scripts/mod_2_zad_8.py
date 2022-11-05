# Utwórz klasę, która będzie posiadała metodę odwracają ciąg znaków po wyrazie. Przykład:
# in: Jestem Groot. Jestem Groot.
# out: Groot. Jestem Groot. Jestem


class TextReverse:
    def __init__(self, text):
        self.text = text

    def reverse_by_word(self):
        split = self.text.split(" ")[::-1]

        return ' '.join(split)


txt = input('Podaj text: ')

text_reverse = TextReverse(txt)

print(f"Odwrócone wyrazy: {text_reverse.reverse_by_word()}")
