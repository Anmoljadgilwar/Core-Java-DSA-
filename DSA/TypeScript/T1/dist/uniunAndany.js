"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
let followers = "1M";
let API_Request_Status = "pending";
let Airline_Seats = "window";
const order = [8, 16, 32, 64];
//avoid any
let currentOrder;
for (let i = 0; i < order.length; i++) {
    if (order[i] === 16) {
        currentOrder = order[i];
        break;
    }
    currentOrder = 4;
}
console.log(currentOrder);
console.log(followers);
console.log(API_Request_Status);
console.log(Airline_Seats);
//# sourceMappingURL=uniunAndany.js.map