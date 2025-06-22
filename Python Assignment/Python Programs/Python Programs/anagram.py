def is_anagram(s1, s2):
    return sorted(s1) == sorted(s2)

str1 = "listen"
str2 = "silent"

if is_anagram(str1, str2):
    print(f'"{str1}" and "{str2}" are anagrams.')
else:
    print(f'"{str1}" and "{str2}" are not anagrams.')
