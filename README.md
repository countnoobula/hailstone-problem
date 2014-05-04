hailstone-problem
=================

Thoughts during development
- int is 32bit, so at around 130000, it would overflow and take it back to the start. Therefore needed to use a long.
- Recursion caused a stackoverflow around the same point, easiest solution was to use a while loop.
