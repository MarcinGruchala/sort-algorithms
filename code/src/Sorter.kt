object Sorter {

    fun quickSort(numbers: MutableList<Int>,low: Int, high: Int){
        if(low<high){
            val pi = partition(numbers,low, high)
            quickSort(numbers,low, pi-1)
            quickSort(numbers,pi+1,high)
        }
    }

    private fun partition(numbers: MutableList<Int>, low: Int, high: Int): Int{
        val pivot = numbers[high]
        var i = low - 1
         for (j in low until high){
             if (numbers[j] < pivot){
                 i++
                 numbers[j] = numbers[i].also { numbers[i] = numbers[j] }
             }
         }
        numbers[i+1] = numbers[high].also { numbers[high] = numbers[i+1] }
        return i+1
    }
}