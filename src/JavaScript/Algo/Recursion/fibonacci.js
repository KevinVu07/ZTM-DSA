// Given number N return index value of the Fibonacci sequence

// Fib sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
// pattern is each value is the sum of the previous 2 values
// for example, N=5 -> 2+3


function fibonacciIterative(n) { // O(n)
    let arr = [0, 1];
    for (let i = 2; i <= n; i++) {
        arr.push(arr[i - 2] + arr[i - 1])
    }
    return arr[n];
}

console.log(fibonacciIterative(8));

function fibonacciRecursive(n) {  // O(2^n) exponential time complexity
    if (n < 2) return n;
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}

console.log(fibonacciRecursive(8));