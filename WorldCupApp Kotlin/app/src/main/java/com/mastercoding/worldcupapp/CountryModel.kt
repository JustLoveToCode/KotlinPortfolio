package com.mastercoding.worldcupapp

//Creating the Model Class
class CountryModel {
    var name:String = ""
    var cupWins:String = ""
    var flag_img:Int = 0
    // Constructor: create an Instance of the class CountryModel:
    constructor(name:String, cupWins:String, flag_img:Int){
        this.name = name
        this.cupWins = cupWins
        this.flag_img = flag_img
    }

}