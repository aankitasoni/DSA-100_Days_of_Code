<h2><a href="https://leetcode.com/problems/rectangle-overlap/">836. Rectangle Overlap</a></h2><h3>Easy</h3><hr><div><p>An axis-aligned rectangle is represented as a list <code>[x1, y1, x2, y2]</code>, where <code>(x1, y1)</code> is the coordinate of its bottom-left corner, and <code>(x2, y2)</code> is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.</p>

<p>Two rectangles overlap if the area of their intersection is <strong>positive</strong>. To be clear, two rectangles that only touch at the corner or edges do not overlap.</p>

<p>Given two axis-aligned rectangles <code>rec1</code> and <code>rec2</code>, return <code>true</code><em> if they overlap, otherwise return </em><code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> rec1 = [0,0,2,2], rec2 = [1,1,3,3]
<strong>Output:</strong> true
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> rec1 = [0,0,1,1], rec2 = [1,0,2,1]
<strong>Output:</strong> false
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> rec1 = [0,0,1,1], rec2 = [2,2,3,3]
<strong>Output:</strong> false
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>rec1.length == 4</code></li>
	<li><code>rec2.length == 4</code></li>
	<li><code>-10<sup>9</sup> &lt;= rec1[i], rec2[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>rec1</code> and <code>rec2</code> represent a valid rectangle with a non-zero area.</li>
</ul>
</div>

<hr>

<h2><a href="https://leetcode.com/problems/counting-words-with-a-given-prefix/">2185. Counting Words With a Given Prefix</a></h2><h3>Easy</h3><hr><div><p>You are given an array of strings <code>words</code> and a string <code>pref</code>.</p>

<p>Return <em>the number of strings in </em><code>words</code><em> that contain </em><code>pref</code><em> as a <strong>prefix</strong></em>.</p>

<p>A <strong>prefix</strong> of a string <code>s</code> is any leading contiguous substring of <code>s</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["pay","<strong><u>at</u></strong>tention","practice","<u><strong>at</strong></u>tend"], <code>pref </code>= "at"
<strong>Output:</strong> 2
<strong>Explanation:</strong> The 2 strings that contain "at" as a prefix are: "<u><strong>at</strong></u>tention" and "<u><strong>at</strong></u>tend".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["leetcode","win","loops","success"], <code>pref </code>= "code"
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no strings that contain "code" as a prefix.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 100</code></li>
	<li><code>1 &lt;= words[i].length, pref.length &lt;= 100</code></li>
	<li><code>words[i]</code> and <code>pref</code> consist of lowercase English letters.</li>
</ul>
</div>