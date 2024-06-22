n = int(input())
nums = list(map(int, input().split()))

min_num = nums[0]
max_num = nums[0]

for i in nums:
    if i < min_num:
        min_num = i
print(min_num)

for j in nums:
    if j > max_num:
        max_num = j
print(max_num)