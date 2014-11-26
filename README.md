ScalaUserGroup.org Web Site Source
==================================

This is the source for the web site, ScalaUserGroup.org.  It is a Play app.

It is built using Scala, SBT, and Activator.  To launch the site locally 
use "activator" then in the activator shell, "run"  It uses the default port of 9000.

Roadmap and Current Status
--------------------------

This app is HelloWorld in Play with only the following features added so far:

* Wire up bootstrap so we can have a nice looking UI.  I settled on "flatly" for a theme,
but I could be talked out of that easily by rational argruments or a cooler theme.

* Create a simple top level horizontal menu with something like:

Home	Join us 	Projects  	Members		Meetings

All of this is preliminary, and we might want stuff like "Learn", "Blog", etc. going forward.
Play doesn't handle static pages well as far as I know but perhaps we could wire up the output of a static site generator to part of the site.  Whether that's useful or not would depend on how
much writing the membership wants to do here.

We can update Home with news like the next meeting etc.  Members might be be a list of links to internal pages /app/views/members/firstname_lastname.scala.html for now -- we can refactor it when we have Cassandra wired up.

