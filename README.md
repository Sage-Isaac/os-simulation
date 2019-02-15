# os-simulation
The classes that I started with are just to give you an idea of what we're doing. 
Not every method needs to be void, and it is up to you to determine what 

#### Alec
* Develop a means for retrieving arguments from a command line. Argparse4j might
be a useful library to fulfil this. If you are importing an external library,
consider utilizing Apache Maven. If you find another means of creating a command
line argument parser, that'd be great too.
* Develop User and Admin classes. This should include a username, a password 
(not stored in a plaintext state) and the user's permissions. 
* Build a password prompt that returns true if the correct password was entered.
* Responsible for: Admin, CommandLineArgs, User

#### Brandon
* Develop a means for storing files in a single directory, simulating folders by creating
virtual structures which can be  stored as strings in a JSON, a serialized Java object, or
however you see fit. 
* Implement file & folder metadata at the SysObject level, taking into account
mutable and immutable metadata elements. 
* Create methods that can convert a file to a filepath and vice versa.
* Responsible for: SysObject(abstract), Folder, File, FileStructure

#### Sage
* Develop 12 essential functions by traversing Brandon's File System. 
* Develop a way to run a command as "sudo" or a super user, with administrative rights given a password. 
* Reponsible for: Cmd

#### Nicholas
* Bootstrapping the program such that the program cleanly starts and stops, without losing data.
* Develop a means of parsing command line arguments and calling the proper methods from those calls.
* Handle sudo requests.
* Responsible for: Main
