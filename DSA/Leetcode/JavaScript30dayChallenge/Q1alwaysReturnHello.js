var createHelloWorld = function () {
  return function (...args) {
    return "Hello World";
  };
};

var obj = createHelloWorld();
obj();
