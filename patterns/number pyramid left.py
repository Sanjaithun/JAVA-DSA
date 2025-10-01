a = int(input("Enter a number: "))
k = []
for i in range(1,a+1):
    k.append(str(i))
    k.sort(reverse=True)
    l = [v for v in k]
    l.sort()
    # k.append("")
    m = " ".join(k)+" "+" ".join(l[1:])
    
    print((a-i)*"  ",m)
