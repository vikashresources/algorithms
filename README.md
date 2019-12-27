# algorithms

1. Finding Peak For 1D Array [Time Complexity : O(Log n)]
Given an array of integers. Find a peak element in it. An array element is peak if it is NOT smaller than its neighbors. For corner elements, we need to consider only one neighbor.

2. Find Local Minima For 1D Array [Time Complexity : O(Log n)]
An element arr[x] is a local minimum if it is less than or equal to both its neighbors. 

3. An extrema is an elements which is either greater than its both of neighbors or less than its both neighbors. First and last element can't be extrema.

4. The selection sort (Time Complexity: O(n2) as there are two nested loops.Auxiliary Space: O(1)) algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array. a) The subarray which is already sorted. b) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. Selection sort is in-place sorting and by default not stable. 

5. Stable Selection Sort: After sorting, relative position of elements inm output should maintain same order as in put. To achieve it, we need to do away with swap & instead set the minimum element to its required position and shift forward rest of the array. It's done continiously till full array is sorted.

6. Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

7. Optimized Bubble Sort: It's similar to bubble sort except here, additional loops are avoided if array is already or has sorted out. This increases optimization level and improves time complexity. So worst case compexity of bubble sort O(n2) becomes O(n) in best case improved version. Space complexity remains O(1) auxillary.

8. Insertion sort picks element one by one and places those element at their right place in the sorted list of elements. So their are n-1 passes to sort n items and its worst case complexity is O(n2). If array is already sorted which is best case then its complexity is O(n).

9. Quicksort [worst case complexity: O(n2), Best Case O(nlogn) & Avergae Case O(nlogn)] is a D&C algorithm for sorting which means it uses recursive solution. One element is selected as pivot element, usually at the begining. However choice of the position of the pivot element determines its complexity. Then array is re-arranged in such a way that all the elements smaller than pivot element are placed left to it and all the elements greator than are placed to right of pivot element. This places pivot element at its correct position. Then array is paritioned into two sub modules paritioned at pivot point and all elements in array is sorted recursively. Its space complexity remain at O(1). 

10. Mergesort [Complexity: O(nlogn)] is a D&C algorithm for sorting where first array is divided into subarrays till the point where no further division is possible. After that array is sorted and merged back to generate fully sorted array.

# D&C Complexity
For D&C problem set, master theorem can be used to calculate the complexity of alogrithm:
T(n) = aT(n/b) + ø((n^k)logpn)
Where n is the size of the problem.

a = number of subproblems in recursion, a > 0

n/b = size of each subproblem defined, n, b > 0

For solving this type of problem, we will use the following solutions,

If a>bk, then T(n) = ∅ (nlogba)
If a = bk, then
If p> -1, then T(n) = ∅(nlogba logp+1n)
If p = -1, then T(n) = ∅(nlogba loglogn)
If p < -1, then T(n) = ∅(nlogba)
If a<bk , then
If p> = 0, then T(n)= ∅(nklogpn)
If p< 0, then T(n) = ∅(nk)
