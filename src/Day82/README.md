<h2><a href="https://leetcode.com/problems/teemo-attacking/">495. Teemo Attacking</a></h2><h3>Easy</h3><hr><div><p>Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly <code>duration</code> seconds. More formally, an attack at second <code>t</code> will mean Ashe is poisoned during the <strong>inclusive</strong> time interval <code>[t, t + duration - 1]</code>. If Teemo attacks again <strong>before</strong> the poison effect ends, the timer for it is <strong>reset</strong>, and the poison effect will end <code>duration</code> seconds after the new attack.</p>

<p>You are given a <strong>non-decreasing</strong> integer array <code>timeSeries</code>, where <code>timeSeries[i]</code> denotes that Teemo attacks Ashe at second <code>timeSeries[i]</code>, and an integer <code>duration</code>.</p>

<p>Return <em>the <strong>total</strong> number of seconds that Ashe is poisoned</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> timeSeries = [1,4], duration = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> Teemo's attacks on Ashe go as follows:
- At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
- At second 4, Teemo attacks, and Ashe is poisoned for seconds 4 and 5.
Ashe is poisoned for seconds 1, 2, 4, and 5, which is 4 seconds in total.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> timeSeries = [1,2], duration = 2
<strong>Output:</strong> 3
<strong>Explanation:</strong> Teemo's attacks on Ashe go as follows:
- At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
- At second 2 however, Teemo attacks again and resets the poison timer. Ashe is poisoned for seconds 2 and 3.
Ashe is poisoned for seconds 1, 2, and 3, which is 3 seconds in total.</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= timeSeries.length &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= timeSeries[i], duration &lt;= 10<sup>7</sup></code></li>
	<li><code>timeSeries</code> is sorted in <strong>non-decreasing</strong> order.</li>
</ul>
</div>

<hr>

<h2><a href="https://leetcode.com/problems/remove-adjacent-almost-equal-characters/">2957. Remove Adjacent Almost-Equal Characters</a></h2><h3>Medium</h3><hr><div><p>You are given a <strong>0-indexed</strong> string <code>word</code>.</p>

<p>In one operation, you can pick any index <code>i</code> of <code>word</code> and change <code>word[i]</code> to any lowercase English letter.</p>

<p>Return <em>the <strong>minimum</strong> number of operations needed to remove all adjacent <strong>almost-equal</strong> characters from</em> <code>word</code>.</p>

<p>Two characters <code>a</code> and <code>b</code> are <strong>almost-equal</strong> if <code>a == b</code> or <code>a</code> and <code>b</code> are adjacent in the alphabet.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> word = "aaaaa"
<strong>Output:</strong> 2
<strong>Explanation:</strong> We can change word into "a<strong><u>c</u></strong>a<u><strong>c</strong></u>a" which does not have any adjacent almost-equal characters.
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> word = "abddez"
<strong>Output:</strong> 2
<strong>Explanation:</strong> We can change word into "<strong><u>y</u></strong>bd<u><strong>o</strong></u>ez" which does not have any adjacent almost-equal characters.
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> word = "zyxyxyz"
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can change word into "z<u><strong>a</strong></u>x<u><strong>a</strong></u>x<strong><u>a</u></strong>z" which does not have any adjacent almost-equal characters. 
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 3.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= word.length &lt;= 100</code></li>
	<li><code>word</code> consists only of lowercase English letters.</li>
</ul>
</div>