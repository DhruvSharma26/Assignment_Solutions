def generate_fibonacci_up_to_n(N):
    fib = [0, 1]
    while fib[-1] + fib[-2] <= N:
        fib.append(fib[-1] + fib[-2])
    return fib

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def get_fibonacci_primes(N):
    fibonacci = generate_fibonacci_up_to_n(N)
    primes = [num for num in fibonacci if is_prime(num)]
    return fibonacci, primes

N = 100
fibonacci, primes = get_fibonacci_primes(N)
print(f"Fibonacci up to {N}: {fibonacci}")
print(f"Prime numbers in Fibonacci sequence: {primes}")
