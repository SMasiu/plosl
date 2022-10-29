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


print('min & max of [1, 0, 5, 7, 9, 3]:', get_min_max([1, 0, 5, 7, 9, 3]))
print('max of [1, 0, 5, 7, 9, 3]:', get_max([1, 0, 5, 7, 9, 3]))
