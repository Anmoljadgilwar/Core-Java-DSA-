# 20 DSA Patterns — detailed, practical, interview-ready guide 🚀

Nice — let’s go deep. For each pattern I’ll give: **what it is**, **when to use it**, **how to approach it (steps / template)**, **complexity**, **common pitfalls**, and **representative problems** you should practice. Bookmark this and use it as your interview checklist. 🔎

---

### 1) Two Pointers 🔁

**Idea:** Use two indices (`i`, `j`) that move toward each other or in the same direction to find pairs, partitions, or window boundaries without nested loops.

**When to use**

- Sorted array / string problems
- Pair-sum / triplet-sum, remove duplicates, partitioning tasks
- Reordering in-place

**Approach / template**

- If sorted: set `left = 0`, `right = n-1`, move based on comparison to target.
- For same-direction: maintain `i` as slow index and `j` as fast index (in-place overwrite).

```js
// sum in sorted array
let left = 0,
  right = arr.length - 1;
while (left < right) {
  const s = arr[left] + arr[right];
  if (s === target) return [left, right];
  if (s < target) left++;
  else right--;
}
```

**Complexity:** O(n) time, O(1) space (if in-place).
**Pitfalls:** Unsorted input; forgetting equal cases; off-by-one indexing.

**Practice:** Two Sum II (sorted), Container With Most Water, Remove Duplicates from Sorted Array.

---

### 2) Sliding Window 🪟

**Idea:** Maintain a window (contiguous subarray / substring) and expand/contract it to satisfy a condition.

**When to use**

- Subarray/subsequence with sum/length/unique constraints
- Longest/shortest substring/subarray problems

**Approach / template**

- Two pointers form window: `start`, `end`.
- Expand `end` to include elements; while condition violated, move `start` to shrink.

```js
let start = 0,
  sum = 0,
  best = -Infinity;
for (let end = 0; end < n; end++) {
  sum += arr[end];
  while (conditionNotSatisfied) {
    sum -= arr[start++];
  }
  best = Math.max(best, sum); // or update answer
}
```

**Complexity:** O(n) typically; O(1) extra space if not storing counts.
**Pitfalls:** Not updating window properly; forgetting to shrink; handling variable vs fixed window.

**Practice:** Longest Substring Without Repeating Characters, Minimum Window Substring, Max Sum of Size K.

---

### 3) Prefix Sum / Cumulative Sum ➕

**Idea:** Precompute cumulative sums so range queries become O(1); also used to reduce nested loops for subarray sums.

**When to use**

- Range-sum queries, number of subarrays with given sum, prefix-based checks

**Approach / template**

- `pref[i] = pref[i-1] + arr[i]`
- Subarray sum `arr[l..r] = pref[r] - pref[l-1]`
- Combine with HashMap to count occurrences: `pref - target` seen?

**Complexity:** O(n) time, O(n) space for prefix array or hashmap.
**Pitfalls:** Off-by-one in indices; negative numbers require hashmap technique.

**Practice:** Subarray Sum Equals K, Range Sum Query.

---

### 4) Fast & Slow Pointers (Tortoise & Hare) 🐢🐇

**Idea:** Use two pointers at different speeds to detect cycles or find mid-points in linked structures.

**When to use**

- Cycle detection in linked lists or functional graphs
- Finding middle of linked list
- Repeated patterns detection

**Approach / template**

- `slow = head`, `fast = head`
- Loop: `slow = slow.next`, `fast = fast.next.next`
- If `slow === fast` → cycle. To find start, reset one pointer to head etc.

**Complexity:** O(n) time, O(1) space.
**Pitfalls:** Null checks to avoid crashes; off-by-one in step counts.

**Practice:** Linked List Cycle, Find Middle of Linked List.

---

### 5) Binary Search (and Search-on-Answer) 🔍

**Idea:** Repeatedly halve the search space. Useful on sorted arrays or when searching for an answer in a monotonic function.

**When to use**

