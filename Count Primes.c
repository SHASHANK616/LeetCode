/*Given an integer n, return the number of prime numbers that are strictly less than n.*/

int countPrimes(int n) {
       if (n <= 2) return 0; 

    int* prime = (int*)calloc(n, sizeof(int));

    for (int i = 2; i * i < n; i++) {
        if (prime[i] == 0) {
            for (int j = i * i; j < n; j += i) {
                prime[j] = 1;
            }
        }
    }

    int count = 0;
    for (int i = 2; i < n; i++) {
        if (prime[i] == 0) {
            count++;
        }
    }

    return count;
}
