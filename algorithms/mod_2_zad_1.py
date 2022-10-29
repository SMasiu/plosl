def search(txt, pat):
    m = len(pat)
    n = len(txt)
    s = 0

    bad_char = [-1] * 256
    occurrences = []

    for i in range(m):
        bad_char[ord(pat[i])] = i

    while s <= n - m:
        j = m - 1

        while j >= 0 and pat[j] == txt[s + j]:
            j -= 1

        if j < 0:
            occurrences.append(s)
            s += (m - bad_char[ord(txt[s + m])] if s + m < n else 1)
        else:
            s += max(1, j - bad_char[ord(txt[s + j])])

    return occurrences


print("Wystąpienia: ", ', '.join(map(str, search("ABAAABCD", "AB"))))
