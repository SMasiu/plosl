# Napisz skrypt, który obliczy sumę/wartość średnią/medianę wpisanych liczb przez użytkownika liczb całkowitych.


def median(lst):
    sorted_lst = sorted(lst)
    len_lst = len(lst)
    index = (len_lst - 1) // 2

    if len_lst % 2:
        return sorted_lst[index]
    else:
        return (sorted_lst[index] + sorted_lst[index + 1]) / 2.0


x = [int(num) for num in input('Podaj liczby oddzielone spacją: ').split(' ')]
sum_x = sum(x)
len_x = len(x)


print(f'Suma: {sum_x}')
print(f'Wartość średnia: {sum_x / len_x}')
print(f'Mediana: {median(x)}')
