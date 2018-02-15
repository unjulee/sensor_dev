/*
 * THIS CODE IS FOR AGUACLARA SENSOR_DEV
 * This code's function is to take the input voltage from the turbidity sensor
 * and translate it into a numerical value for turbidity
 */

int ledPin = 13;
int constant_offset=0;

void setup() {
  Serial.begin(9600); //Baud rate: 9600 (this is used for serialPrint)
  pinMode(ledPin, OUTPUT);  //This is to set up the LED
  Serial.println("Please calibrate the sensor by pressing the button");  //clear water calibration

  //set it up with a push button
  
  //set up so that the difference between the clear water turbidity
  //and the usual 0 turbidity value and set this as the constant offset
  //(this will be used in the conversion)

  Serial.println("this is the offset value");
  
}

void loop() {
  int sensorValue = analogRead(A0);// read the input on analog pin 0:

  // Convert the analog reading (which goes from 0 - 1023) to a voltage (0 - 5V):
  float voltage = sensorValue * (5.0 / 1024.0); 
  Serial.println("____________________________________");
  Serial.println("this is the voltage reading:");
  Serial.print(voltage); // print out the value you read:
  

  // Convert voltage to turbidity
 
  Serial.println("this is the turbidity reading:");
  Serial.print(voltage); // print out the value you read:

  delay(500);
  
  //threshold value to compare to light up LED
  //later add breadboard stuff with display
}
