function reverse(str) {
    // check input

    if (!str || str.length < 2 || typeof str !== "string") {
        return "hmm that is not good";
    }

    const backwards = [];
    const totalItems = str.length - 1;
    for (let i = totalItems; (i >= 0); i--) {
        backwards.push(str[i]);
    }
    console.log(backwards);
    console.log(backwards.join(""));

    return backwards.join("");
}

reverse("Kevin");
