<h2><a href="https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/">2442. Count Number of Distinct Integers After Reverse Operations</a></h2><h3>Medium</h3><hr><div><p>You are given an array <code>nums</code> consisting of <strong>positive</strong> integers.</p>

<p>You have to take each integer in the array, <strong>reverse its digits</strong>, and add it to the end of the array. You should apply this operation to the original integers in <code>nums</code>.</p>

<p>Return <em>the number of <strong>distinct</strong> integers in the final array</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,13,10,12,31]
<strong>Output:</strong> 6
<strong>Explanation:</strong> After including the reverse of each number, the resulting array is [1,13,10,12,31,<u>1,31,1,21,13</u>].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [2,2,2]
<strong>Output:</strong> 1
<strong>Explanation:</strong> After including the reverse of each number, the resulting array is [2,2,2,<u>2,2,2</u>].
The number of distinct integers in this array is 1 (The number 2).
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
</ul>
</div>

<hr>

<h2><a href="https://leetcode.com/problems/find-the-original-array-of-prefix-xor/">2433. Find The Original Array of Prefix Xor</a></h2><h3>Medium</h3><hr><div><p>You are given an <strong>integer</strong> array <code>pref</code> of size <code>n</code>. Find and return <em>the array </em><code>arr</code><em> of size </em><code>n</code><em> that satisfies</em>:</p>

<ul>
	<li><code>pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]</code>.</li>
</ul>

<p>Note that <code>^</code> denotes the <strong>bitwise-xor</strong> operation.</p>

<p>It can be proven that the answer is <strong>unique</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> pref = [5,2,0,3,1]
<strong>Output:</strong> [5,7,2,3,2]
<strong>Explanation:</strong> From the array [5,7,2,3,2] we have the following:
- pref[0] = 5.
- pref[1] = 5 ^ 7 = 2.
- pref[2] = 5 ^ 7 ^ 2 = 0.
- pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
- pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> pref = [13]
<strong>Output:</strong> [13]
<strong>Explanation:</strong> We have pref[0] = arr[0] = 13.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= pref.length &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= pref[i] &lt;= 10<sup>6</sup></code></li>
</ul>
</div>