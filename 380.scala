import scala.collection.mutable.{Map=>MtMp, ListBuffer=>Lb}
import scala.util.Random
class RandomizedSet() {
    private var map: MtMp[Int, Int] = MtMp()
    private var keys: Lb[Int] = Lb()
    private val index: MtMp[Int, Int] = MtMp()
    def insert(`val`: Int): Boolean = {
        // println(keys)
        if(map.contains(`val`))
            false
        else
            map(`val`) = 1
            keys += `val`
            index(`val`) = keys.length -1
            true
    }

    def remove(`val`: Int): Boolean = {
        // println(keys)
        if(map.contains(`val`))
            map -=  `val`
            val last_key = keys.last
            keys(index(`val`)) = last_key
            index(last_key) = index(`val`)
            keys.remove(keys.length -1)
            index.remove(`val`)
            true
        else
            false
        
    }

    def getRandom(): Int = {
        // println(keys)
        val random_index = Random.nextInt(keys.length) 
        val rkey = keys(random_index)
        rkey
    }

}

// object RandomizedSet{
    
// }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * val obj = new RandomizedSet()
 * val param_1 = obj.insert(`val`)
 * val param_2 = obj.remove(`val`)
 * val param_3 = obj.getRandom()
 */
