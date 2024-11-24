object Solution {
    def maxProfit(k: Int, prices: Array[Int]): Int = {
        val n = prices.length
        var buydp = Array.ofDim[Int](n+1, k+1)
        var selldp = Array.ofDim[Int](n+1, k+1)
        for(i<-0 until n; j<-0 until k+1){
            buydp(i)(j) = Int.MinValue + 100000
            selldp(i)(j) = Int.MinValue + 100000
            if (j==0){
                selldp(i)(0) = 0
            }
        }
        var ans = 0
        for(i<- 0 until n){
            for (j<-1 until k+1){
            buydp(i+1)(j) = math.max(buydp(i)(j), selldp(i)(j-1) - prices(i))
            selldp(i+1)(j) = math.max(selldp(i)(j), buydp(i)(j) + prices(i))
            ans = math.max(ans, selldp(i+1)(j))
            }
           
            
        }
        ans
    }
}
