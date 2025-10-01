a = int(input("Enter a number: "))
# k = []
# for i in range(1,a+1):
#     k.append(str(i))
#     print(" ".join(k))

for i in range(1,a+1):
    for j in range(i,0,-1):
        print(j,end='')
    
    print()