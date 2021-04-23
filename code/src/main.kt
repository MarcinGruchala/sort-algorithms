fun main(){
   val list = RandomListGenerator.generateListAsSet(10000,1,10000)
   println(list)
   Sorter.quickSort(list,0,list.size-1)
   println(list)
}