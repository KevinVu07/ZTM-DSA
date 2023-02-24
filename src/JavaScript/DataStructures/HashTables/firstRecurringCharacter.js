// given an array, identify and return the first recurring character/number

function firstRecurringCharacter(input) {
    let map = {};
    for (let i = 0; i < input.length; i++) {
        if (map[input[i]]) {
            return input[i];
        } else {
            map[input[i]] = true;
        }
        console.log(map)
    }
    return undefined;
}

let firstRecurCharacter = firstRecurringCharacter([2, 5, 1, 2, 3, 4, 1, 2, 4])
console.log("First recurring number is " + firstRecurCharacter);