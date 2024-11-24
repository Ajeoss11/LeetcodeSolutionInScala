object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        val n = prices.length
        var buydp = Array.fill(n+1)(Int.MinValue)
        var selldp = Array.fill(n+1)(Int.MinValue)
        selldp(0) = 0
        var ans = 0
        for(i<- 0 until n){
            buydp(i+1) = math.max(buydp(i), selldp(i) - prices(i))
            selldp(i+1) = math.max(selldp(i), buydp(i) + prices(i))
            
        }
        selldp(n)
        
    }
}
