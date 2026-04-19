// Write a function expect that takes a value and returns an object with a toBe method and a notToBe method.
//
// The toBe method should take another value and return true if the two values are equal, and throw an error otherwise.
//
// The notToBe method should take another value and return true if the two values are not equal, and throw an error otherwise.

var expect = function (val) {
  return {
    toBe: function (val2) {
      if (val === val2) {
        return true;
      } else {
        throw new Error("Not Equal");
      }
    },

    notToBe: function (val2) {
      if (val !== val2) {
        return true;
      } else {
        throw new Error("Equal");
      }
    },
  };
};

//expect(1).toBe(1);
// expect(1).notToBe(null);
//
// var obj = expect(1);
// console.log(obj.toBe(1));
// console.log(obj.notToBe(2));

//shorter version

// var expect = val => ({
//     toBe: val2 => {
//         if (val === val2) return true;
//         throw new Error("Not Equal");
//     },
//     notToBe: val2 => {
//         if (val !== val2) return true;
//         throw new Error("Equal");
//     }
// });
