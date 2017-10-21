/*Count the number of prime numbers less than a non-negative number, n.*/
class Solution {
    public int countPrimes(int n) {
        if (n <= 2 )
            return 0;
        int countPrimes = 1;
        for (int i =3; i < n; i++) {
            if (isPrime(i))
                countPrimes++;     
        }
        return countPrimes;
    }
    
    private boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
