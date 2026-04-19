var createHelloWorld = function () {
  return function (...args) {
    return "Hello World";
  };
};
var obj = createHelloWorld();
console.log(obj); // "Hello World"
console.log(obj(1, 2, 3)); // "Hello World"

/*
//Typescript
function createHelloWorld(): (...args: any[]) => string {
    return (...args: any[]): string => {
        return "Hello World";
    };
}

*/
