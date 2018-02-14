This week we are working on the LED, training and possibly playing around with the turbidity sensors.

* Tuesday
Instead of making the LED, we are looking into buying a small flashlight that is waterproof/water resistant.
Also with the size of the flocc hopper, we need to rethink our entire plan.


```arduino
/*
 * THIS CODE IS FOR AGUACLARA SENSOR_DEV
 * This code's function is to take the input voltage from the turbidity sensor
 * and translate it into a numerical value representing turbidity
 */

int ledPin = 13;

void setup() {
  Serial.begin(9600); //Baud rate: 9600 (this is used for serialPrint)
  pinMode(ledPin, OUTPUT);  //This is to set up the LED
}

void loop() {
  int sensorValue = analogRead(A0);// read the input on analog pin 0:
  float voltage = sensorValue * (5.0 / 1024.0); // Convert the analog reading (which goes from 0 - 1023) to a voltage (0 - 5V):
  Serial.println("this is the voltage reading:");
  Serial.print(voltage); // print out the value you read:
  delay(500);
  Serial.println("converted turbidity:");

  //threshold value to compare to light up LED
}
```

**Displays**
  * We are talking about different displays to display the numerical value. 
  Hannah found a great display that's very affordable.
