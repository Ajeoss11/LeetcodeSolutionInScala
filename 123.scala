object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        val n = prices.length
        var buydp = Array.ofDim[Int](n+1, 3)
        var selldp = Array.ofDim[Int](n+1, 3)
        for(i<-0 until n; j<-0 until 3){
            buydp(i)(j) = Int.MinValue + 100000
            selldp(i)(j) = Int.MinValue + 100000
            if (j==0){
                selldp(i)(0) = 0
            }
        }
        
        for(i<- 0 until n){
            buydp(i+1)(1) = math.max(buydp(i)(1), selldp(i)(0) - prices(i))
            buydp(i+1)(2) = math.max(buydp(i)(2), selldp(i)(1) - prices(i))
            selldp(i+1)(1) = math.max(selldp(i)(1), buydp(i)(1) + prices(i))
            selldp(i+1)(2) = math.max(selldp(i)(2), buydp(i)(2) + prices(i))
            
        }
        val ans = math.max(selldp(n)(1), selldp(n)(2))
        math.max(0,ans)
        
    }
}
