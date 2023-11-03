<h2><a href="https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/">2859. Sum of Values at Indices With K Set Bits</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>0-indexed</strong> integer array <code>nums</code> and an integer <code>k</code>.</p>

<p>Return <em>an integer that denotes the <strong>sum</strong> of elements in </em><code>nums</code><em> whose corresponding <strong>indices</strong> have <strong>exactly</strong> </em><code>k</code><em> set bits in their binary representation.</em></p>

<p>The <strong>set bits</strong> in an integer are the <code>1</code>'s present when it is written in binary.</p>

<ul>
	<li>For example, the binary representation of <code>21</code> is <code>10101</code>, which has <code>3</code> set bits.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [5,10,1,5,2], k = 1
<strong>Output:</strong> 13
<strong>Explanation:</strong> The binary representation of the indices are: 
0 = 000<sub>2</sub>
1 = 001<sub>2</sub>
2 = 010<sub>2</sub>
3 = 011<sub>2</sub>
4 = 100<sub>2 
</sub>Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
Hence, the answer is nums[1] + nums[2] + nums[4] = 13.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [4,3,2,1], k = 2
<strong>Output:</strong> 1
<strong>Explanation:</strong> The binary representation of the indices are:
0 = 00<sub>2</sub>
1 = 01<sub>2</sub>
2 = 10<sub>2</sub>
3 = 11<sub>2
</sub>Only index 3 has k = 2 set bits in its binary representation.
Hence, the answer is nums[3] = 1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= k &lt;= 10</code></li>
</ul>
</div>

<hr>

<h2><a href="https://leetcode.com/problems/find-the-maximum-achievable-number/">2769. Find the Maximum Achievable Number</a></h2><h3>Easy</h3><hr><div><p>You are given two integers, <code>num</code> and <code>t</code>.</p>

<p>An integer <code>x</code> is called <b>achievable</b> if it can become equal to <code>num</code> after applying the following operation no more than <code>t</code> times:</p>

<ul>
	<li>Increase or decrease <code>x</code> by <code>1</code>, and simultaneously increase or decrease <code>num</code> by <code>1</code>.</li>
</ul>

<p>Return <em>the maximum possible achievable number</em>. It can be proven that there exists at least one achievable number.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> num = 4, t = 1
<strong>Output:</strong> 6
<strong>Explanation:</strong> The maximum achievable number is x = 6; it can become equal to num after performing this operation:
1- Decrease x by 1, and increase num by 1. Now, x = 5 and num = 5. 
It can be proven that there is no achievable number larger than 6.

</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> num = 3, t = 2
<strong>Output:</strong> 7
<strong>Explanation:</strong> The maximum achievable number is x = 7; after performing these operations, x will equal num: 
1- Decrease x by 1, and increase num by 1. Now, x = 6 and num = 4.
2- Decrease x by 1, and increase num by 1. Now, x = 5 and num = 5.
It can be proven that there is no achievable number larger than 7.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= num, t&nbsp;&lt;= 50</code></li>
</ul>
</div>