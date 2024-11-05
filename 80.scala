// solution by nightking__11
object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        val sz = nums.length
        var occ = 0
        var index = 0
        for(i <- 0 until sz){
            occ match {
                case 0 => {
                    nums(index) = nums(i)
                    index+=1
                    occ +=1
                }
                case 1 => {
                    if(nums(i)==nums(i-1)){
                        nums(index) = nums(i)
                        index+=1
                        occ+=1
                    }
                    else{
                        nums(index) = nums(i)
                        index+=1
                    }
                }
                case _ => {
                    if(nums(i)!=nums(i-1)){
                        nums(index) = nums(i)
                        index+=1
                        occ=1
                    }  
                }
            }
    }
        index
}
}
