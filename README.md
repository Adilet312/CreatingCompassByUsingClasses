# **GPS Navigator**

####  A GPS(Global Positioning System) is a navigation tool that knows its location and heading. This information helps a person navigate.
#### 11/15/18

##### By _**Adilet Momunaliev**_
&nbsp;
## **Specs**
* <constructor>
* CompassHeading(int initialDegrees) -- construct a CompassHeading object with the given degrees.  If that value is out of bounds, throw an IllegalArgumentException
* <methods>
* int getHeading() -- return the current heading
* void setHeading(int update) -- set the CompassHeading to the given value.  If that value is out of bounds, throw an IllegalArgumentException.
* String getBearing() -- return the compass bearing for this Heading as a String.
* String toString() -- return the current state of this CompassHeading as a String.
* <constructor>
* GPSUnit(CompassHeading currentDir, CSC142Point currentLoc) -- construct a GPS object with the given data.   Throw a NullPointerException if either parameter is null.
* <methods>
* move(double units) -- move this GPS object the given amount of units in the direction it is heading.  If units is < 0, throw an IllegalArgumentException.
* turn(int degrees) -- turn this GPS object the amount of degrees specified from its current heading.  Legal values are in the range [-180, 180] (inclusive).  Throw an IllegalArgumentException if the arugment is out of range.
* CompassHeading getHeading()
* CSC142Point getLocation()
* String toString()


## **Setup/Installation Requirements**

* _Open Command Line_
* _Open BlueJ IDE_


## **Known Bugs**

_No bugs at the moment._

## **Github Link**
* _https://github.com/Adilet312/Circle_Class_Circle_Array

## Support and contact details

* _adiletm@hotmail.com_

## **Technologies Used**

* _BlueJ IDE - To write and edit the code_
* _BlueJ IDE - To help debug and see progress_

## **License**

*MIT License*
Copyright (c) 2019



