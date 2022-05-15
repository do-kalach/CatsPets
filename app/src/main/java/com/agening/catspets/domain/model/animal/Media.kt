package com.agening.catspets.domain.model.animal

data class Photo(
    val medium:String,
    val full:String
){
    companion object{
        const val EMPTY_PHOTO = ""
    }

    fun getSmallestAvailablePhoto():String{
        return when{
            isValidPhoto(medium) -> medium
            isValidPhoto(full) -> full
            else -> EMPTY_PHOTO
        }
    }

    private fun isValidPhoto(photo:String):Boolean{
        return photo.isNotEmpty()
    }
}