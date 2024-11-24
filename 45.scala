import scala.util.control.Breaks._
object Solution {
    def jump(nums: Array[Int]): Int = {
        val n = nums.length
        if (n==1){
            return 0
        }
        var dp = Array.fill(n+1)(0)
        dp(1) = nums(0)
        var index = -1
        var ans = 1
        var max_reach = dp(1)
        breakable{
           for(i<- 1 until n){
            if(dp(i)<i)
            {
                break;
            }
            if(max_reach>=n-1)
            {
                break;
            }
            dp(i+1) =  math.max(dp(i), i + nums(i))
            if(max_reach == i){
                ans += 1
                max_reach = dp(i+1)
            }
            
        } 
        }
        
        ans

    }
}
