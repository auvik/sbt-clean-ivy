sbt-clean-ivy
=============

sbt-clean-ivy is a plugin that adds tasks to sbt to delete the global ivy2 cache. Equivalent to a 

    > rm -rf .ivy2/cache

Provided: 
---------

###Tasks
*ivy-cache-clean
*ivy-cache-files

###Settings
*ivyCacheDirectory

The recommended configuration is as a global plugin. Add the following to .sbt/plugins/sbt-clean-ivy.sbt: 
addSbtPlugin("com.auvik.sbt", "sbt-clean-ivy", "0.0.1")