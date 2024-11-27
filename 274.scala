object Solution {
    def hIndex(nums: Array[Int]): Int = {
        val n = nums.length
        var left = 0 
        var right = n
        var ans = 0 
        while(left <= right){
           val mid = (left+right)/2 
           var count = 0
           for(i<- 0 until n ){
                if (nums(i)>=mid){
                    count+=1
                }
            }
            if(count>=mid)
                left = mid + 1
            else
                right = mid -1
        }
        left - 1 
    }
}
