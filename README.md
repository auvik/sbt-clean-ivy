sbt-clean-ivy
=============

sbt-clean-ivy is a plugin that adds tasks to sbt to delete the global ivy2 cache. Equivalent to a 

    > rm -rf .ivy2/cache

Provided: 
---------

###Tasks
- ivy-cache-clean
- ivy-cache-files

###Settings
- ivy-cache-directory

The recommended configuration is as a global plugin. Add the following to .sbt/plugins/sbt-clean-ivy.sbt: 

    > addSbtPlugin("com.auvik.sbt", "sbt-clean-ivy", "0.0.1")


Usage
--------

To display the files that will be cleaned by the ivy-cache-clean task, run: 
    
    > show ivy-cache-files

Then to clean the files, run: 

    > ivy-cache-clean

If you are just looking to get the directory where the ivy2 cache is located, run: 

    > show ivy-cache-directory

