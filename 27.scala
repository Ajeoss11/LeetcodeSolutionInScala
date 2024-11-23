object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        val sz: Int = nums.length
        var index: Int = -1
        var ans = 0
        for (i <- 0 until sz){
            if(nums(i)==`val`){
                if (index == -1){
                    index =  i
                }
            }
            else{
                if (index != -1){
                    nums(index) = nums(i)
                    index +=1
                }
                ans += 1
            }
        }
        ans
    }
}
