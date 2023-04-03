interface Downloader {
    fun download()
}

interface Uploader {
    fun upload()
}

class Download(val FileName: String) : Downloader {
    override fun download() {
        println("The File $FileName is downloaded")

    }
}

class Upload(val FileName: String) : Uploader {
    override fun upload() {
        println("The File $FileName is Uploaded!!")

    }

}
class FileHandler(download:Downloader,upload:Uploader): Downloader by download , Uploader by upload

fun main() {
    val file = Download("Title Song.mp3")
    val file1 = Upload("Title Song.mp3")
    val fh = FileHandler(file,file1)
    fh.download()
    fh.upload()
}