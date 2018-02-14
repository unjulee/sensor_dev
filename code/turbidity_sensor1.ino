/*
 * THIS CODE IS FOR AGUACLARA SENSOR_DEV
 * This code's function is to take the input voltage from the turbidity sensor
 * and translate it into a 
 */

int ledPin = 13;

void setup() {
  Serial.begin(9600); //Baud rate: 9600 (this is used for serialPrint)
  pinMode(ledPin, OUTPUT);  //This is to set up the LED
}

void loop() {
  int sensorValue = analogRead(A0);// read the input on analog pin 0:
  float voltage = sensorValue * (5.0 / 1024.0); // Convert the analog reading (which goes from 0 - 1023) to a voltage (0 - 5V):
  Serial.println(voltage); // print out the value you read:
  delay(500);

  //threshold value to compare to light up LED
}
