def search(txt, pat, q):
    q = 101
    m = len(pat)
    n = len(txt)
    d = 256
    j = 0
    p = 0
    t = 0
    h = 1

    occurrences = []

    for i in range(m - 1):
        h = (h * d) % q

    for i in range(m):
        p = (d * p + ord(pat[i])) % q
        t = (d * t + ord(txt[i])) % q

    for i in range(n - m + 1):
        if p == t:
            for j in range(m):
                if txt[i + j] != pat[j]:
                    break

            j += 1

            if j == m:
                occurrences.append(i)

        if i < n - m:
            t = (d * (t - ord(txt[i]) * h) + ord(txt[i + m])) % q

            if t < 0:
                t = t + q

    return occurrences


print("Wystąpienia: ", ', '.join(map(str, search("ABAAABCD", "AB"))))
