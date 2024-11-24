object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        var occ = 0
        var ele = 0
        var n = nums.length
        for (i<- 0 until n){
            if (occ==0)
            {
                ele = nums(i)
            }
            if (ele == nums(i)){
                occ +=1
            }
            else{
                occ -= 1
            }
        }
        ele
    }
}
