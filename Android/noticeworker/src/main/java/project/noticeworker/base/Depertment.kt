package project.noticeworker.base

class Depertment(var DeptName : String){
    val majorList : ArrayList<in Major> = ArrayList()

    fun addMajor(tmp: Major){
        majorList.add(tmp)
    }

    fun getMajorCnt() : Int { return majorList.size; }
}
