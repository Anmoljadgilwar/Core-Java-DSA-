/**
 * @param {integer} num
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function (init) {
  let current = init;

  return {
    increment: () => ++current,
    decrement: () => --current,
    reset: () => (current = init),
  };
};

const counter = createCounter(5);

console.log(counter.increment());
console.log(counter.decrement());
console.log(counter.decrement());
console.log(counter.reset());
