

fun main(){
   val list = mutableListOf<Int>(4,2,8,3,1,6,10,9,5,7)
   println(list)
   Sorter.quickSort(list,0,list.size-1)
   println(list)
}