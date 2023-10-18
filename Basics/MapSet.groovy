class MapSet{

    static void main(String[] args){

 //set  creation  

Set games = ["cricket", "throw ball", "tennis"]

 

//map creation

def gamesMap = [

    "a" : "cricket",

    "b" : "throw ball",

    "c" : "tennis"

]

println("Original Set: $gamesSet")

println("Original Map: $gamesMap")

// definition in a Set

def found = gamesSet.contains("cricket")

println("'cricket' is found in the Set? $found")

// definition in a Map

def foundInMap = gamesMap["b"]

println("Value for key 'b' in Map: $foundInMap")

// Adding elements to a Set

gamesSet << "date"

println("Set after adding 'date': $gamesSet")

// Adding elements to a Map

gamesMap["d"] = "date"

println("Map after adding 'date': $gamesMap")

 
// Removing elements from a Set

gamesSet.remove("throw ball")

println("Set after removing 'throw ball': $gamesSet")

// Removing elements from a Map

gamesMap.remove("c")

println("Map after removing key 'c': $gamesMap")

  }

}