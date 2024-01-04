<h2><a href="https://www.geeksforgeeks.org/problems/find-element-occuring-once-when-all-other-are-present-thrice/1">Find element occuring once when all other are present thrice</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of integers <strong>arr[]</strong> of length <strong>N</strong>, every element <strong>appears</strong> <strong>thrice </strong>except for one which <strong>occurs</strong> <strong>once</strong>.</span><br><span style="font-size: 18px;">Find that element which <strong>occurs</strong> <strong>once</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 4
arr[] = {1, 10, 1, 1}
<strong>Output:
</strong>10<strong>
Explanation:
</strong>10 occurs once in the array while the other
element 1 occurs thrice.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 10
arr[] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1}
<strong>Output:
</strong>3<strong>
Explanation:
</strong>All elements except 3 occurs thrice in the array.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You do not need to take any input or print anything. You task is to complete the function <strong>singleElement</strong>() which takes an array of integers <strong>arr</strong> and an integer <strong>N</strong> which finds and returns the element <strong>occuring once</strong> in the array.</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N ≤ 10<sup>5</sup><br>-10<sup>9</sup> ≤ A[i] ≤ 10<sup>9</sup></span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity: </strong>O(N).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span><span style="font-size: 18px;"> </span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Mathematical</code>&nbsp;<code>Bit Magic</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;

<hr>

<h2><a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/">2870. Minimum Number of Operations to Make Array Empty</a></h2><h3>Medium</h3><hr><div><p>You are given a <strong>0-indexed</strong> array <code>nums</code> consisting of positive integers.</p>

<p>There are two types of operations that you can apply on the array <strong>any</strong> number of times:</p>

<ul>
	<li>Choose <strong>two</strong> elements with <strong>equal</strong> values and <strong>delete</strong> them from the array.</li>
	<li>Choose <strong>three</strong> elements with <strong>equal</strong> values and <strong>delete</strong> them from the array.</li>
</ul>

<p>Return <em>the <strong>minimum</strong> number of operations required to make the array empty, or </em><code>-1</code><em> if it is not possible</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [2,3,3,2,2,4,2,3,4]
<strong>Output:</strong> 4
<strong>Explanation:</strong> We can apply the following operations to make the array empty:
- Apply the first operation on the elements at indices 0 and 3. The resulting array is nums = [3,3,2,4,2,3,4].
- Apply the first operation on the elements at indices 2 and 4. The resulting array is nums = [3,3,4,3,4].
- Apply the second operation on the elements at indices 0, 1, and 3. The resulting array is nums = [4,4].
- Apply the first operation on the elements at indices 0 and 1. The resulting array is nums = [].
It can be shown that we cannot make the array empty in less than 4 operations.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [2,1,2,2,3,3]
<strong>Output:</strong> -1
<strong>Explanation:</strong> It is impossible to empty the array.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
</ul>
</div>