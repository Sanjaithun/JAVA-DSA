a = int(input("Enter a number"))
for i in range(a):
    for j in range(i+1):
        if (i+j)%2 == 0:
            print(" 1 ",end='')
        else:
            print(" 0 ",end='')
    print()







# 1
# 01
# 101
# 0101
# 10101