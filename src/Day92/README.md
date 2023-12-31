<h2><a href="https://leetcode.com/problems/largest-substring-between-two-equal-characters/">1624. Largest Substring Between Two Equal Characters</a><p>
</h2>

Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.



Example 1:

Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.
Example 2:

Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".
Example 3:

Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s.


Constraints:

1 <= s.length <= 300
s contains only lowercase English letters.

<hr>

<h2><a href="https://leetcode.com/problems/find-subarrays-with-equal-sum/">2395. Find Subarrays With Equal Sum</a></h2><h3>Easy</h3><hr><div><p>Given a <strong>0-indexed</strong> integer array <code>nums</code>, determine whether there exist <strong>two</strong> subarrays of length <code>2</code> with <strong>equal</strong> sum. Note that the two subarrays must begin at <strong>different</strong> indices.</p>

<p>Return <code>true</code><em> if these subarrays exist, and </em><code>false</code><em> otherwise.</em></p>

<p>A <b>subarray</b> is a contiguous non-empty sequence of elements within an array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [4,2,4]
<strong>Output:</strong> true
<strong>Explanation:</strong> The subarrays with elements [4,2] and [2,4] have the same sum of 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,4,5]
<strong>Output:</strong> false
<strong>Explanation:</strong> No two subarrays of size 2 have the same sum.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [0,0,0]
<strong>Output:</strong> true
<strong>Explanation:</strong> The subarrays [nums[0],nums[1]] and [nums[1],nums[2]] have the same sum of 0. 
Note that even though the subarrays have the same content, the two subarrays are considered different because they are in different positions in the original array.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>
</div>