<h2><a href="https://leetcode.com/problems/excel-sheet-column-number/">171. Excel Sheet Column Number</a></h2><h3>Easy</h3><hr><div><p>Given a string <code>columnTitle</code> that represents the column title as appears in an Excel sheet, return <em>its corresponding column number</em>.</p>

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

<pre><strong>Input:</strong> columnTitle = "A"
<strong>Output:</strong> 1
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> columnTitle = "AB"
<strong>Output:</strong> 28
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> columnTitle = "ZY"
<strong>Output:</strong> 701
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= columnTitle.length &lt;= 7</code></li>
	<li><code>columnTitle</code> consists only of uppercase English letters.</li>
	<li><code>columnTitle</code> is in the range <code>["A", "FXSHRXW"]</code>.</li>
</ul>
</div>

<hr>

<h2><a href="https://leetcode.com/problems/reverse-integer/">7. Reverse Integer</a></h2><h3>Medium</h3><hr><div><p>Given a signed 32-bit integer <code>x</code>, return <code>x</code><em> with its digits reversed</em>. If reversing <code>x</code> causes the value to go outside the signed 32-bit integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then return <code>0</code>.</p>

<p><strong>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</strong></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> x = 123
<strong>Output:</strong> 321
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> x = -123
<strong>Output:</strong> -321
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> x = 120
<strong>Output:</strong> 21
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-2<sup>31</sup> &lt;= x &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
</div>