class SniperRifle: Weapon{
    var magazine:Int = 20
    constructor(name: String,distanceshoot: Double,damage: Int,reloadTime:Int,magazine:Int): super (name,distanceshoot,damage,reloadTime){
        this.magazine = magazine
    }
}