list_1 = [12,34,0,14,5]
list_2 = [19,12,33,41,4]

for start in range(len(list_1)):
    min_index=start

    for i in range(start+1, len(list_1)):
        if list_1[i] < list_1[min_index]:
            min_index=i
    
    list_1[start], list_1[min_index] = list_1[min_index], list_1[start]

print(list_1)

for start in range(len(list_2)):
    min_index=start

    for i in range(start+1, len(list_2)):
        if list_2[i] < list_2[min_index]:
            min_index=i
    
    list_2[start], list_2[min_index] = list_2[min_index], list_2[start]

print(list_2)

list_3 = list_1 + list_2

for start in range(len(list_3)):
    min_index=start

    for i in range(start+1, len(list_3)):
        if list_3[i] < list_3[min_index]:
            min_index=i
    
    list_3[start], list_3[min_index] = list_3[min_index], list_3[start]

print(list_1)