- Sorted data or monotonic property (feasible/not feasible)
- Find boundary (first true / last false)

**Approach / template**

- Standard binary search; for search-on-answer, define `feasible(mid)` and binary on `mid`.

```js
let lo = 0,
  hi = n - 1;
while (lo <= hi) {
  let mid = Math.floor((lo + hi) / 2);
  if (arr[mid] === target) return mid;
  if (arr[mid] < target) lo = mid + 1;
  else hi = mid - 1;
}
```

**Complexity:** O(log n).
**Pitfalls:** Wrong mid computation (overflow), infinite loop on boundaries, forgetting monotonic requirement.

**Practice:** Search in Rotated Sorted Array, Find Minimum in Sorted Rotated Array, Aggressive cows (search on answer).

---

### 6) Monotonic Stack 🧱

**Idea:** Maintain a stack of indices/values in increasing or decreasing order to answer next greater/smaller queries in one pass.

**When to use**

- Next greater element, span problems, histogram largest rectangle

**Approach / template**

- Iterate elements, pop while current breaks monotonic property, answers derive from popped items.

```js
const stack = [];
for (let i = 0; i < n; i++) {
  while (stack.length && arr[i] > arr[stack[stack.length - 1]]) {
    const idx = stack.pop();
    answer[idx] = arr[i];
  }
  stack.push(i);
}
```

**Complexity:** O(n).
**Pitfalls:** Confusing increasing vs decreasing stack; index vs value mix-up.

**Practice:** Next Greater Element, Daily Temperatures, Largest Rectangle in Histogram.

---

### 7) Heap / Priority Queue 🔼🔽

**Idea:** Access min/max quickly; maintain top-k elements or merge sorted streams.

**When to use**

- K largest/smallest elements, streaming medians, merging k lists

**Approach**

- Use min-heap for top-k largest (keep size k), max-heap for smallest, or two heaps for median streaming.

**Complexity:** Insert/extract O(log k).
**Pitfalls:** Wrong heap type for the job; forgetting to maintain heap size.

**Practice:** Kth Largest Element, Merge K Sorted Lists, Top K Frequent Elements, Median Finder.

---

### 8) Backtracking (DFS with choices) ↩️

**Idea:** Explore choices recursively, undoing (backtracking) when a branch fails. Use pruning aggressively.

**When to use**

- Permutations, combinations, subsets, constraint satisfaction (N-Queens)

**Approach / template**

1. Choose a variable
2. For each candidate value: apply, recurse, undo
3. Stop when solution found or all choices exhausted

```js
function backtrack(path, choices) {
  if (done) {
    results.push([...path]);
    return;
  }
  for (let c of choices) {
    path.push(c);
    backtrack(path, nextChoices);
    path.pop();
  }
}
```

**Complexity:** Exponential in worst-case; pruning reduces state.
**Pitfalls:** Not pruning; not marking used elements; generating duplicates.

**Practice:** Subsets, Permutations, Combination Sum, N-Queens.

---

### 9) Depth-First Search (DFS) 🌲

**Idea:** Traverse deeply (recursive or stack) before visiting siblings — great for connectivity, path-finding, and tree problems.

**When to use**

- Graph traversal, tree problems, connected components, backtracking subroutines

**Approach**

- Recursion with visited set for graphs; careful with recursion depth for large graphs (use iterative stack if needed).

**Complexity:** O(V + E) for graphs.
**Pitfalls:** Stack overflow with recursion, forgetting visited set → infinite loops.

**Practice:** Number of Islands, Path Sum, Clone Graph.

---

### 10) Breadth-First Search (BFS) 🌐

**Idea:** Level-order traversal using a queue — finds shortest path in unweighted graphs.

**When to use**

- Shortest path in unweighted graph, level order traversal, multi-source spread (rotting oranges)

**Approach**

- Use queue, push starting nodes, mark visited, process neighbors.

