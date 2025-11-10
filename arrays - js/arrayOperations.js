// Initialize array
const numbers = [1, 2, 3, 4, 5];

// Function to print array
function printArray(arr) {
  arr.forEach((value) => {
    console.log(value);
  });
}

// Function to find maximum value in array
function findMaxValue(arr) {
  let max = arr[0];
  for (const value of arr) {
    if (value > max) {
      max = value;
    }
  }
  return max;
}

// Function to find minimum value in array
function findMinValue(arr) {
  let min = arr[0];
  for (const value of arr) {
    if (value < min) {
      min = value;
    }
  }
  return min;
}

// Function to calculate sum of array
function calculateSum(arr) {
  let sum = 0;
  for (const value of arr) {
    sum += value;
  }
  return sum;
}

// Function to calculate average of array
function calculateAverage(arr) {
  const sum = calculateSum(arr);
  return sum / arr.length;
}

console.log("Array Elements:");
printArray(numbers);

console.log("Maximum Value:", findMaxValue(numbers));
console.log("Sum:", calculateSum(numbers));
console.log("Minimum Value:", findMinValue(numbers));
console.log("Average:", calculateAverage(numbers));

module.exports = {
  printArray,
  findMaxValue,
  findMinValue,
  calculateSum,
  calculateAverage,
};

