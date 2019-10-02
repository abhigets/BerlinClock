# BerlinClock
# Simplified Berlin clock kata

The "Berlin Clock" is the first public clock in the world that tells the time by means of illuminated, coloured fields, for which it entered the Guinness Book of Records upon its installation on 17 June 1975.


![Berlin clock](https://upload.wikimedia.org/wikipedia/commons/4/4f/Berlin-Uhr-1650-1705.gif)

The clock is read from the top row to the bottom. 

The top row of four red fields denote five full hours each, alongside the second row, also of four red fields, which denote one full hour each, displaying the hour value in 24-hour format. 
The third row consists of eleven yellow fields, which denote five full minutes each, 
The bottom row has another four yellow fields, which mark one full minute each. 
The round yellow light on top blinks to denote even- (when lit) or odd-numbered (when unlit) seconds.

Example: Two fields are lit in the first row (five hours multiplied by two, i.e. ten hours), but no fields are lit in the second row; therefore the hour value is 10. 
Six fields are lit in the third row (five minutes multiplied by six, i.e. thirty minutes), while the bottom row has one field on (plus one minute). Hence, the lights of the clock altogether tell the time as 10:31. (Source: Wikipedia)

# Task 
Write a function that takes in a particular time as 24h format ('hh:mm:ss') and outputs a string that reproduces the Berlin Clock. The parameters should be as follows:

“O” = Light off
“R” = Red light
“Y” = Yellow light

Example Test Case:
Input String: 
12:56:01

Output String:

O

RROO

RROO

YYYYYYYYYYY

YOOO


## Credits
Based on:
http://agilekatas.co.uk/katas/BerlinClock-Kata
https://www.codewars.com/kata/berlin-clock
https://gist.github.com/alfredodev/37d67445b2678e8ef32972517bd7ca96
