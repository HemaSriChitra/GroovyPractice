class OperationsMap{
static void main(String[] arg)
{
    //creating
    def map = [BookName: "Wings of Fire",  Author: " Dr. APJ Abdul Kalam sir",Native:"Rameshwaram",BookName: "Wings of Fire",  Author: " Dr. APJ Abdul Kalam sir",Native:"Peikaumbu"]
    //fetch map
    print(map)
    // print(map.get("Author"))
    // def minusMap=map.minus([BookName: "Wings of Fire"])
    // print(minusMap)
    // map.findAll({it.value=="Grails"}.key=="groovy")
    def vechicle=[vehicle:"bus",vehicle:"cycle"]
    print(vechicle)

    //set doesnt have hey value pairs
    Set mySet = [10, 20,20, 0, false, true, 'hello', [1, 2], [3, 4], null, "world"]
    print(mySet)
}    
}