# Napisz skrypt, który zliczy ilość spacji w pliku, a wynik zapisze w nowym pliku tekstowym.


with open('mod_2_zad_5_example.txt', 'r') as file:
    data = file.read()

    with open('mod_2_zad_5_example_output.txt', 'w') as file_output:
        file_output.write(f"Ilość spacji: {data.count(' ')}")