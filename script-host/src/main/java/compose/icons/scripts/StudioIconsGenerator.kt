package compose.icons.scripts

import java.io.File

val StudioIconDirs = mapOf(
    "Baseline" to "materialicons",
    "Outline" to "materialiconsoutlined",
    "Round" to "materialiconsround",
    "Sharp" to "materialiconssharp",
    "TwoTone" to "materialiconstwotone"
)

// Dir must contain categories folders (outlined,sharp and other material icon folders)
fun processStudioIcons(rootDir: File, outDir: File,iconExtension : String = "xml") {

    // removing files , can contain icon-metadata
    removeFilesNotFoldersIn(rootDir)


    // collecting directories that contains directories of icon , input icons , [Outlined -> File,Sharp -> File]
    val dirFileMap = mutableMapOf<String, File>()
    for (dirEntry in StudioIconDirs) {
        dirFileMap[dirEntry.key] = rootDir.resolve(dirEntry.value)
    }

    // creating output directory map [Outlined -> File,Sharp -> File]
    val outDirFileMap = mutableMapOf<String, File>()
    for (dirEntry in StudioIconDirs) {
        outDir.deleteRecursively()
        outDirFileMap[dirEntry.key] = outDir.resolve(dirEntry.key).also {
            if (!it.mkdirs()) {
                throw IllegalStateException("couldn't create output directories")
            }
        }
    }

    fun processIconName(categoryName : String,iconName : String): String {
        return iconName.replace(categoryName.lowercase() + "_","").replace("_24.xml",".xml")
    }

    if (dirFileMap.isEmpty()) throw IllegalStateException("the directory doesn't contain any sub directories of icons")
    for(inputContainerDir in dirFileMap) {
        inputContainerDir.value.walk(FileWalkDirection.TOP_DOWN).maxDepth(1).forEach { iconDir ->
            iconDir.walk(FileWalkDirection.TOP_DOWN).maxDepth(1).forEach { iconFile ->
                if (iconFile.extension == iconExtension) {
                    iconFile.copyTo(outDirFileMap[inputContainerDir.key]!!.resolve(processIconName(inputContainerDir.key,iconFile.name)),overwrite = true)
                }
            }
        }
    }

}

// remove files from a given folder , leaves directories
fun removeFilesNotFoldersIn(dir: File) {
    if (dir.isFile) throw IllegalArgumentException("argument of a directory is expected")
    dir.walk(FileWalkDirection.TOP_DOWN).maxDepth(1).forEach { file ->
        if (!file.isDirectory && file.isFile) {
            file.delete()
        }
    }
}

