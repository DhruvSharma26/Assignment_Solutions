def find_second_largest(nums):
    unique_nums = list(set(nums))  
    if len(unique_nums) < 2:
        return None  
    unique_nums.sort(reverse=True)
    return unique_nums[1]

numbers = [10, 20, 4, 45, 99, 99, 20]
second_largest = find_second_largest(numbers)
print("Second largest number:", second_largest)
