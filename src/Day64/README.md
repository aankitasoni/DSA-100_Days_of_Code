<h2><a href="https://leetcode.com/problems/find-the-peaks/">2951. Find the Peaks</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>0-indexed</strong> array <code>mountain</code>. Your task is to find all the <strong>peaks</strong> in the <code>mountain</code> array.</p>

<p>Return <em>an array that consists of </em>indices<!-- notionvc: c9879de8-88bd-43b0-8224-40c4bee71cd6 --><em> of <strong>peaks</strong> in the given array in <strong>any order</strong>.</em></p>

<p><strong>Notes:</strong></p>

<ul>
	<li>A <strong>peak</strong> is defined as an element that is <strong>strictly greater</strong> than its neighboring elements.</li>
	<li>The first and last elements of the array are <strong>not</strong> a peak.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> mountain = [2,4,4]
<strong>Output:</strong> []
<strong>Explanation:</strong> mountain[0] and mountain[2] can not be a peak because they are first and last elements of the array.
mountain[1] also can not be a peak because it is not strictly greater than mountain[2].
So the answer is [].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> mountain = [1,4,3,8,5]
<strong>Output:</strong> [1,3]
<strong>Explanation:</strong> mountain[0] and mountain[4] can not be a peak because they are first and last elements of the array.
mountain[2] also can not be a peak because it is not strictly greater than mountain[3] and mountain[1].
But mountain [1] and mountain[3] are strictly greater than their neighboring elements.
So the answer is [1,3].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= mountain.length &lt;= 100</code></li>
	<li><code>1 &lt;= mountain[i] &lt;= 100</code></li>
</ul>
</div>

<hr>

<h2><a href="https://leetcode.com/problems/detect-capital/">520. Detect Capital</a></h2><h3>Easy</h3><hr><div><p>We define the usage of capitals in a word to be right when one of the following cases holds:</p>

<ul>
	<li>All letters in this word are capitals, like <code>"USA"</code>.</li>
	<li>All letters in this word are not capitals, like <code>"leetcode"</code>.</li>
	<li>Only the first letter in this word is capital, like <code>"Google"</code>.</li>
</ul>

<p>Given a string <code>word</code>, return <code>true</code> if the usage of capitals in it is right.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> word = "USA"
<strong>Output:</strong> true
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> word = "FlaG"
<strong>Output:</strong> false
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= word.length &lt;= 100</code></li>
	<li><code>word</code> consists of lowercase and uppercase English letters.</li>
</ul>
</div>