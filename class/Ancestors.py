# **Ancestral Stories:** In many African cultures, the art of storytelling is passed
# down from generation to generation. Imagine you're creating an application that
# records these oral stories and translates them into different languages. The
# stories vary by length, moral lessons, and the age group they are intended for.
# Think about how you would model `Story`, `StoryTeller`, and `Translator`
# objects, and how inheritance might come into play if there are different types of
# stories or storytellers.



# // psudocode
# // Input
# // moralLesson
# // age
# // length

# // Output
# // Different types of stories in different language
# // oral stories

# // process
# // create a class AncestralStories
# // create a def __init__ wich will have moralLesson,age,length 
# // creat an inastance of the class
# // create a method story
# // create a method translate story

class AncestralStories:
    def __init__(self,moral_lesson,age,length):
        self.moral_lesson=moral_lesson
        self.age=age
        self.length=length

    def story(self,lesson,age_between):
        self.lesson= "obidience"
        self.age_between=7
        # self.length= 7

        if self.moral_lesson==lesson and self.age==age_between:
            return f"The moral of the story is {self.moral_lesson} , it was bresent by Regina and the kids were between the age of{self.age}.it was only{self.length} pages"
                
        else:
            return f"The moral of the story is {self.moral_lesson} , it was bresent by Regina and the youths were between the age of{self.age}.it was only{self.length} pages"
    # story(7,"obidience",8)
# result=
# print (AncestralStories("obedience",7,9) )

ancestor= AncestralStories(moral_lesson="challanges",age=7,length=9)
print( ancestor)