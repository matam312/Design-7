package Design7;

/*S30 FAANG Problem #127 {Hard} - https://www.youtube.com/watch?v=GbA033r-65Q

Implement least frequently used cache  using data structure. it should support get(key) and put(key,value) functions. 
the get(key) function get the value(which will always be positive) of the key if that exists in the cache else returns -1. 
similarly our put function set or insert the value if it is not already present. and when the cache reaches its capacity, 
it should invalidate the least frequently used item before inserting a new one. 
for this problem if there is a tie the least recently used key would be evicted. try to do both operations in O(1) time complexity.

Example:

LFUCache cache = new LFUCache( 2  capacity  );
cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.get(3);       // returns 3.
cache.put(4, 4);    // evicts key 1.
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4
Source Link: https://leetcode.com/problems/lfu-cache/
-------------------------------------------------------------------------------------------------------
Time complexity :O(N) 
space complexity:O(N) 
Approach:
Did this code run successfully in leetcode : yes
problems faces : no*/

public class LFUCache {

}
