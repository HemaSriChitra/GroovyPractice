class Map{
static void main(String[] arg)
{ 
         //creation and definition
         //map is a unordered collection of object references.
        def map1 = [StudentName: "Hema",StudentID:101,Department: "CSE"];
        def map2 = [StudentName: "Kala",StudentID:201,Department: "ECE"];
        //creation and definition of set
        //set doesnt have key value pairs
        Set mySet = ['A','B','C'];
        //print the statement
        println("Student Details Of Map1: "+map1);
        println(map1.get("StudentID"));
        println("Student Details Of Map2: "+map2);
        println(mySet);
}
}
