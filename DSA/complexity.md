| Time Complexity | Input Size: 10 | 100      | 1000      |
| --------------- | -------------- | -------- | --------- |
| `O(1)`          | 1 step         | 1        | 1         |
| `O(log n)`      | ~3 steps       | ~7       | ~10       |
| `O(n)`          | 10 steps       | 100      | 1000      |
| `O(n + m)`      |                |          | `2000`    |
| `O(n log n)`    | ~30 steps      | ~700     | ~10,000   |
| `O(n²)`         | 100 steps      | 10,000   | 1,000,000 |
| `O(2^n)`        | 1024 steps     | too slow | 🔥        |
| `O(n!)`         | 3.6 million    | 💀       | 💀💀      |

## O(n + m) Time Complexity

This notation means the algorithm's runtime depends on **two separate inputs**, `n` and `m`, and grows **linearly** with both.

---

### Think of it this way:

Imagine you have:

- A list of **n** students
- A list of **m** books

If you loop through **all students once**, then loop through **all books once**, you do:

```text
n steps + m steps = O(n + m)
```
