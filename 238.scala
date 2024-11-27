object Solution {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        val n = nums.length
        var ans = Array.fill(n)(1)
        var curr = 1
        for(i<-0 until n){
            if(i>0)
            ans(i) = ans(i-1)*nums(i-1)
        }
       
        for(i<- n-1 to 0 by -1){
            ans(i) = ans(i)*curr
            curr = curr * nums(i)  
        }
        ans
        
    }
}
