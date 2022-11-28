def partition(array, low, high):
    # choose the rightmost element as pivot
    pivot = array[high]

    i = low - 1

    for j in range(low, high):
        if array[j] <= pivot:
            i = i + 1

            (array[i], array[j]) = (array[j], array[i])

    (array[i + 1], array[high]) = (array[high], array[i + 1])

    return i + 1


def quick_sort(array, low, high):
    if low < high:
        pi = partition(array, low, high)

        quick_sort(array, low, pi - 1)
        quick_sort(array, pi + 1, high)

    return array


if __name__ == '__main__':
    input_arr = [65, 76, 34, 45, 23, 657, 34, 34, 2, 43]
    sorted_arr = quick_sort([x for x in input_arr], 0, len(input_arr) - 1)

    print("Input: ", input_arr, "Output: ", sorted_arr)
