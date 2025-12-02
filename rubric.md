# Project Assessment Rubric

**Project:** Simple Bank System
**Section:** C2A
**Course:** Data Structures
**Assessment Date:** December 1, 2025

## Members

1. **ROSELL, JOSIAH LAMUEL** - Primary developer (all git commits)
2. **GARCIA, ARIANNA NICOLE** - Team member
3. **PECAYO, MIGUEL ALFONSO** - Team member

## Grading Breakdown

### 1. Data Structure Completeness & Implementation (50%)

**Score:** 35/50

| Data Structure | Implementation           | Functions                         | Notes                                      |
| -------------- | ------------------------ | --------------------------------- | ------------------------------------------ |
| ArrayList      | **Custom (Array-based)** | add, resize, list, getSize, clear | Missing: add at start/index, search, sort  |
| LinkedList     | **Custom (Singly)**      | addEnd only                       | Very minimal - missing most functions      |
| Stack          | **Custom (Array-based)** | push, pop, isEmpty                | Missing: peek, list, clear                 |
| Queue          | **Custom (Circular)**    | enqueue, dequeue                  | Circular array - good! Missing: peek, list |
| Tree           | **Custom (BST)**         | insert (recursive), search        | Missing: traversal/list, clear             |

**Deductions:**

- -5: LinkedList barely implemented (only addEnd)
- -5: Missing search function in ArrayList/LinkedList
- -3: Missing sort function
- -2: Missing list/display for Stack, Queue, BST

**Positive Notes:**

- All 5 data structures present and custom
- Good circular queue implementation
- BST used effectively for account lookup
- ArrayList used for receipt tracking

### 2. Visualization (30%)

**Score:** 20/30

- Clean ASCII art menu interface
- Balance and receipt display
- Account menu personalization
- -5: No BST traversal visualization
- -3: No Stack/Queue content display
- -2: LinkedList not visualized

### 3. Short Paper (20%)

**Score:** 20/20

- **File:** paper.md (short paper)
- Covers all 3 members: Rosell, Garcia, Pecayo
- Describes implementation challenges and learnings
- Good reflection on teamwork and debugging process

---

## Base Grade: **75/100**

### Extra Points: **+5.0**

| Category      | Points | Justification                                   |
| ------------- | :----: | ----------------------------------------------- |
| Visualization |  1.5   | Clean ASCII menu, box UI formatting             |
| Features      |  2.0   | Banking application theme, receipt tracking     |
| Extras        |  1.5   | **BEST INPUT VALIDATION** - name/PIN validation |

## Final Grade: **80/100**

### Summary

Solid banking system implementation with all 5 custom data structures integrated into a practical application. The BST is used well for account management, and the circular queue shows good understanding. However, many required functions are missing from the data structures (search, sort, add at index, display/traversal). The LinkedList is barely used. Good teamwork documentation in the paper. Members: Rosell, Garcia, Pecayo.

### Highlights

- Practical banking application theme
- All structures are custom (no Java built-ins)
- Circular queue implementation
- Clean menu interface
- Good team collaboration paper

### Areas for Improvement

- Add search and sort to ArrayList/LinkedList
- Implement BST traversal for listing accounts
- Add display methods for Stack and Queue
- Expand LinkedList functionality

---

_Assessment generated on December 1, 2025_
_Updated: December 1, 2025 (bonus points added)_