```js
const q = [start];
visited.add(start);
while (q.length) {
  const node = q.shift();
  for (const nei of neighbors(node)) {
    if (!visited.has(nei)) {
      visited.add(nei);
      q.push(nei);
    }
  }
}
```

**Complexity:** O(V + E).
**Pitfalls:** Using `shift()` on arrays (O(n)) — use deque/linked-list for efficiency in some languages.

**Practice:** Word Ladder, Binary Tree Level Order, Rotten Oranges.

---

### 11) Dynamic Programming (DP) — memoization & tabulation 💾

**Idea:** Break problem into overlapping subproblems and store results to avoid recomputation.

**When to use**

- Overlapping subproblems + optimal substructure (e.g., Fibonacci, LIS, knapsack)

**Approach**

- Identify state `dp[state]`, recurrence, base cases.
- Top-down memoization or bottom-up tabulation.

**Complexity:** Depends on number of states × transition cost.
**Pitfalls:** State design mistakes, forgetting base cases, huge state space (need optimization).

**Practice:** Climbing Stairs, Longest Increasing Subsequence, Coin Change, Edit Distance.

---

### 12) Greedy Algorithms 🟰

**Idea:** Make the best local choice hoping it leads to a global optimum — valid when greedy-choice property holds.

**When to use**

- Interval scheduling, selecting minimal pieces (like coins in some currencies), some optimization problems

**Approach**

- Sort by a greedy key (e.g., earliest finishing time) and build answer incrementally.

**Complexity:** Usually O(n log n) due to sorting.
**Pitfalls:** Greedy is not always correct — prove correctness or find counterexample.

**Practice:** Activity Selection, Jump Game, Fractional Knapsack, Gas Station.

---

### 13) Union-Find / Disjoint Set 🧩

**Idea:** Efficiently manage partitioned sets, supporting `find` and `union` with path compression and union by rank.

**When to use**

- Connectivity queries, cycle detection, Kruskal’s MST, grouping problems

**Approach**

- `parent[]`, `rank[]` (or size). Path compress on `find`.

**Complexity:** Nearly O(1) amortized (inverse Ackermann).
**Pitfalls:** Not using path compression or union by rank → slow.

**Practice:** Redundant Connection, Number of Provinces, Kruskal MST.

---

### 14) Topological Sort 🧭

**Idea:** Linear ordering of DAG nodes respecting directed edges — used for scheduling and dependency resolution.

**When to use**

- Task ordering, cycle detection in directed graphs, course prerequisites

**Approach**

- Kahn’s algorithm (indegree queue) or DFS postorder.

**Complexity:** O(V + E).
**Pitfalls:** Graph not DAG → cycle; forgetting to check for remaining nodes.

**Practice:** Course Schedule, Alien Dictionary, Build Order.

---

### 15) Trie (Prefix Tree) 🌳

**Idea:** Tree where each node represents a prefix — fast prefix queries and dictionary operations.

**When to use**

- Autocomplete, prefix counting, word search with many patterns

**Approach**

- Insert/search by traversing characters; nodes have `children` and `isWord`.

**Complexity:** Insert/search O(L) where L is word length.
**Pitfalls:** Memory heavy; consider compressions (radix tree) when needed.

**Practice:** Implement Trie, Word Search II, Autocomplete system.

---

### 16) Bit Manipulation & Bitmask DP 🔢

**Idea:** Use bitwise operators to represent subsets, toggle flags, or do fast arithmetic checks (parity, power of 2).

**When to use**

- Single-number problems (XOR), subset DP for small n, bit hacks

**Approach**

- XOR to cancel duplicates, `(x & -x)` to extract lowest set bit, bitmask DP iterate subsets.

**Complexity:** Very fast per operation; bitmask DP is `O(2^n * n)`.
**Pitfalls:** Misunderstanding signed shifts; not using long types for big numbers.

**Practice:** Single Number, Subset DP problems, Count bits, Travelling Salesman (small n via bitmask DP).

---

### 17) Matrix/Grid Traversal (DFS/BFS on grids) 🗺️

