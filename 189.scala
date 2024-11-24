object Solution {
    def rotate(nums: Array[Int], k: Int): Unit = {
        val n = nums.length
        var left = 0
        var right = n - 1
        var K = k%n
        if (K==0)
        {
            K = n
        }
        reverse(nums, left, right)
        left = 0
        right = K -1
        reverse(nums, left, right)
        left = K
        right = n-1
        reverse(nums=nums, left, right)
        
    }
    def reverse(nums: Array[Int], l:Int, r:Int): Unit ={
        var left = l 
        var right = r
        val n = nums.length
        if (left<0 || right == n)
        return
        var temp: Int = -1;
        while(left<right){
            
            temp = nums(left)
            nums(left) = nums(right)
            nums(right) = temp
            left += 1
            right -= 1 
        } 
    }
}
