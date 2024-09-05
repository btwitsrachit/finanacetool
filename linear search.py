def linear_search(arr,x):
    for i in range(len(arr)):
        if arr[i]==x:
            return i
        return -1
arr=[2,3,6,4,7,5,0]
x=int(input("enter"))
result=linear_search(arr,x)
if result!=-1:
    print(f"element found at {result}")
else:
    print("oo")
#
def linear_search(arr, x):
    for i in range(len(arr)):
        if arr[i] == x:
            return i
    return -1

arr = [2, 5, 7, 9, 12, 15]
x = 9
result = linear_search(arr, x)
if result != -1:
    print(f"Element {x} is present at index {result}.")
else:
    print(f"Element {x} is not present in the array.")
