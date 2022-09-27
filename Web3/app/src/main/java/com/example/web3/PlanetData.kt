package com.example.web3

import android.os.Parcel
import android.os.Parcelable

data class PlanetData(

    val title:String?,
    val overview:String?
):Parcelable{
    constructor(parcel: Parcel) : this(

        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {

        parcel.writeString(title)
        parcel.writeString(overview)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlanetData> {
        override fun createFromParcel(parcel: Parcel): PlanetData {
            return PlanetData(parcel)
        }

        override fun newArray(size: Int): Array<PlanetData?> {
            return arrayOfNulls(size)
        }
    }

}