<h2><a href="https://leetcode.com/problems/find-the-array-concatenation-value/">2562. Find the Array Concatenation Value</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>0-indexed</strong> integer array <code>nums</code>.</p>

<p>The <strong>concatenation</strong> of two numbers is the number formed by concatenating their numerals.</p>

<ul>
	<li>For example, the concatenation of <code>15</code>, <code>49</code> is <code>1549</code>.</li>
</ul>

<p>The <strong>concatenation value</strong> of <code>nums</code> is initially equal to <code>0</code>. Perform this operation until <code>nums</code> becomes empty:</p>

<ul>
	<li>If there exists more than one number in <code>nums</code>, pick the first element and last element in <code>nums</code> respectively and add the value of their concatenation to the <strong>concatenation value</strong> of <code>nums</code>, then delete the first and last element from <code>nums</code>.</li>
	<li>If one element exists, add its value to the <strong>concatenation value</strong> of <code>nums</code>, then delete it.</li>
</ul>

<p>Return<em> the concatenation value of the <code>nums</code></em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [7,52,2,4]
<strong>Output:</strong> 596
<strong>Explanation:</strong> Before performing any operation, nums is [7,52,2,4] and concatenation value is 0.
 - In the first operation:
We pick the first element, 7, and the last element, 4.
Their concatenation is 74, and we add it to the concatenation value, so it becomes equal to 74.
Then we delete them from nums, so nums becomes equal to [52,2].
 - In the second operation:
We pick the first element, 52, and the last element, 2.
Their concatenation is 522, and we add it to the concatenation value, so it becomes equal to 596.
Then we delete them from the nums, so nums becomes empty.
Since the concatenation value is 596 so the answer is 596.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [5,14,13,8,12]
<strong>Output:</strong> 673
<strong>Explanation:</strong> Before performing any operation, nums is [5,14,13,8,12] and concatenation value is 0.
 - In the first operation:
We pick the first element, 5, and the last element, 12.
Their concatenation is 512, and we add it to the concatenation value, so it becomes equal to 512.
Then we delete them from the nums, so nums becomes equal to [14,13,8].
 - In the second operation:
We pick the first element, 14, and the last element, 8.
Their concatenation is 148, and we add it to the concatenation value, so it becomes equal to 660.
Then we delete them from the nums, so nums becomes equal to [13].
 - In the third operation:
nums has only one element, so we pick 13 and add it to the concatenation value, so it becomes equal to 673.
Then we delete it from nums, so nums become empty.
Since the concatenation value is 673 so the answer is 673.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>
<style type="text/css">.spoilerbutton {display:block; border:dashed; padding: 0px 0px; margin:10px 0px; font-size:150%; font-weight: bold; color:#000000; background-color:cyan; outline:0; 
}
.spoiler {overflow:hidden;}
.spoiler > div {-webkit-transition: all 0s ease;-moz-transition: margin 0s ease;-o-transition: all 0s ease;transition: margin 0s ease;}
.spoilerbutton[value="Show Message"] + .spoiler > div {margin-top:-500%;}
.spoilerbutton[value="Hide Message"] + .spoiler {padding:5px;}
</style><style class="darkreader darkreader--sync" media="screen"></style>
</div>

<hr>

<h2><a href="https://leetcode.com/problems/excel-sheet-column-title/">168. Excel Sheet Column Title</a></h2><h3>Easy</h3><hr><div><p>Given an integer <code>columnNumber</code>, return <em>its corresponding column title as it appears in an Excel sheet</em>.</p>

<p>For example:</p>

<pre>A -&gt; 1
B -&gt; 2
C -&gt; 3
...
Z -&gt; 26
AA -&gt; 27
AB -&gt; 28 
...
</pre>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> columnNumber = 1
<strong>Output:</strong> "A"
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> columnNumber = 28
<strong>Output:</strong> "AB"
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> columnNumber = 701
<strong>Output:</strong> "ZY"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= columnNumber &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
</div>