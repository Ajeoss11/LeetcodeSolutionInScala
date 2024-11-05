import scala.collection.mutable.{Map => Mmap}
object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    val sz = nums.length
    var ans = new Array[Int](sz)
    var check = Mmap[Int, Int]()
    var res = 0
    var index = 0
    for (i <- 0 to sz-1){
        if (!check.contains(nums(i))){
          check+= (nums(i)->1)
          res+=1
          nums(index) = nums(i)
          index+=1
        }
    }
    res
  }
}
// by nightking__11
