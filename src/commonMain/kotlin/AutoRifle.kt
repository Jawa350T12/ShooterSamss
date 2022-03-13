class AutoRifle: Weapon {
    var magazine:Int = 30;
    constructor(name:String,distanceShot:Double,damage:Int,reloadTime:Int,magazine: Int): super(name,distanceShot,damage,reloadTime){
        this.magazine = magazine
    }
    fun damagar(dist:Double,baseDamag:Int):Double{//реальный урон
        if(dist>25)
            return baseDamag*0.5
        else
            return baseDamag*1.0
    }

}