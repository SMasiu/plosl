import time
from random import random
from mod_2_zad_3 import bubble_sort
from mod_2_zad_4 import quick_sort


def generate_randomized_array(n):
    return [random() for _ in range(n)]


def main():
    for n in range(10000, 100000, 10000):
        test_data_set = generate_randomized_array(n)
        bubble_test_data_set = test_data_set.copy()
        quick_test_data_set = test_data_set.copy()

        bubble_start = time.time()
        bubble_sort(bubble_test_data_set)
        bubble_end = time.time()

        quick_start = time.time()
        quick_sort(quick_test_data_set, 0, len(quick_test_data_set) - 1)
        quick_end = time.time()

        print(f'bubble sort exec time: {bubble_end - bubble_start} for n = {n} elements')
        print(f'quick sort exec time: {quick_end - quick_start} for n = {n} elements')
        print('\n')


if __name__ == '__main__':
    main()
