open class Weapon {
    var name:String = ""
    var distanceshoot:Double = 0.0//дистанция выстрела
    var damage:Int = 0//базовый урон
    var reloadTime:Int = 0//время перезарядки

    constructor(name:String,distanceshot:Double,damage:Int,reloadTime:Int){
        this.name = name
        this.distanceshoot = distanceshot
        this.damage = damage
        this.reloadTime=reloadTime
    }
}