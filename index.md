# Submersible Sensor

Throughout the semester, we will update this page with current tasks, projects completed,
and other things we want to have easy access to.
![](model.jpg)

## About Us

Our goal is to create a lowcost but efficient concentration detector by essentially hijacking 
cheap endoscopes/borescopes and merging its function with code and physical additions of our own.
By designing a mobile application that utilizes image processing and basic equations relating 
the image values to concentrations, we can both get a visual of what is going on in each level of depth
and determine using a threshold value where the sludge blanket begins.


The current members of this subteam are 

* Lois Lee (LL556) 
* Srilekha Vangavolu (SV397)
* Hannah Si (HS649)

To learn more about the specifics of our subteam, please look through the tabs below.


* [Logbook](./logs/logs.md)
* [Manuals](./manuals/manuals.md)
* [Drawings](./drawings/drawings.md)
* [Code](./code/code.md)

![](taskmap.jpg)

## Current Tasks

  - Work on testing the turbidity sensor using arduino and code
  - Adjust the relation as necessary
  - Play around with endoscope, maybe start to write pseudocode.
  - Make larger container with matte dark walls and bottom.
  

Learn more about each of the [components](./components/components.md) of our sensor plan.

Our code right now:
```arduino
/*
 * THIS CODE IS FOR AGUACLARA SENSOR_DEV
 * This code's function is to take the input voltage from the turbidity sensor
 * and translate it into a numerical value for turbidity
 */

int ledPin = 13;  //declaration for LED
int button_input = 11;   //digital input of the pushbutton
int offset = 0;  //set the offset as zero for now
int turb_input = A0; //input in A0 from sensor
int flag = 0; //if flag is 1, start loop
float turbidity=0.0;//turbidity

int threshold = 2000; // threshold turbidity forsludge blanket

void setup() {
  //SETUP
  Serial.begin(9600); //Baud rate: 9600 
  pinMode(ledPin, OUTPUT);  //This is to set up the LED
  pinMode(turb_input, INPUT);  //This is to set up the turbidity input from sensor
  pinMode(button_input, INPUT);  //This is to set up the input from pushbutton

  //CALIBRATION   
  //set up so that the difference between the clear water turbidity
  //and the usual 0 turbidity value and set this as the constant offset 
  //as Hannah pointed out, this will also take care of the temp difference
  //(this will be used in the conversion)
  Serial.println('\n');
  Serial.println("Please calibrate the sensor by pressing the button");  //clear water calibration
  
  //PUSHBUTTON
  //set it up with a push button
  if (digitalRead(button_input)==LOW){ //don't remember if pushbutton high or low when pressed
    flag = 0;
  }
  else if(digitalRead(button_input) == HIGH){     //whole thing could possibly be moved into loop()
    offset = analogRead(turb_input);
    Serial.println('\n');
    Serial.print("this is the offset value:");   //but then get rid of flag=0
    Serial.println(offset);
    delay(500);
    flag = 1;
  }
  }


void loop() {

 // if (flag == 1){
    int sensorValue = analogRead(turb_input);// read the input on A0:

    // Convert the analog reading (which goes from 0 - 1023) to a voltage (0 - 5V):
    float voltage = sensorValue * (5.0 / 1024.0); 
    Serial.println("____________________________________");
    Serial.print("this is the reading from the analog:");
    Serial.println(sensorValue); // print out the value you read:
  
    
    Serial.print("this is the voltage reading:");
    Serial.println(voltage); // print out the value you read:
  

    // Convert voltage to turbidity
    // relation from page is -1120.4x^2 +5742.3x-4352.9
    if (voltage>2.5){
      turbidity = ((voltage*voltage)*(-1120.4))+(voltage*5742.3)-4352.9-(offset);
    }
    if (voltage<2.5){
      turbidity=3000;
   }

      Serial.print("this is the turbidity reading:");
      Serial.println(turbidity); // print out the value you read:
      delay(500);
      
    //threshold value to compare to light up LED
    if (turbidity > threshold){
      digitalWrite(ledPin, HIGH);
      Serial.println("YOU ARE NOW IN THE SLUDGE BLANKET");
   // }
      
    //later add breadboard stuff with display
  }
}


  

```

