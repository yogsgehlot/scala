import scala.collection.mutable
object MyClass{
	def countWords(text:String):Unit=
	{
		val wordcount = mutable.Map.empty[String, Int].withDefaultValue(0)
		for(word <- text.split("[ ,!.]+"))
		{
			val words = word.toUpperCase
			wordcount(words) +=1
		}
		println(wordcount)
	}

	def main(args:Array[String]):Unit=
	{
		println()
		var sentance = "Why and how Spark and Scala exist"
		print("Original string is : ")
		println(sentance)
		println()
		print("Words : ")
		countWords(sentance);
		println()
	}
}