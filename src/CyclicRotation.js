let A = [3, 8, 9, 7, 6]
let K = 3;

let result = [];
const totalLength = A.length;

if (!totalLength) {
    return [];
}
for (let i = 0; i < totalLength; i++) {
    result[(i + K) % totalLength] = A[i];
}

return result;