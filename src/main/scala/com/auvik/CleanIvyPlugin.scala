package com.auvik

import sbt._
import sbt.Keys._

object CleanIvyPlugin extends sbt.Plugin {
	val ivyCacheFiles = TaskKey[Seq[File]]("ivy-cache-files", "All files within the ivy2 cache.")
	val ivyCacheClean = TaskKey[Unit]("ivy-cache-clean", "Removes all files within the ivy2 cache.")
    val ivyCacheDirectory = SettingKey[File]("ivy-cache-directory", "The ivy2 cache directory.")

	override val settings = Seq(
		ivyCacheDirectory <<= ivyPaths(_.ivyHome getOrElse(Path.userHome / ".ivy2")),
        ivyCacheFiles <<= (ivyCacheDirectory) map { (dir) => 
          ((dir / "cache") ** ("*")).get
        },
        ivyCacheClean <<= (ivyCacheDirectory) map { files => 
        	IO.delete(files)
        }
	)
}