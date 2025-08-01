```python
def two_sum(nums, target):
    # Create a hash set to store numbers we've seen
    seen = set()
    
    # Iterate through each number in the list
    for num in nums:
        # Calculate the required complement to reach the target
        complement = target - num
        
        # Check if the complement exists in the seen set
        if complement in seen:
            return (complement, num)  # Return the pair if found
        
        # Add the current number to the seen set for future reference
        seen.add(num)
    
    return None  # Return None if no pair is found

# Example usage
result = two_sum([2, 7, 11, 15], 9)
print(result)  # Output should be (2, 7)
```

### Explanation:
1. **Function Definition**: The `two_sum` function takes a list of numbers and a target sum as input.
2. **Hash Set**: We use a hash set called `seen` to store the numbers we have iterated over.
3. **Iterating through Numbers**: For each number in the list, we calculate its complement (the number needed to add to it to reach the target).
4. **Checking for Complements**: We check if the complement exists in the `seen` set. If it does, we return the pair.
5. **Adding to Set**: If the complement isn't found, we add the current number to the `seen` set.
6. **Return Statement**: If no such pair exists after checking all numbers, the function returns `None`.