**Idea:** Treat grid cells as graph nodes with neighbors (4 or 8 directions).

**When to use**

- Island counting, shortest path on grid, flood fill, dynamic programming on matrices

**Approach**

- Standard DFS/BFS with visited boolean or in-place marking.

**Complexity:** O(rows \* cols).
**Pitfalls:** Boundary checks, revisiting cells, using recursion on huge grids (stack overflow).

**Practice:** Number of Islands, Surrounded Regions, Shortest Path in Binary Matrix.

---

### 18) Kadane’s Algorithm (Max Subarray) ⚡

**Idea:** Greedy + DP: keep current max ending here and global max. Very efficient for contiguous max-sum problems.

**When to use**

- Maximum subarray sum (contiguous)

**Approach**

- `current = max(num, current + num)`, `best = max(best, current)`

**Complexity:** O(n) time, O(1) space.
**Pitfalls:** All-negative array edge case (Kadane handles if initialized right).

**Practice:** Maximum Subarray, Maximum Circular Subarray (with min-subarray trick).

---

### 19) Merge Intervals / Interval Scheduling ⏱️

**Idea:** Sort by start (or end) and merge overlapping intervals or choose non-overlapping intervals greedily.

**When to use**

- Overlapping intervals, resource allocation, calendar merging

**Approach**

- Sort intervals by start; iterate and merge if overlap, else push new.

**Complexity:** O(n log n) due to sort.
**Pitfalls:** Wrong sort key; off-by-one merging condition.

**Practice:** Merge Intervals, Insert Interval, Meeting Rooms.

---

### 20) Reservoir Sampling & Randomized Algorithms 🎲

**Idea:** Randomly sample `k` items from a stream of unknown/huge size with equal probability.

**When to use**

- Random selection from stream, when memory is limited

**Approach**

- Fill reservoir initially; for `i >= k`, replace an element with probability `k / (i+1)`.

**Complexity:** O(n) time, O(k) space.
**Pitfalls:** Incorrect probability formula; bias in replacement.

**Practice:** Random Pick Index, Sampling from stream.

---

## Quick reference cheat-sheet (1-line rules) 📌

- Need fast lookup → **HashMap / HashSet**
- Previous / nested elements → **Stack**
- Level-order / shortest unweighted path → **BFS**
- Longest/shortest contiguous subarray → **Sliding window**
- Sorted data or monotonic search → **Binary search**
- Top K or streaming median → **Heap**
- Overlapping subproblems → **DP**
- Pair/triplet in sorted array → **Two pointers**
- Prefix/prefix-counts → **Prefix sum + HashMap**
- Connections / components → **Graph algorithms / Union-Find**

---

## How to _identify_ the pattern fast in an interview (10–15 seconds) ⏱️

1. **Ask:** Is data ordered? (Binary search / two pointers)
2. **Ask:** Need contiguous segment? (Sliding window / prefix sums)
3. **Ask:** Fast lookup by key? (HashMap)
4. **Ask:** Hierarchy / parent-child? (Tree/DFS)
5. **Ask:** Min/Max / top K? (Heap)
6. **Ask:** Constraints small (n ≤ 20)? (Backtracking / bitmask DP)
   Decide pattern, sketch approach, then code.

---

## Common interview strategy

1. Restate the problem and constraints.
2. Pick pattern(s) and justify briefly.
3. Write a clean template (I/O, edge cases).
4. Optimize and analyze time/space.
5. Run through 2–3 dry runs and explain.

---

If you want, I’ll do one of the following next (pick one) — I’ll _do it now_:

1. **Create a 30-day study roadmap** that sequences these patterns + daily problems.
2. **Give you 50 high-yield LeetCode problems** mapped to these patterns (with difficulty and expected time).
3. **Walk through 5 representative FAANG-style problems** (pattern → solution → coded answer in JavaScript or Java) step-by-step.

Which one should I build for you right away? 🔧✨
