<h2><a href="https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/">2038. Remove Colored Pieces if Both Neighbors are the Same Color</a></h2><h3>Medium</h3><hr><div><p>There are <code>n</code> pieces arranged in a line, and each piece is colored either by <code>'A'</code> or by <code>'B'</code>. You are given a string <code>colors</code> of length <code>n</code> where <code>colors[i]</code> is the color of the <code>i<sup>th</sup></code> piece.</p>

<p>Alice and Bob are playing a game where they take <strong>alternating turns</strong> removing pieces from the line. In this game, Alice moves<strong> first</strong>.</p>

<ul>
	<li>Alice is only allowed to remove a piece colored <code>'A'</code> if <strong>both its neighbors</strong> are also colored <code>'A'</code>. She is <strong>not allowed</strong> to remove pieces that are colored <code>'B'</code>.</li>
	<li>Bob is only allowed to remove a piece colored <code>'B'</code> if <strong>both its neighbors</strong> are also colored <code>'B'</code>. He is <strong>not allowed</strong> to remove pieces that are colored <code>'A'</code>.</li>
	<li>Alice and Bob <strong>cannot</strong> remove pieces from the edge of the line.</li>
	<li>If a player cannot make a move on their turn, that player <strong>loses</strong> and the other player <strong>wins</strong>.</li>
</ul>

<p>Assuming Alice and Bob play optimally, return <code>true</code><em> if Alice wins, or return </em><code>false</code><em> if Bob wins</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> colors = "AAABABB"
<strong>Output:</strong> true
<strong>Explanation:</strong>
A<u>A</u>ABABB -&gt; AABABB
Alice moves first.
She removes the second 'A' from the left since that is the only 'A' whose neighbors are both 'A'.

Now it's Bob's turn.
Bob cannot make a move on his turn since there are no 'B's whose neighbors are both 'B'.
Thus, Alice wins, so return true.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> colors = "AA"
<strong>Output:</strong> false
<strong>Explanation:</strong>
Alice has her turn first.
There are only two 'A's and both are on the edge of the line, so she cannot move on her turn.
Thus, Bob wins, so return false.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> colors = "ABBBBBBBAAA"
<strong>Output:</strong> false
<strong>Explanation:</strong>
ABBBBBBBA<u>A</u>A -&gt; ABBBBBBBAA
Alice moves first.
Her only option is to remove the second to last 'A' from the right.

ABBBB<u>B</u>BBAA -&gt; ABBBBBBAA
Next is Bob's turn.
He has many options for which 'B' piece to remove. He can pick any.

On Alice's second turn, she has no more pieces that she can remove.
Thus, Bob wins, so return false.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;=&nbsp;colors.length &lt;= 10<sup>5</sup></code></li>
	<li><code>colors</code>&nbsp;consists of only the letters&nbsp;<code>'A'</code>&nbsp;and&nbsp;<code>'B'</code></li>
</ul>
</div>


<hr>
	
<h2><a href="https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/">2419. Longest Subarray With Maximum Bitwise AND</a></h2><h3>Medium</h3><hr><div><p>You are given an integer array <code>nums</code> of size <code>n</code>.</p>

<p>Consider a <strong>non-empty</strong> subarray from <code>nums</code> that has the <strong>maximum</strong> possible <strong>bitwise AND</strong>.</p>

<ul>
	<li>In other words, let <code>k</code> be the maximum value of the bitwise AND of <strong>any</strong> subarray of <code>nums</code>. Then, only subarrays with a bitwise AND equal to <code>k</code> should be considered.</li>
</ul>

<p>Return <em>the length of the <strong>longest</strong> such subarray</em>.</p>

<p>The bitwise AND of an array is the bitwise AND of all the numbers in it.</p>

<p>A <strong>subarray</strong> is a contiguous sequence of elements within an array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,3,2,2]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
The maximum possible bitwise AND of a subarray is 3.
The longest subarray with that value is [3,3], so we return 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> 1
<strong>Explanation:</strong>
The maximum possible bitwise AND of a subarray is 4.
The longest subarray with that value is [4], so we return 1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
</ul>
</div>
