list1=list(map(int,input().split()))
list1.sort()
for i in range(100):
    if i!=list1[i]-1:
        print(i+1)
        break
