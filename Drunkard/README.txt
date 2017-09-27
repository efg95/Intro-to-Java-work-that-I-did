#Rules:

The Drunkard's (Random) Walk. Imagine you live on an infinite grid of streets where locations are represented as integer pairs (avenue,street). Negative numbers are okay in this example. Now consider a drunkard that randomly picks one of four directions at an intersection and then stumbles to the next intersection doing the same and so on. Write a class Drunkard to simulate this behavior given the drunkard's initial position. Your Drunkard class should have as instance variables the drunkard's current avenue (x location) and current street (y location). Your class should have a method called step( ) that moves the drunkard to the next randomly chosen adjacent intersection. Your class should have another method called fastForward(int steps) that takes an integer as input (call it steps) and moves the drunkard steps intersections from his current location. Your class should have a method getLocation( ) that returns a String indicating the drunkard's current location. Finally your class should have a method called howFar( ) that reports the drunkards distance in blocks from where he started calculated using the Manhattan distance metric 

Drunkard Java - simulating a drunkard man walking in Manhattan grid of streets

__________________________________________________________________________________

//DRUNKARD
for my Drunkard class, i initialized 4 things, current position x and
current position y, start position x and start position y.
I go on to construct a Drunkard and declare the current and start values.
Which are equal at the start.
After that we move to how we derive the Drunkards random movement.
I used Math.random to calculate the steps.
then fastForward uses the method "step" to acquire the random result.
then to get the location I add currentStreetX and currentStreetY 
to a string getLocation. I do this by concatenating these two int variables
inbetween two strings
then i calculate the distance traveled by using Math.abs(currentstreet -
startstreet) and the same for avenue.
finally i return both getLocation and distance for the tester to print.

