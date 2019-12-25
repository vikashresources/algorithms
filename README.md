# algorithms

1. Finding Peak For 1D Array [Time Complexity : O(Log n)]
Given an array of integers. Find a peak element in it. An array element is peak if it is NOT smaller than its neighbors. For corner elements, we need to consider only one neighbor.

2. Find Local Minima For 1D Array [Time Complexity : O(Log n)]
An element arr[x] is a local minimum if it is less than or equal to both its neighbors. 

3. An extrema is an elements which is either greater than its both of neighbors or less than its both neighbors. First and last element can't be extrema.

4. The selection sort (Time Complexity: O(n2) as there are two nested loops.Auxiliary Space: O(1)) algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

a) The subarray which is already sorted.
b) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. Selection sort is in-place sorting and by default not stable. 

5. Stable Selection Sort: After sorting, relative position of elements inm output should maintain same order as in put. To achieve it, we need to do away with swap & instead set the minimum element to its required position and shift forward rest of the array. It's done continiously till full array is sorted.
