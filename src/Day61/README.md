<h2><a href="https://leetcode.com/problems/sum-of-numbers-with-units-digit-k/">2310. Sum of Numbers With Units Digit K</a></h2><h3>Medium</h3><hr><div><p>Given two integers <code>num</code> and <code>k</code>, consider a set of positive integers with the following properties:</p>

<ul>
	<li>The units digit of each integer is <code>k</code>.</li>
	<li>The sum of the integers is <code>num</code>.</li>
</ul>

<p>Return <em>the <strong>minimum</strong> possible size of such a set, or </em><code>-1</code><em> if no such set exists.</em></p>

<p>Note:</p>

<ul>
	<li>The set can contain multiple instances of the same integer, and the sum of an empty set is considered <code>0</code>.</li>
	<li>The <strong>units digit</strong> of a number is the rightmost digit of the number.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> num = 58, k = 9
<strong>Output:</strong> 2
<strong>Explanation:</strong>
One valid set is [9,49], as the sum is 58 and each integer has a units digit of 9.
Another valid set is [19,39].
It can be shown that 2 is the minimum possible size of a valid set.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> num = 37, k = 2
<strong>Output:</strong> -1
<strong>Explanation:</strong> It is not possible to obtain a sum of 37 using only integers that have a units digit of 2.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> num = 0, k = 7
<strong>Output:</strong> 0
<strong>Explanation:</strong> The sum of an empty set is considered 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= num &lt;= 3000</code></li>
	<li><code>0 &lt;= k &lt;= 9</code></li>
</ul>
</div>

<hr>

<h2><a href="https://leetcode.com/problems/maximum-ice-cream-bars/">1833. Maximum Ice Cream Bars</a></h2><h3>Medium</h3><hr><div><p>It is a sweltering summer day, and a boy wants to buy some ice cream bars.</p>

<p>At the store, there are <code>n</code> ice cream bars. You are given an array <code>costs</code> of length <code>n</code>, where <code>costs[i]</code> is the price of the <code>i<sup>th</sup></code> ice cream bar in coins. The boy initially has <code>coins</code> coins to spend, and he wants to buy as many ice cream bars as possible.&nbsp;</p>

<p><strong>Note:</strong> The boy can buy the ice cream bars in any order.</p>

<p>Return <em>the <strong>maximum</strong> number of ice cream bars the boy can buy with </em><code>coins</code><em> coins.</em></p>

<p>You must solve the problem by counting sort.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> costs = [1,3,2,4,1], coins = 7
<strong>Output:</strong> 4
<strong>Explanation: </strong>The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> costs = [10,6,8,7,7,8], coins = 5
<strong>Output:</strong> 0
<strong>Explanation: </strong>The boy cannot afford any of the ice cream bars.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> costs = [1,6,3,1,2,5], coins = 20
<strong>Output:</strong> 6
<strong>Explanation: </strong>The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>costs.length == n</code></li>
	<li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= costs[i] &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= coins &lt;= 10<sup>8</sup></code></li>
</ul>
</div>