s = []
for i in range(1, 31):
    s.append(i)
for i in range(28):
    n = int(input())
    s.remove(n)
print(s[0])
print(s[1])