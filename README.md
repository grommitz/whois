# WHOIS

## My Fork

In my fork I have added a pom.xml and put the code into the normal maven
structure. I've added a unit test for the parser but so far I can't
get any results - it always says "Empty data!" and nothing is extracted
in the result hash.

## About
Statistical WHOIS parser. A rule-based one that is used to label the training data is also included. Please see [SWIP](http://www.sysnet.ucsd.edu/projects/whois/) for more details.

## Dependencies
This project depends on [scrf](https://github.com/6457/scrf).

## Update 2017-04-17
A directly usable parser with models trained on 100k random .com whois samples collected on 2015-03-19 is included. To use the parser, put "whoisparser.jar", "mod" folder and the folder containing thick whois files under the same directory. Run "java -jar whoisparser.jar NameOfDataFolder" and it will generate an "out" folder with parsed whois in hashtable format. You can also customize it to meet your needs.

Unfortunately, this package will no longer be maintained.

## License
Copyright (c) 2015 Suqi Liu
This software is provided free of charge for research and non-commercial use.
No warranty of any kind is included.
