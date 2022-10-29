def bubble_sort(arr):
    n = len(arr)
    swapped = False

    for i in range(n - 1):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                swapped = True
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

        if not swapped:
            return arr

    return arr


input_arr = [65, 76, 34, 45, 23, 657, 34, 34, 2, 43]
sorted_arr = bubble_sort([x for x in input_arr])

print("Input: ", input_arr, "Output: ", sorted_arr)
