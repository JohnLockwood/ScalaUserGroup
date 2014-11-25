ScalaUserGroup.org Web Site Source
==================================

This is the source for the web site, ScalaUserGroup.org.  It is a Play app.

It is built using Scala, SBT, and Activator.  To launch the site locally 
use "activator" then in the activator shell, "run"  It uses the default port of 9000.

Roadmap and Current Status
--------------------------

This app is as close to HelloWorld in Play as you can get without it actually saying "Hello World."  What I envision it needing to do in general outline is first serve up some static pages that talk about the group, so perhaps:

* Wire up bootstrap so we can have a nice looking UI.
* Create a simple top level horizontal menu with something like:

Home	Join us 	Projects  	Members		Meetings

We can update Home with news like the next meeting etc.  Members might be be a list of links to internal pages /app/views/members/firstname_lastname.scala.html for now -- we can refactor it when we have Cassandra wired up.

