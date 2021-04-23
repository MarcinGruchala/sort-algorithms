object RandomListGenerator {

    fun generateList(listElements: Int,min: Int, max: Int): MutableList<Int>{
        val outPutList: MutableList<Int> = mutableListOf()
        while (outPutList.size <= listElements){
            outPutList.add((min..max).random())
        }
        return outPutList
    }

    fun generateListAsSet(listElements: Int,min: Int, max: Int):MutableList<Int> {
        val outPut: MutableSet<Int> = mutableSetOf()
        while (outPut.size < listElements){
            outPut.add((min..max).random())
        }
        return outPut.toMutableList()
    }
}