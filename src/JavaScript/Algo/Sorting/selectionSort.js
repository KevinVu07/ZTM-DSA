const numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];

function selectionSort(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        let min = arr[i];
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] < min) {
                let temp = arr[i];
                min = arr[j];
                arr[i] = min;
                arr[j] = temp;
            }
        }
    }
}

selectionSort(numbers);
console.log(numbers);