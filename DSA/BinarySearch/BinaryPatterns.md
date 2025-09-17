---
For exact value: return mid;

Ceiling: return start (smallest ≥ target).

Floor: return end (largest ≤ target).

OrderArignostic: check if(isAscending),

infiniteArray: //double the box size
  //end = previous end + sizeofbox * 2
  end = end + (end - start + 1) * 2;
  start = newStart;

  if end > target
  then Apply binary search
---
