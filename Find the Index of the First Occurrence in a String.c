//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
int strStr(char* haystack, char* needle) {
    // Get the lengths of both haystack and needle
    int haystack_len = strlen(haystack);
    int needle_len = strlen(needle);

    // If needle is empty, return 0 (according to the problem definition)
    if (needle_len == 0) {
        return 0;
    }

    // If needle is longer than haystack, it's impossible to find it
    if (needle_len > haystack_len) {
        return -1;
    }

    // Loop through the haystack up to the point where the remaining characters are fewer than the needle length
    for (int i = 0; i <= haystack_len - needle_len; i++) {
        // Check if the substring starting at position i matches the needle
        if (strncmp(&haystack[i], needle, needle_len) == 0) {
            return i; // Return the starting index of the substring
        }
    }

    // If no match is found, return -1
    return -1;
}
