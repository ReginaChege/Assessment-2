fun main(){
  var library=LibraryCatalog("Horro","The dead",7)

    println(library.addBooks(1))
    println(library.addBooks(5))
    var morocan=MoroccanRecipe("spicy","boiling",5)
    morocan.method("frying")

//morocan.method("")
}
//Create a LibraryCatalog class that handles the cataloging and management of
//books in a library. Implement methods to add new books, search for books by
//title or author, keep track of available copies, and display book details.


// psudocode
// Input
// title
// copies
// books

// Output
// search ab book by its titel
// add a book
//track the number of books

// process
// create a class LibraryCatalog which will have its input as books,title,copies
// creat an inastance of the class
// create a method addbooks and search for books




class LibraryCatalog(var books:String,var title:String,var copies:Int) {
    fun addBooks(total: Int) {
        var empty = 1
        for (i in books) {
            if (copies == copies && title == title) {
                empty++
                println(empty)
            } else {
                println("no additional copy")
            }
        }


    }

//    fun searchBook(title:String): String {
//        for (i in books) {
//            if (title == title) {
//                return "title"
//            } else {
//                return ("not found")
//            }
//        }
//
//    }
}

//**African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.
//create a class Recipe
//create subclasses morrocan, kenyan,sudan,rwanda
//with
open class Recipe(var foodType:String, var method:String, var nutritionalValue:Int){
    var prepare="boiled"
   open fun cookingMethod(food:String){
        if (food==food && method==prepare){
            println("oshimbeho is a morocan dish")
        }
        else{
            println("it not a morrocan dish")
        }
    }
   open fun nutritionLvalue(valu: Int){
        var value=9
        if (value>=10 && prepare==prepare){
            println("The food is high in calcium which helps in bones")

        }
        else{
            println("The food is rich in vitamin c")
        }
    }

}
class MoroccanRecipe(foodType:String,method:String,nutritionalValue:Int):Recipe(foodType,method,nutritionalValue){
//    var prepare="boiled"
   override fun cookingMethod(food:String){
     if (food==food && method==prepare){
         println("mbeho is a morocan dish")
     }
     else{
         println("it not a morrocan dish")
     }
 }
   override fun nutritionLvalue(valu: Int){
        var value=9
        if (value>=10 && prepare==prepare){
            println("The food is high in calcium which helps in bones")

        }
        else{
            println("The food is rich in vitamin c")
        }
    }

    class KenyanRecipe(foodType:String,method:String,nutritionalValue:Int):Recipe(foodType,method,nutritionalValue){
//        var prepare="boiled"
        override fun cookingMethod(food:String){
            if (food==food && method==prepare){
                println("uagli is a kenyan dish")
            }
            else{
                println("it not a Kenyan dish")
            }
        }
        override fun nutritionLvalue(valu: Int){
            var value=9
            if (value>=10 && prepare==prepare){
                println("The food is high in calcium which helps in teeth")

            }
            else{
                println("The food is rich in vitamin a")
            }
        }

        class SudanRecipe(foodType:String,method:String,nutritionalValue:Int):Recipe(foodType,method,nutritionalValue){
//            var prepare="boiled"
            override fun cookingMethod(food:String){
                if (food==food && method==prepare){
                    println("mbeho is a sudan dish")
                }
                else{
                    println("it not a sudan dish")
                }
            }
            override fun nutritionLvalue(valu: Int){
                var value=9
                if (value>=10 && prepare==prepare){
                    println("The food is high in calcium which helps in growing tall")

                }
                else{
                    println("The food is rich in vitamin d")
                }
            }




        }
