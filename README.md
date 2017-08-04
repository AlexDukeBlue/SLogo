Slogo
=====
##### By: Elliott Bolzan (eab91), Jay Doherty (jld60), Dennis Ling (dl186), Alex Zapata (az73).

**Start**: Thursday, February 16.

**Finish**: Friday, March 10.

**Total Hours**:

- Elliott Bolzan: 70 hours.
- Alex Zapata: 60 hours.
- Jay Doherty: 55 hours.
- Dennis Ling: 60 hours.
- Total: 230 hours.

### Team Roles
##### Front-End

- Elliott Bolzan: main responsibilities included the building of the shell, the script view, the workspace browser, the workspaces, and the view layout. In addition, I rewrote the parser in the back-end to use a `Tree` structure between both sprints, which satisfied two of the back-end challenging extensions. 
- Jay Doherty: Main responsibilities were handling the turtle display and animation for the front end, including providing the turtle interface to the back-end. Also helped implement the side panels for images, colors, and turtle information. Also assisted with turtle and display-related commands in the back-end.

##### Back-End
- Dennis Ling: Main responsibilities were coding all of the commands, including the math, logic, turtle, turtle queries, control, multiple, and display commands. Also worked as a tester to ensure all of the commands and aspects of the project worked throughout the whole process. Also handled refactoring of several back-end classes, including the grouping extension (groupnode) and error handling using properties files in the parser.

- Alex Zapata: Wrote the original parser, and control commands, which was later switched to a Tree implementation. Main responsibilities included extending/re-factoring the parser and some of the commands in back-end while deciding the areas in which error-checking needed to be done. Further was tasked with implementing user made commands in the back-end with the Tree structure. For this, I created the UserCommand node and its basic usage within the parser (refined by team-mates).

### Program Files
* `Main.java`: contains main() and is used to start the program.
* `resources/images`: contains turtle images.
* `resources/languages`: contains language files specifying all of the Slogo commands.
* `resources/style.css`: contains the CSS code used to style our program.
* `resources/UserInterface.properties`: contains resources for user-facing text, including error messages.
* `resources/WorkspaceSettings.properties`: defines a workspace's initial configuration settings.
* `data/examples`: contains scripts that can be used to test the program.
