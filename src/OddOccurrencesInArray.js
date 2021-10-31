const A = [9, 3, 9, 3, 9, 7, 9];
const result = [];

A.sort((a,b) => a-b);
result.push(A[0]);

for (let i = 1; i < A.length; i++) {
    if (result.includes(A[i])) {
        result.pop(A[i]);
    } else {
        result.push(A[i]);
    }
}

return result[0];
