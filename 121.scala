object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var till_min = Int.MaxValue
        val n = prices.length
        var ans = 0
        for (i<- 0 until n){
            if(prices(i)<till_min){
                till_min = prices(i)
            }
            ans = math.max(ans, prices(i)-till_min)
        }
        ans
    }
}
